package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Subject.
 */
@Document(indexName = "subject")
public class Subject implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String subjectCode;

	@NotNull
	private String subjectType;

	@NotNull
	private String subjectDesc;

	@NotNull
	private String status;

	@JsonIgnoreProperties("subjects")
	private Department department;

	@JsonIgnoreProperties("subjects")
	private Batch batch;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public Subject subjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
		return this;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public Subject subjectType(String subjectType) {
		this.subjectType = subjectType;
		return this;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getSubjectDesc() {
		return subjectDesc;
	}

	public Subject subjectDesc(String subjectDesc) {
		this.subjectDesc = subjectDesc;
		return this;
	}

	public void setSubjectDesc(String subjectDesc) {
		this.subjectDesc = subjectDesc;
	}

	public String getStatus() {
		return status;
	}

	public Subject status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Department getDepartment() {
		return department;
	}

	public Subject department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Batch getBatch() {
		return batch;
	}

	public Subject batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters
	// and setters here, do not remove

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Subject subject = (Subject) o;
		if (subject.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), subject.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Subject{" + "id=" + getId() + ", subjectCode='" + getSubjectCode() + "'"
				+ ", subjectType='" + getSubjectType() + "'" + ", subjectDesc='"
				+ getSubjectDesc() + "'" + ", status='" + getStatus() + "'" + "}";
	}
}
