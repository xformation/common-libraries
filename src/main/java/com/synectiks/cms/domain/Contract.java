package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Contract.
 */
@Document(indexName = "contract")
public class Contract implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String vendorName;

	@NotNull
	private String typeOfOwnerShip;

	@NotNull
	private String durationOfContract;

	@NotNull
	private LocalDate startDate;

	@NotNull
	private LocalDate endDate;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public Contract vendorName(String vendorName) {
		this.vendorName = vendorName;
		return this;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getTypeOfOwnerShip() {
		return typeOfOwnerShip;
	}

	public Contract typeOfOwnerShip(String typeOfOwnerShip) {
		this.typeOfOwnerShip = typeOfOwnerShip;
		return this;
	}

	public void setTypeOfOwnerShip(String typeOfOwnerShip) {
		this.typeOfOwnerShip = typeOfOwnerShip;
	}

	public String getDurationOfContract() {
		return durationOfContract;
	}

	public Contract durationOfContract(String durationOfContract) {
		this.durationOfContract = durationOfContract;
		return this;
	}

	public void setDurationOfContract(String durationOfContract) {
		this.durationOfContract = durationOfContract;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public Contract startDate(LocalDate startDate) {
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

	public Contract endDate(LocalDate endDate) {
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
		Contract contract = (Contract) o;
		if (contract.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), contract.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Contract{" + "id=" + getId() + ", vendorName='" + getVendorName() + "'"
				+ ", typeOfOwnerShip='" + getTypeOfOwnerShip() + "'"
				+ ", durationOfContract='" + getDurationOfContract() + "'"
				+ ", startDate='" + getStartDate() + "'" + ", endDate='" + getEndDate()
				+ "'" + "}";
	}
}
