package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.Size;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Notifications.
 */
@Document(indexName = "notifications")
public class Notifications implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	@Field(type = FieldType.Keyword)
	private Long id;

	private String messageCode;

	@Size(max = 2000)
	private String message;

	private String status;

	private String createdBy;

	private LocalDate createdOn;

	private String updatedBy;

	private LocalDate updatedOn;

	@JsonIgnoreProperties("notifications")
	private AcademicYear academicYear;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public Notifications messageCode(String messageCode) {
		this.messageCode = messageCode;
		return this;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public Notifications message(String message) {
		this.message = message;
		return this;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public Notifications status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Notifications createdBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public Notifications createdOn(LocalDate createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Notifications updatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public Notifications updatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public Notifications academicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
		return this;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters
	// and setters here, do not remove

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Notifications)) {
			return false;
		}
		return id != null && id.equals(((Notifications) o).id);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return "Notifications{" + "id=" + getId() + ", messageCode='" + getMessageCode()
				+ "'" + ", message='" + getMessage() + "'" + ", status='" + getStatus()
				+ "'" + ", createdBy='" + getCreatedBy() + "'" + ", createdOn='"
				+ getCreatedOn() + "'" + ", updatedBy='" + getUpdatedBy() + "'"
				+ ", updatedOn='" + getUpdatedOn() + "'" + "}";
	}
}
