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
 * Sample Policy:
 * <pre> * {
 *	"name": "policy-name",
 *	"description": "",
 *	"rules": [
 *		{
 *			"name": "rule-name",
 *			"entity": "entity-name",
 *			"description": "",
 *			"checks: [
 *				"key > 10",
 *				"key regex('^R.*esh$')",
 *				"key isNotEmpty",
 *				"key >= toDate('2018-08-15 13:20:30', 'yyyy-MM-dd HH:mm:ss')",
 *				"(root.node.key1 = value1 OR key2 = value2)",
 *				"(root.node.key1 = value1 OR key2 = value2) AND (root.node.key3 = value3)"
 *			]
 *		}
 *	]
 * }
 * </pre>
 * @author Rajesh
 */
@Entity
@Table(name = IDBConsts.Tbl_Policy)
public class Policy extends PSqlEntity {

	private static final long serialVersionUID = -6631676861385312561L;

	private String name;
	private String entity;
	private boolean searchable;
	@ElementCollection(targetClass = Long.class)
	private List<Long> rules;
	private String description;

	public Policy() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSearchable() {
		return searchable;
	}

	public void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Long> getRules() {
		return rules;
	}

	public void setRules(List<Long> rules) {
		this.rules = rules;
	}

	@Override
	public String toString() {
		return "{ \"id\": \"" + id + "\", "
				+ (name != null ? "\"name\": \"" + name + "\", " : "")
				+ (entity != null ? "\"entity\": \"" + entity + "\", " : "")
				+ ("\"searchable\": \"" + searchable + "\", ")
				+ (description != null ? "\"description\": \"" + description + "\", " : "")
				+ (rules != null ? "\"rules\": \"" + rules + "\"" : "") + "}";
	}

}
