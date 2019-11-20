package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Insurance.
 */
@Document(indexName = "insurance")
public class Insurance implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String insuranceCompany;

	@NotNull
	private String typeOfInsurance;

	@NotNull
	private LocalDate dateOfInsurance;

	@NotNull
	private LocalDate validTill;

	@JsonIgnore
	private Vehicle vehicle;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public Insurance insuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
		return this;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}

	public Insurance typeOfInsurance(String typeOfInsurance) {
		this.typeOfInsurance = typeOfInsurance;
		return this;
	}

	public void setTypeOfInsurance(String typeOfInsurance) {
		this.typeOfInsurance = typeOfInsurance;
	}

	public LocalDate getDateOfInsurance() {
		return dateOfInsurance;
	}

	public Insurance dateOfInsurance(LocalDate dateOfInsurance) {
		this.dateOfInsurance = dateOfInsurance;
		return this;
	}

	public void setDateOfInsurance(LocalDate dateOfInsurance) {
		this.dateOfInsurance = dateOfInsurance;
	}

	public void setDateOfInsurance(String date) {
		this.dateOfInsurance = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getValidTill() {
		return validTill;
	}

	public Insurance validTill(LocalDate validTill) {
		this.validTill = validTill;
		return this;
	}

	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	}

	public void setValidTill(String date) {
		this.validTill = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Insurance vehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		return this;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
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
		Insurance insurance = (Insurance) o;
		if (insurance.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), insurance.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Insurance{" + "id=" + getId() + ", insuranceCompany='"
				+ getInsuranceCompany() + "'" + ", typeOfInsurance='"
				+ getTypeOfInsurance() + "'" + ", dateOfInsurance='"
				+ getDateOfInsurance() + "'" + ", validTill='" + getValidTill() + "'"
				+ "}";
	}
}
