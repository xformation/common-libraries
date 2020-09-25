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
 * @author Rajesh
 */
@Entity
@Table(name = IDBConsts.Tbl_CLOUD_ACC)
public class CloudAccount extends PSqlEntity {

	private static final long serialVersionUID = 6032668071445564187L;

	private String cloudName;
	private String username;
	private String password;
	private String accessKey;
	private String secutiryKey;
	@ElementCollection(targetClass = String.class)
	private List<String> properties;

	public String getCloudName() {
		return cloudName;
	}

	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecutiryKey() {
		return secutiryKey;
	}

	public void setSecutiryKey(String secutiryKey) {
		this.secutiryKey = secutiryKey;
	}

	public List<String> getProperties() {
		return properties;
	}

	public void setProperties(List<String> properties) {
		this.properties = properties;
	}

}
