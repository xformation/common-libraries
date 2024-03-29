/**
 * 
 */
package com.synectiks.commons.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.synectiks.commons.constants.IDBConsts;

/**
 * Rule model
 * <pre>
 *	{
 *		"name": "rule-name",
 *		"entity": "entity-name",
 *		"searchable": true,
 *		"description": "",
 *		"checks": [
 *			"key > 10",
 *			"key regex('^R.*esh$')",
 *			"key isNotEmpty",
 *			"key >= toDate('2018-08-15 13:20:30', 'yyyy-MM-dd HH:mm:ss')",
 *			"(root.node.key1 = value1 OR key2 = value2)",
 *			"(root.node.key1 = value1 OR key2 = value2) AND (root.node.key3 = value3)"
 *		],
 *		"severity": "",,
 *		"logic": "",,
 *		"remediation": "",,
 *		"complianceTag": "",,
 *		"logicHash": "",,
 *		"category": "",,
 *		"ruleId": "",
 *	}
 * </pre>
 * @author Rajesh
 */
@Entity
@Table(name = IDBConsts.Tbl_Rule)
public class Rule extends PSqlEntity {

	private static final long serialVersionUID = 1971488567649802712L;

	private String name;
	private String entity;
	private boolean searchable;
	private String description;
	@ElementCollection(targetClass = String.class)
	private List<String> checks;
	private String severity;
	private String logic;
	private String remediation;
	private String complianceTag;
	private String logicHash;
	private String category;
	private String ruleId;

	public Rule() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public boolean isSearchable() {
		return searchable;
	}

	public void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getChecks() {
		return checks;
	}

	public void setChecks(List<String> checks) {
		this.checks = checks;
	}
	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getLogic() {
		return logic;
	}

	public void setLogic(String logic) {
		this.logic = logic;
	}

	public String getRemediation() {
		return remediation;
	}

	public void setRemediation(String remediation) {
		this.remediation = remediation;
	}

	public String getComplianceTag() {
		return complianceTag;
	}

	public void setComplianceTag(String complianceTag) {
		this.complianceTag = complianceTag;
	}

	public String getLogicHash() {
		return logicHash;
	}

	public void setLogicHash(String logicHash) {
		this.logicHash = logicHash;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	@Override
	public String toString() {
		return "{ \"id\": \"" + id + "\", "
				+ (name != null ? "\"name\": \"" + name + "\", " : "")
				+ (entity != null ? "\"entity\": \"" + entity + "\", " : "")
				+ ("\"searchable\": " + searchable + ", ")
				+ (description != null ? "\"description\": \"" + description + "\", " : "")
				+ ("\"severity\": \"" + severity + "\", ")
				+ ("\"logic\": \"" + logic + "\", ")
				+ ("\"remediation\": \"" + remediation + "\", ")
				+ ("\"complianceTag\": \"" + complianceTag + "\", ")
				+ ("\"logicHash\": \"" + logicHash + "\", ")
				+ ("\"searchable\": \"" + category + "\", ")
				+ ("\"searchable\": \"" + ruleId + "\", ")
				+ (checks != null ? "\"checks\": \"" + checks + "\"" : "") + "}";
	}

}
