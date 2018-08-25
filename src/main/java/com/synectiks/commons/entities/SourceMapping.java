/**
 * 
 */
package com.synectiks.commons.entities;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * @author Rajesh
 */
public class SourceMapping {

	public static JSONObject getSourceEntityMapping() {
		StringBuilder srcDynMap = new StringBuilder();
		srcDynMap.append("{");
		srcDynMap.append("	\"_timestamp\": {");
		srcDynMap.append("		\"enabled\": \"true\"");
		srcDynMap.append("	},");
		srcDynMap.append("	\"dynamic_templates\": [");
		srcDynMap.append(getNestedMapping());
		srcDynMap.append(", ");
		srcDynMap.append(getIdMappingSyntax());
		srcDynMap.append("	]");
		srcDynMap.append("}");
		JSONObject mappings = null;
		try {
			mappings = new JSONObject(srcDynMap.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return mappings;
	}

	private static String getNestedMapping() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("	\"nested_objects\": {");
		sb.append("		\"match_mapping_type\": \"object\",");
		sb.append("		\"mapping\": {");
		sb.append("			\"type\": \"nested\",");
		sb.append("			\"dynamic\": true");
		sb.append("		}");
		sb.append("	}");
		sb.append("}");
		return sb.toString();
	}

	private static String getIdMappingSyntax() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("	\"id_as_keywords\": {");
		sb.append("		\"match_mapping_type\": \"string\",");
		sb.append("		\"match_pattern\": \"regex\",");
		sb.append("		\"match\": \".*(id|Id|Ids|ID)$\",");
		sb.append("		\"mapping\": {");
		sb.append("			\"type\": \"string\",");
		sb.append("			\"index\": \"not_analyzed\",");
		sb.append("			\"ignore_above\": 256");
		sb.append("		}");
		sb.append("	}");
		sb.append("}");
		return sb.toString();
	}

}
