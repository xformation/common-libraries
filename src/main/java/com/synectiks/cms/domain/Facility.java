package com.synectiks.cms.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Facility.
 */
@Document(indexName = "facility")
public class Facility implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String name;

	@NotNull
	private String status;

	private LocalDate startDate;

	private LocalDate endDate;

	private LocalDate suspandStartDate;

	private LocalDate suspandEndDate;

	@JsonIgnoreProperties("")
	private AcademicYear academicYear;

	@JsonIgnoreProperties("")
	private Branch branch;

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

	public Facility name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public Facility status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public Facility startDate(LocalDate startDate) {
		this.startDate = startDate;
		return this;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setStartDate(String date) {
		this.startDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public Facility endDate(LocalDate endDate) {
		this.endDate = endDate;
		return this;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setEndDate(String date) {
		this.endDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getSuspandStartDate() {
		return suspandStartDate;
	}

	public Facility suspandStartDate(LocalDate suspandStartDate) {
		this.suspandStartDate = suspandStartDate;
		return this;
	}

	public void setSuspandStartDate(LocalDate suspandStartDate) {
		this.suspandStartDate = suspandStartDate;
	}

	public void setSuspandStartDate(String date) {
		this.suspandStartDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getSuspandEndDate() {
		return suspandEndDate;
	}

	public Facility suspandEndDate(LocalDate suspandEndDate) {
		this.suspandEndDate = suspandEndDate;
		return this;
	}

	public void setSuspandEndDate(LocalDate suspandEndDate) {
		this.suspandEndDate = suspandEndDate;
	}

	public void setSuspandEndDate(String date) {
		this.suspandEndDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public Facility academicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
		return this;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}

	public Branch getBranch() {
		return branch;
	}

	public Facility branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
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
		Facility facility = (Facility) o;
		if (facility.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), facility.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Facility{" + "id=" + getId() + ", name='" + getName() + "'" + ", status='"
				+ getStatus() + "'" + ", startDate='" + getStartDate() + "'"
				+ ", endDate='" + getEndDate() + "'" + ", suspandStartDate='"
				+ getSuspandStartDate() + "'" + ", suspandEndDate='" + getSuspandEndDate()
				+ "'" + "}";
	}
}
