/**
 * 
 */
package com.synectiks.commons.entities;

import java.util.List;
import java.util.Map;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONTokener;
import org.springframework.data.elasticsearch.annotations.Document;

import com.synectiks.commons.constants.IConsts;
import com.synectiks.commons.interfaces.IESEntity;
import com.synectiks.commons.utils.IUtils;

/**
 * @author Rajesh
 */
@Document(indexName = IConsts.INDX_SOURCE, type = IConsts.INDX_TYPE_SOURCE)
public class SourceEntity extends JSONObject implements IESEntity {

	private static final long serialVersionUID = -5770475294354519568L;

	/**
	 * Method to get the key names array from json object. 
	 * @param object
	 * @return
	 */
	private static String[] getNames(Object object) {
		String[] names = new String[0];
		if (!IUtils.isNull(object)) {
			if (object instanceof JSONObject) {
				JSONObject obj = (JSONObject) object;
				JSONArray arr = obj.names();
				names = new String[arr.length()];
				for (int i = 0; i < arr.length(); i++) {
					names[i] = arr.optString(i);
				}
			}
		}
		return names;
	}

	public SourceEntity(boolean dropRootElement, List<Object> ignoredElements,
			boolean writeNullAsString, boolean escapeForwardSlash) {
		super(dropRootElement, ignoredElements, writeNullAsString, escapeForwardSlash);
	}

	public SourceEntity(JSONObject jo, String[] sa) throws JSONException {
		super(jo, sa);
	}

	public SourceEntity(JSONTokener x) throws JSONException {
		super(x);
	}

	public SourceEntity(List<Object> ignoredElements) {
		super(ignoredElements);
	}

	public SourceEntity(Map<String, Object> map) {
		super(map);
	}

	public SourceEntity(Object object) {
		super(object, getNames(object));
	}

	public SourceEntity(Object object, String[] names) {
		super(object, names);
	}

	public SourceEntity(String string) throws JSONException {
		super(string);
	}

}
