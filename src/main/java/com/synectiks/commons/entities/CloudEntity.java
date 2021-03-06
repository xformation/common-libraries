/**
 * 
 */
package com.synectiks.commons.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.synectiks.commons.constants.IDBConsts;

/**
 * @author Rajesh
 */
@Entity
@Table(name = IDBConsts.Tbl_CLOUD_ENTITY,
		uniqueConstraints={@UniqueConstraint(
				columnNames = {"cloudName" , "groupName", "entity"})})
public class CloudEntity extends PSqlEntity {

	private static final long serialVersionUID = 6032668071445564187L;

	private String cloudName;
	private String groupName;
	private String entity;

	public String getCloudName() {
		return cloudName;
	}

	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

}
