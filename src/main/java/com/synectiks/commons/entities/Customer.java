/**
 * 
 */
package com.synectiks.commons.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.synectiks.commons.constants.IDBConsts;

/**
 * @author Rajesh
 */
@Entity
@Table(name = IDBConsts.Tbl_CUSTOMER)
public class Customer extends PSqlEntity {

	private static final long serialVersionUID = -3344864366401287649L;

	private String name;
	private String username;
	private String password;
	private String email;
	private String mobile;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private List<CloudAccount> accounts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<CloudAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<CloudAccount> accounts) {
		this.accounts = accounts;
	}

}
