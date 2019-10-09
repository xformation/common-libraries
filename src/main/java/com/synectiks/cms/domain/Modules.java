package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Modules.
 */
@Document(indexName = "modules")
public class Modules implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	@Field(type = FieldType.Keyword)
	private Long id;

	private String moduleName;

	private String subModuleName;

	private String url;

	private String status;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModuleName() {
		return moduleName;
	}

	public Modules moduleName(String moduleName) {
		this.moduleName = moduleName;
		return this;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getSubModuleName() {
		return subModuleName;
	}

	public Modules subModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
		return this;
	}

	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}

	public String getUrl() {
		return url;
	}

	public Modules url(String url) {
		this.url = url;
		return this;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}

	public Modules status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters
	// and setters here, do not remove

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Modules)) {
			return false;
		}
		return id != null && id.equals(((Modules) o).id);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return "Modules{" + "id=" + getId() + ", moduleName='" + getModuleName() + "'"
				+ ", subModuleName='" + getSubModuleName() + "'" + ", url='" + getUrl()
				+ "'" + ", status='" + getStatus() + "'" + "}";
	}
}
