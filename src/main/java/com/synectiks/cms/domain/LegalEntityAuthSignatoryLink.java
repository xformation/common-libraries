package com.synectiks.cms.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A LegalEntityAuthSignatoryLink entity. This will display records of legal
 * entity and authorized signatory tables.
 */
@Document(indexName = "legalentity")
public class LegalEntityAuthSignatoryLink implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private Long logo;

	@NotNull
	private String legalNameOfTheCollege;

	@NotNull
	private String typeOfCollege;

	@NotNull
	private LocalDate dateOfIncorporation;

	@NotNull
	private String registeredOfficeAddress;

	@NotNull
	private String collegeIdentificationNumber;

	@NotNull
	private String pan;

	@NotNull
	private String tan;

	@NotNull
	private String tanCircleNumber;

	@NotNull
	private String citTdsLocation;

	@NotNull
	private Long formSignatory;

	@NotNull
	private String pfNumber;

	@NotNull
	private LocalDate pfRegistrationDate;

	@NotNull
	private Long pfSignatory;

	@NotNull
	private Long esiNumber;

	@NotNull
	private LocalDate esiRegistrationDate;

	@NotNull
	private Long esiSignatory;

	@NotNull
	private Long ptNumber;

	@NotNull
	private LocalDate ptRegistrationDate;

	@NotNull
	private Long ptSignatory;

	@JsonIgnoreProperties("")
	private Branch branch;

	@JsonIgnoreProperties("")
	private College college;

	@JsonIgnoreProperties("")
	private Location location;

	private AuthorizedSignatory authorizedFormSignatory;

	private AuthorizedSignatory authorizedPfSignatory;

	private AuthorizedSignatory authorizedEsiSignatory;

	private AuthorizedSignatory authorizedPtSignatory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLogo() {
		return logo;
	}

	public LegalEntityAuthSignatoryLink logo(Long logo) {
		this.logo = logo;
		return this;
	}

	public void setLogo(Long logo) {
		this.logo = logo;
	}

	public String getLegalNameOfTheCollege() {
		return legalNameOfTheCollege;
	}

	public LegalEntityAuthSignatoryLink legalNameOfTheCollege(
			String legalNameOfTheCollege) {
		this.legalNameOfTheCollege = legalNameOfTheCollege;
		return this;
	}

	public void setLegalNameOfTheCollege(String legalNameOfTheCollege) {
		this.legalNameOfTheCollege = legalNameOfTheCollege;
	}

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public LegalEntityAuthSignatoryLink typeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
		return this;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}

	public LocalDate getDateOfIncorporation() {
		return dateOfIncorporation;
	}

	public LegalEntityAuthSignatoryLink dateOfIncorporation(
			LocalDate dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
		return this;
	}

	public void setDateOfIncorporation(LocalDate dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}

	public String getRegisteredOfficeAddress() {
		return registeredOfficeAddress;
	}

	public LegalEntityAuthSignatoryLink registeredOfficeAddress(
			String registeredOfficeAddress) {
		this.registeredOfficeAddress = registeredOfficeAddress;
		return this;
	}

	public void setRegisteredOfficeAddress(String registeredOfficeAddress) {
		this.registeredOfficeAddress = registeredOfficeAddress;
	}

	public String getCollegeIdentificationNumber() {
		return collegeIdentificationNumber;
	}

	public LegalEntityAuthSignatoryLink collegeIdentificationNumber(
			String collegeIdentificationNumber) {
		this.collegeIdentificationNumber = collegeIdentificationNumber;
		return this;
	}

	public void setCollegeIdentificationNumber(String collegeIdentificationNumber) {
		this.collegeIdentificationNumber = collegeIdentificationNumber;
	}

	public String getPan() {
		return pan;
	}

	public LegalEntityAuthSignatoryLink pan(String pan) {
		this.pan = pan;
		return this;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getTan() {
		return tan;
	}

	public LegalEntityAuthSignatoryLink tan(String tan) {
		this.tan = tan;
		return this;
	}

	public void setTan(String tan) {
		this.tan = tan;
	}

	public String getTanCircleNumber() {
		return tanCircleNumber;
	}

	public LegalEntityAuthSignatoryLink tanCircleNumber(String tanCircleNumber) {
		this.tanCircleNumber = tanCircleNumber;
		return this;
	}

	public void setTanCircleNumber(String tanCircleNumber) {
		this.tanCircleNumber = tanCircleNumber;
	}

	public String getCitTdsLocation() {
		return citTdsLocation;
	}

	public LegalEntityAuthSignatoryLink citTdsLocation(String citTdsLocation) {
		this.citTdsLocation = citTdsLocation;
		return this;
	}

	public void setCitTdsLocation(String citTdsLocation) {
		this.citTdsLocation = citTdsLocation;
	}

	public Long getFormSignatory() {
		return formSignatory;
	}

	public LegalEntityAuthSignatoryLink formSignatory(Long formSignatory) {
		this.formSignatory = formSignatory;
		return this;
	}

	public void setFormSignatory(Long formSignatory) {
		this.formSignatory = formSignatory;
	}

	public String getPfNumber() {
		return pfNumber;
	}

	public LegalEntityAuthSignatoryLink pfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
		return this;
	}

	public void setPfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
	}

	public LocalDate getPfRegistrationDate() {
		return pfRegistrationDate;
	}

	public LegalEntityAuthSignatoryLink pfRegistrationDate(LocalDate pfRegistrationDate) {
		this.pfRegistrationDate = pfRegistrationDate;
		return this;
	}

	public void setPfRegistrationDate(LocalDate pfRegistrationDate) {
		this.pfRegistrationDate = pfRegistrationDate;
	}

	public Long getPfSignatory() {
		return pfSignatory;
	}

	public LegalEntityAuthSignatoryLink pfSignatory(Long pfSignatory) {
		this.pfSignatory = pfSignatory;
		return this;
	}

	public void setPfSignatory(Long pfSignatory) {
		this.pfSignatory = pfSignatory;
	}

	public Long getEsiNumber() {
		return esiNumber;
	}

	public LegalEntityAuthSignatoryLink esiNumber(Long esiNumber) {
		this.esiNumber = esiNumber;
		return this;
	}

	public void setEsiNumber(Long esiNumber) {
		this.esiNumber = esiNumber;
	}

	public LocalDate getEsiRegistrationDate() {
		return esiRegistrationDate;
	}

	public LegalEntityAuthSignatoryLink esiRegistrationDate(
			LocalDate esiRegistrationDate) {
		this.esiRegistrationDate = esiRegistrationDate;
		return this;
	}

	public void setEsiRegistrationDate(LocalDate esiRegistrationDate) {
		this.esiRegistrationDate = esiRegistrationDate;
	}

	public Long getEsiSignatory() {
		return esiSignatory;
	}

	public LegalEntityAuthSignatoryLink esiSignatory(Long esiSignatory) {
		this.esiSignatory = esiSignatory;
		return this;
	}

	public void setEsiSignatory(Long esiSignatory) {
		this.esiSignatory = esiSignatory;
	}

	public Long getPtNumber() {
		return ptNumber;
	}

	public LegalEntityAuthSignatoryLink ptNumber(Long ptNumber) {
		this.ptNumber = ptNumber;
		return this;
	}

	public void setPtNumber(Long ptNumber) {
		this.ptNumber = ptNumber;
	}

	public LocalDate getPtRegistrationDate() {
		return ptRegistrationDate;
	}

	public LegalEntityAuthSignatoryLink ptRegistrationDate(LocalDate ptRegistrationDate) {
		this.ptRegistrationDate = ptRegistrationDate;
		return this;
	}

	public void setPtRegistrationDate(LocalDate ptRegistrationDate) {
		this.ptRegistrationDate = ptRegistrationDate;
	}

	public Long getPtSignatory() {
		return ptSignatory;
	}

	public LegalEntityAuthSignatoryLink ptSignatory(Long ptSignatory) {
		this.ptSignatory = ptSignatory;
		return this;
	}

	public void setPtSignatory(Long ptSignatory) {
		this.ptSignatory = ptSignatory;
	}

	public Branch getBranch() {
		return branch;
	}

	public LegalEntityAuthSignatoryLink branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public College getCollege() {
		return college;
	}

	public LegalEntityAuthSignatoryLink college(College college) {
		this.college = college;
		return this;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Location getLocation() {
		return location;
	}

	public LegalEntityAuthSignatoryLink location(Location location) {
		this.location = location;
		return this;
	}

	public void setLocation(Location location) {
		this.location = location;
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
		LegalEntityAuthSignatoryLink legalEntity = (LegalEntityAuthSignatoryLink) o;
		if (legalEntity.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), legalEntity.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	public AuthorizedSignatory getAuthorizedFormSignatory() {
		return authorizedFormSignatory;
	}

	public void setAuthorizedFormSignatory(AuthorizedSignatory authorizedFormSignatory) {
		this.authorizedFormSignatory = authorizedFormSignatory;
	}

	public AuthorizedSignatory getAuthorizedPfSignatory() {
		return authorizedPfSignatory;
	}

	public void setAuthorizedPfSignatory(AuthorizedSignatory authorizedPfSignatory) {
		this.authorizedPfSignatory = authorizedPfSignatory;
	}

	public AuthorizedSignatory getAuthorizedEsiSignatory() {
		return authorizedEsiSignatory;
	}

	public void setAuthorizedEsiSignatory(AuthorizedSignatory authorizedEsiSignatory) {
		this.authorizedEsiSignatory = authorizedEsiSignatory;
	}

	public AuthorizedSignatory getAuthorizedPtSignatory() {
		return authorizedPtSignatory;
	}

	public void setAuthorizedPtSignatory(AuthorizedSignatory authorizedPtSignatory) {
		this.authorizedPtSignatory = authorizedPtSignatory;
	}

	@Override
	public String toString() {
		return "LegalEntityAuthSignatoryLink [id=" + id + ", logo=" + logo
				+ ", legalNameOfTheCollege=" + legalNameOfTheCollege + ", typeOfCollege="
				+ typeOfCollege + ", dateOfIncorporation=" + dateOfIncorporation
				+ ", registeredOfficeAddress=" + registeredOfficeAddress
				+ ", collegeIdentificationNumber=" + collegeIdentificationNumber
				+ ", pan=" + pan + ", tan=" + tan + ", tanCircleNumber=" + tanCircleNumber
				+ ", citTdsLocation=" + citTdsLocation + ", formSignatory="
				+ formSignatory + ", pfNumber=" + pfNumber + ", pfRegistrationDate="
				+ pfRegistrationDate + ", pfSignatory=" + pfSignatory + ", esiNumber="
				+ esiNumber + ", esiRegistrationDate=" + esiRegistrationDate
				+ ", esiSignatory=" + esiSignatory + ", ptNumber=" + ptNumber
				+ ", ptRegistrationDate=" + ptRegistrationDate + ", ptSignatory="
				+ ptSignatory + ", branch=" + branch + ", college=" + college
				+ ", location=" + location + ", authorizedFormSignatory="
				+ authorizedFormSignatory + ", authorizedPfSignatory="
				+ authorizedPfSignatory + ", authorizedEsiSignatory="
				+ authorizedEsiSignatory + ", authorizedPtSignatory="
				+ authorizedPtSignatory + "]";
	}
}
