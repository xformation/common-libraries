package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A FeeCategory.
 */
@Document(indexName = "feecategory")
public class FeeCategory implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String categoryName;

	@NotNull
	private String description;

	@NotNull
	private String status;

	private String createdBy;

	private LocalDate createdOn;

	private String updatedBy;

	private LocalDate updatedOn;

	private LocalDate startDate;

	private LocalDate endDate;

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

	public String getCategoryName() {
		return categoryName;
	}

	public FeeCategory categoryName(String categoryName) {
		this.categoryName = categoryName;
		return this;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public FeeCategory description(String description) {
		this.description = description;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public FeeCategory status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public FeeCategory createdBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public FeeCategory createdOn(LocalDate createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public void setCreatedOn(String date) {
		this.createdOn = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public FeeCategory updatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public FeeCategory updatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public void setUpdatedOn(String date) {
		this.updatedOn = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public FeeCategory startDate(LocalDate startDate) {
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

	public FeeCategory endDate(LocalDate endDate) {
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

	public Branch getBranch() {
		return branch;
	}

	public FeeCategory branch(Branch branch) {
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
		FeeCategory feeCategory = (FeeCategory) o;
		if (feeCategory.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), feeCategory.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "FeeCategory{" + "id=" + getId() + ", categoryName='" + getCategoryName()
				+ "'" + ", description='" + getDescription() + "'" + ", status='"
				+ getStatus() + "'" + ", createdBy='" + getCreatedBy() + "'"
				+ ", createdOn='" + getCreatedOn() + "'" + ", updatedBy='"
				+ getUpdatedBy() + "'" + ", updatedOn='" + getUpdatedOn() + "'"
				+ ", startDate='" + getStartDate() + "'" + ", endDate='" + getEndDate()
				+ "'" + "}";
	}
}
