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
 * A FeeDetails.
 */
@Document(indexName = "feedetails")
public class FeeDetails implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String feeParticularsName;

	@NotNull
	private String feeParticularDesc;

	private String studentType;

	private String gender;

	private Float amount;

	private String status;

	private String createdBy;

	private LocalDate createdOn;

	private String updatedBy;

	private LocalDate updatedOn;

	private LocalDate startDate;

	private LocalDate endDate;

	@JsonIgnoreProperties("")
	private FeeCategory feeCategory;

	@JsonIgnoreProperties("")
	private Batch batch;

	@JsonIgnoreProperties("")
	private Facility facility;

	@JsonIgnoreProperties("")
	private TransportRoute transportRoute;

	@JsonIgnoreProperties("")
	private Department department;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFeeParticularsName() {
		return feeParticularsName;
	}

	public FeeDetails feeParticularsName(String feeParticularsName) {
		this.feeParticularsName = feeParticularsName;
		return this;
	}

	public void setFeeParticularsName(String feeParticularsName) {
		this.feeParticularsName = feeParticularsName;
	}

	public String getFeeParticularDesc() {
		return feeParticularDesc;
	}

	public FeeDetails feeParticularDesc(String feeParticularDesc) {
		this.feeParticularDesc = feeParticularDesc;
		return this;
	}

	public void setFeeParticularDesc(String feeParticularDesc) {
		this.feeParticularDesc = feeParticularDesc;
	}

	public String getStudentType() {
		return studentType;
	}

	public FeeDetails studentType(String studentType) {
		this.studentType = studentType;
		return this;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public String getGender() {
		return gender;
	}

	public FeeDetails gender(String gender) {
		this.gender = gender;
		return this;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Float getAmount() {
		return amount;
	}

	public FeeDetails amount(Float amount) {
		this.amount = amount;
		return this;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public FeeDetails status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public FeeDetails createdBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public FeeDetails createdOn(LocalDate createdOn) {
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

	public FeeDetails updatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public FeeDetails updatedOn(LocalDate updatedOn) {
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

	public FeeDetails startDate(LocalDate startDate) {
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

	public FeeDetails endDate(LocalDate endDate) {
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

	public FeeCategory getFeeCategory() {
		return feeCategory;
	}

	public FeeDetails feeCategory(FeeCategory feeCategory) {
		this.feeCategory = feeCategory;
		return this;
	}

	public void setFeeCategory(FeeCategory feeCategory) {
		this.feeCategory = feeCategory;
	}

	public Batch getBatch() {
		return batch;
	}

	public FeeDetails batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Facility getFacility() {
		return facility;
	}

	public FeeDetails facility(Facility facility) {
		this.facility = facility;
		return this;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public TransportRoute getTransportRoute() {
		return transportRoute;
	}

	public FeeDetails transportRoute(TransportRoute transportRoute) {
		this.transportRoute = transportRoute;
		return this;
	}

	public void setTransportRoute(TransportRoute transportRoute) {
		this.transportRoute = transportRoute;
	}

	public Department getDepartment() {
		return department;
	}

	public FeeDetails department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
		FeeDetails feeDetails = (FeeDetails) o;
		if (feeDetails.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), feeDetails.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "FeeDetails{" + "id=" + getId() + ", feeParticularsName='"
				+ getFeeParticularsName() + "'" + ", feeParticularDesc='"
				+ getFeeParticularDesc() + "'" + ", studentType='" + getStudentType()
				+ "'" + ", gender='" + getGender() + "'" + ", amount=" + getAmount()
				+ ", status='" + getStatus() + "'" + ", createdBy='" + getCreatedBy()
				+ "'" + ", createdOn='" + getCreatedOn() + "'" + ", updatedBy='"
				+ getUpdatedBy() + "'" + ", updatedOn='" + getUpdatedOn() + "'"
				+ ", startDate='" + getStartDate() + "'" + ", endDate='" + getEndDate()
				+ "'" + "}";
	}
}
