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

	public static String[] dtFormats = {
			"yyyyMMdd",
			"yyyyMMddHHmmss",
			"yyyyMMddHHmmssZ",
			"yyyy-MM-dd",
			"yyyy-MM-dd HH:mm:ss.SSSZ",
			"yyyy-MM-dd HH:mm:ss.SSS",
			"yyyy-MM-dd HH:mm:ss",
			"dd-MM-yyyy",
			"dd-MM-yyyy HH:mm:ss.SSSZ",
			"dd-MM-yyyy HH:mm:ss.SSS",
			"dd-MM-yyyy HH:mm:ss",
			"yyyy/MM/dd",
			"yyyy/MM/dd HH:mm:ss.SSSZ",
			"yyyy/MM/dd HH:mm:ss.SSS",
			"yyyy/MM/dd HH:mm:ss",
			"dd/MM/yyyy",
			"dd/MM/yyyy HH:mm:ss.SSSZ",
			"dd/MM/yyyy HH:mm:ss.SSS",
			"dd/MM/yyyy HH:mm:ss",
			"MMM dd, yyyy",
			"MMM dd, yyyy HH:mm:ss"
	};

	public static JSONObject getSourceEntityMapping() {
		StringBuilder srcDynMap = new StringBuilder();
		srcDynMap.append("{");
		srcDynMap.append("	" + getDynamicDateFormats() + ", ");
		srcDynMap.append("\"dynamic_templates\": [");
		srcDynMap.append(getNestedMapping());
		srcDynMap.append(", ");
		srcDynMap.append(getIdMappingSyntax());
		srcDynMap.append(", ");
		srcDynMap.append(getDateMappingSyntax());
		srcDynMap.append(", ");
		srcDynMap.append(getStringMappingSyntax());
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

	private static String getDynamicDateFormats() {
		StringBuilder sb = new StringBuilder();
		sb.append("\"dynamic_date_formats\": [ ");
		sb.append(getDFs(", ", true));
		sb.append("]");
		return sb.toString();
	}

	private static String getDFs(String sep, boolean quotes) {
		StringBuilder sb = new StringBuilder();
		boolean bFrst = true;
		for (String df : dtFormats) {
			if (bFrst) {
				bFrst = false;
			} else {
				sb.append(sep);
			}
			sb.append((quotes) ? "\"" + df + "\"": df);
		}
		return sb.toString();
	}

	private static String getDateMappingSyntax() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("	\"dates_ignore_malformed\": {");
		sb.append("		\"match_mapping_type\": \"date\",");
		sb.append("		\"match_pattern\": \"regex\",");
		sb.append("		\"path_match\": \".*(\\.)?.*\",");
		sb.append("		\"mapping\": {");
		sb.append("			\"type\": \"date\",");
		sb.append("			\"ignore_malformed\": true");
		sb.append("		}");
		sb.append("	}");
		sb.append("}");
		return sb.toString();
	}

	private static String getStringMappingSyntax() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("	\"strings_ignore_malformed\": {");
		sb.append("		\"match_mapping_type\": \"string\",");
		sb.append("		\"match_pattern\": \"regex\",");
		sb.append("		\"path_match\": \".*(\\.)?.*(date|Date|_at|_At|_AT|dob|DOB|Dob)$\",");
		sb.append("		\"mapping\": {");
		sb.append("			\"type\": \"date\",");
		sb.append("			\"ignore_malformed\": true");
		sb.append("		}");
		sb.append("	}");
		sb.append("}");
		return sb.toString();
	}

	private static String getNestedMapping() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("	\"nested_objects\": {");
		sb.append("		\"match_mapping_type\": \"object\",");
		sb.append("		\"mapping\": {");
		sb.append("			\"type\": \"nested\",");
		sb.append("			\"dynamic\": true,");
		sb.append("			\"date_detection\": true");
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
		sb.append("		\"match\": \".*(\\.)?.*(id|Id|Ids|ID)$\",");
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
