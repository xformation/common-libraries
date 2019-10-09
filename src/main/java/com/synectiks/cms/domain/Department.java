package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Department.
 */
@Document(indexName = "department")
public class Department implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String name;

	@NotNull
	private String description;

	@NotNull
	private String deptHead;

	@JsonIgnoreProperties("departments")
	private Branch branch;

	@JsonIgnoreProperties("departments")
	private AcademicYear academicyear;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Department name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public Department description(String description) {
		this.description = description;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeptHead() {
		return deptHead;
	}

	public Department deptHead(String deptHead) {
		this.deptHead = deptHead;
		return this;
	}

	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

	public Branch getBranch() {
		return branch;
	}

	public Department branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public AcademicYear getAcademicyear() {
		return academicyear;
	}

	public Department academicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
		return this;
	}

	public void setAcademicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
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
		Department department = (Department) o;
		if (department.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), department.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Department{" + "id=" + getId() + ", name='" + getName() + "'"
				+ ", description='" + getDescription() + "'" + ", deptHead='"
				+ getDeptHead() + "'" + "}";
	}
}
