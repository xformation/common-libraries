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
 * A Holiday.
 */
@Document(indexName = "holiday")
public class Holiday implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String holidayDesc;

	@NotNull
	private LocalDate holidayDate;

	@NotNull
	private String holidayStatus;

	@JsonIgnoreProperties("holidays")
	private AcademicYear academicyear;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHolidayDesc() {
		return holidayDesc;
	}

	public Holiday holidayDesc(String holidayDesc) {
		this.holidayDesc = holidayDesc;
		return this;
	}

	public void setHolidayDesc(String holidayDesc) {
		this.holidayDesc = holidayDesc;
	}

	public LocalDate getHolidayDate() {
		return holidayDate;
	}

	public Holiday holidayDate(LocalDate holidayDate) {
		this.holidayDate = holidayDate;
		return this;
	}

	public void setHolidayDate(LocalDate holidayDate) {
		this.holidayDate = holidayDate;
	}

	public void setHolidayDate(String date) {
		this.holidayDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getHolidayStatus() {
		return holidayStatus;
	}

	public Holiday holidayStatus(String holidayStatus) {
		this.holidayStatus = holidayStatus;
		return this;
	}

	public void setHolidayStatus(String holidayStatus) {
		this.holidayStatus = holidayStatus;
	}

	public AcademicYear getAcademicyear() {
		return academicyear;
	}

	public Holiday academicyear(AcademicYear academicYear) {
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
		Holiday holiday = (Holiday) o;
		if (holiday.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), holiday.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Holiday{" + "id=" + getId() + ", holidayDesc='" + getHolidayDesc() + "'"
				+ ", holidayDate='" + getHolidayDate() + "'" + ", holidayStatus='"
				+ getHolidayStatus() + "'" + "}";
	}
}
