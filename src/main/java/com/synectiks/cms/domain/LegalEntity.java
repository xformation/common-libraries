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
 * A LegalEntity.
 */
@Document(indexName = "legalentity")
public class LegalEntity implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String logoPath;

	private String logoFileName;

	private String logoFile;

	@NotNull
	private String legalNameOfTheCollege;

	@NotNull
	private String typeOfCollege;

	@NotNull
	private LocalDate dateOfIncorporation;

	@NotNull
	private String registeredOfficeAddress1;

	private String registeredOfficeAddress2;

	private String registeredOfficeAddress3;

	private String registeredOfficeAddress4;

	private String registeredOfficeAddress5;

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
	private String esiNumber;

	@NotNull
	private LocalDate esiRegistrationDate;

	@NotNull
	private Long esiSignatory;

	@NotNull
	private String ptNumber;

	@NotNull
	private LocalDate ptRegistrationDate;

	@NotNull
	private Long ptSignatory;

	@JsonIgnoreProperties("legalEntities")
	private Branch branch;

	@JsonIgnoreProperties("legalEntities")
	private College college;

	@JsonIgnoreProperties("legalEntities")
	private State state;

	@JsonIgnoreProperties("legalEntities")
	private City city;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public LegalEntity logoPath(String logoPath) {
		this.logoPath = logoPath;
		return this;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public String getLogoFileName() {
		return logoFileName;
	}

	public LegalEntity logoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
		return this;
	}

	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
	}

	public String getLogoFile() {
		return logoFile;
	}

	public LegalEntity logoFile(String logoFile) {
		this.logoFile = logoFile;
		return this;
	}

	public void setLogoFile(String logoFile) {
		this.logoFile = logoFile;
	}

	public String getLegalNameOfTheCollege() {
		return legalNameOfTheCollege;
	}

	public LegalEntity legalNameOfTheCollege(String legalNameOfTheCollege) {
		this.legalNameOfTheCollege = legalNameOfTheCollege;
		return this;
	}

	public void setLegalNameOfTheCollege(String legalNameOfTheCollege) {
		this.legalNameOfTheCollege = legalNameOfTheCollege;
	}

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public LegalEntity typeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
		return this;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}

	public LocalDate getDateOfIncorporation() {
		return dateOfIncorporation;
	}

	public LegalEntity dateOfIncorporation(LocalDate dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
		return this;
	}

	public void setDateOfIncorporation(LocalDate dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}

	public void setDateOfIncorporation(String date) {
		this.dateOfIncorporation = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getRegisteredOfficeAddress1() {
		return registeredOfficeAddress1;
	}

	public LegalEntity registeredOfficeAddress1(String registeredOfficeAddress1) {
		this.registeredOfficeAddress1 = registeredOfficeAddress1;
		return this;
	}

	public void setRegisteredOfficeAddress1(String registeredOfficeAddress1) {
		this.registeredOfficeAddress1 = registeredOfficeAddress1;
	}

	public String getRegisteredOfficeAddress2() {
		return registeredOfficeAddress2;
	}

	public LegalEntity registeredOfficeAddress2(String registeredOfficeAddress2) {
		this.registeredOfficeAddress2 = registeredOfficeAddress2;
		return this;
	}

	public void setRegisteredOfficeAddress2(String registeredOfficeAddress2) {
		this.registeredOfficeAddress2 = registeredOfficeAddress2;
	}

	public String getRegisteredOfficeAddress3() {
		return registeredOfficeAddress3;
	}

	public LegalEntity registeredOfficeAddress3(String registeredOfficeAddress3) {
		this.registeredOfficeAddress3 = registeredOfficeAddress3;
		return this;
	}

	public void setRegisteredOfficeAddress3(String registeredOfficeAddress3) {
		this.registeredOfficeAddress3 = registeredOfficeAddress3;
	}

	public String getRegisteredOfficeAddress4() {
		return registeredOfficeAddress4;
	}

	public LegalEntity registeredOfficeAddress4(String registeredOfficeAddress4) {
		this.registeredOfficeAddress4 = registeredOfficeAddress4;
		return this;
	}

	public void setRegisteredOfficeAddress4(String registeredOfficeAddress4) {
		this.registeredOfficeAddress4 = registeredOfficeAddress4;
	}

	public String getRegisteredOfficeAddress5() {
		return registeredOfficeAddress5;
	}

	public LegalEntity registeredOfficeAddress5(String registeredOfficeAddress5) {
		this.registeredOfficeAddress5 = registeredOfficeAddress5;
		return this;
	}

	public void setRegisteredOfficeAddress5(String registeredOfficeAddress5) {
		this.registeredOfficeAddress5 = registeredOfficeAddress5;
	}

	public String getCollegeIdentificationNumber() {
		return collegeIdentificationNumber;
	}

	public LegalEntity collegeIdentificationNumber(String collegeIdentificationNumber) {
		this.collegeIdentificationNumber = collegeIdentificationNumber;
		return this;
	}

	public void setCollegeIdentificationNumber(String collegeIdentificationNumber) {
		this.collegeIdentificationNumber = collegeIdentificationNumber;
	}

	public String getPan() {
		return pan;
	}

	public LegalEntity pan(String pan) {
		this.pan = pan;
		return this;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getTan() {
		return tan;
	}

	public LegalEntity tan(String tan) {
		this.tan = tan;
		return this;
	}

	public void setTan(String tan) {
		this.tan = tan;
	}

	public String getTanCircleNumber() {
		return tanCircleNumber;
	}

	public LegalEntity tanCircleNumber(String tanCircleNumber) {
		this.tanCircleNumber = tanCircleNumber;
		return this;
	}

	public void setTanCircleNumber(String tanCircleNumber) {
		this.tanCircleNumber = tanCircleNumber;
	}

	public String getCitTdsLocation() {
		return citTdsLocation;
	}

	public LegalEntity citTdsLocation(String citTdsLocation) {
		this.citTdsLocation = citTdsLocation;
		return this;
	}

	public void setCitTdsLocation(String citTdsLocation) {
		this.citTdsLocation = citTdsLocation;
	}

	public Long getFormSignatory() {
		return formSignatory;
	}

	public LegalEntity formSignatory(Long formSignatory) {
		this.formSignatory = formSignatory;
		return this;
	}

	public void setFormSignatory(Long formSignatory) {
		this.formSignatory = formSignatory;
	}

	public String getPfNumber() {
		return pfNumber;
	}

	public LegalEntity pfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
		return this;
	}

	public void setPfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
	}

	public LocalDate getPfRegistrationDate() {
		return pfRegistrationDate;
	}

	public LegalEntity pfRegistrationDate(LocalDate pfRegistrationDate) {
		this.pfRegistrationDate = pfRegistrationDate;
		return this;
	}

	public void setPfRegistrationDate(LocalDate pfRegistrationDate) {
		this.pfRegistrationDate = pfRegistrationDate;
	}

	public void setPfRegistrationDate(String date) {
		this.pfRegistrationDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public Long getPfSignatory() {
		return pfSignatory;
	}

	public LegalEntity pfSignatory(Long pfSignatory) {
		this.pfSignatory = pfSignatory;
		return this;
	}

	public void setPfSignatory(Long pfSignatory) {
		this.pfSignatory = pfSignatory;
	}

	public String getEsiNumber() {
		return esiNumber;
	}

	public LegalEntity esiNumber(String esiNumber) {
		this.esiNumber = esiNumber;
		return this;
	}

	public void setEsiNumber(String esiNumber) {
		this.esiNumber = esiNumber;
	}

	public LocalDate getEsiRegistrationDate() {
		return esiRegistrationDate;
	}

	public LegalEntity esiRegistrationDate(LocalDate esiRegistrationDate) {
		this.esiRegistrationDate = esiRegistrationDate;
		return this;
	}

	public void setEsiRegistrationDate(LocalDate esiRegistrationDate) {
		this.esiRegistrationDate = esiRegistrationDate;
	}

	public void setEsiRegistrationDate(String date) {
		this.esiRegistrationDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public Long getEsiSignatory() {
		return esiSignatory;
	}

	public LegalEntity esiSignatory(Long esiSignatory) {
		this.esiSignatory = esiSignatory;
		return this;
	}

	public void setEsiSignatory(Long esiSignatory) {
		this.esiSignatory = esiSignatory;
	}

	public String getPtNumber() {
		return ptNumber;
	}

	public LegalEntity ptNumber(String ptNumber) {
		this.ptNumber = ptNumber;
		return this;
	}

	public void setPtNumber(String ptNumber) {
		this.ptNumber = ptNumber;
	}

	public LocalDate getPtRegistrationDate() {
		return ptRegistrationDate;
	}

	public LegalEntity ptRegistrationDate(LocalDate ptRegistrationDate) {
		this.ptRegistrationDate = ptRegistrationDate;
		return this;
	}

	public void setPtRegistrationDate(LocalDate ptRegistrationDate) {
		this.ptRegistrationDate = ptRegistrationDate;
	}

	public void setPtRegistrationDate(String date) {
		this.ptRegistrationDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public Long getPtSignatory() {
		return ptSignatory;
	}

	public LegalEntity ptSignatory(Long ptSignatory) {
		this.ptSignatory = ptSignatory;
		return this;
	}

	public void setPtSignatory(Long ptSignatory) {
		this.ptSignatory = ptSignatory;
	}

	public Branch getBranch() {
		return branch;
	}

	public LegalEntity branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public College getCollege() {
		return college;
	}

	public LegalEntity college(College college) {
		this.college = college;
		return this;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public State getState() {
		return state;
	}

	public LegalEntity state(State state) {
		this.state = state;
		return this;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public LegalEntity city(City city) {
		this.city = city;
		return this;
	}

	public void setCity(City city) {
		this.city = city;
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
		LegalEntity legalEntity = (LegalEntity) o;
		if (legalEntity.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), legalEntity.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "LegalEntity{" + "id=" + getId() + ", logoPath='" + getLogoPath() + "'"
				+ ", logoFileName='" + getLogoFileName() + "'" + ", logoFile='"
				+ getLogoFile() + "'" + ", legalNameOfTheCollege='"
				+ getLegalNameOfTheCollege() + "'" + ", typeOfCollege='"
				+ getTypeOfCollege() + "'" + ", dateOfIncorporation='"
				+ getDateOfIncorporation() + "'" + ", registeredOfficeAddress1='"
				+ getRegisteredOfficeAddress1() + "'" + ", registeredOfficeAddress2='"
				+ getRegisteredOfficeAddress2() + "'" + ", registeredOfficeAddress3='"
				+ getRegisteredOfficeAddress3() + "'" + ", registeredOfficeAddress4='"
				+ getRegisteredOfficeAddress4() + "'" + ", registeredOfficeAddress5='"
				+ getRegisteredOfficeAddress5() + "'" + ", collegeIdentificationNumber='"
				+ getCollegeIdentificationNumber() + "'" + ", pan='" + getPan() + "'"
				+ ", tan='" + getTan() + "'" + ", tanCircleNumber='"
				+ getTanCircleNumber() + "'" + ", citTdsLocation='" + getCitTdsLocation()
				+ "'" + ", formSignatory=" + getFormSignatory() + ", pfNumber='"
				+ getPfNumber() + "'" + ", pfRegistrationDate='" + getPfRegistrationDate()
				+ "'" + ", pfSignatory=" + getPfSignatory() + ", esiNumber='"
				+ getEsiNumber() + "'" + ", esiRegistrationDate='"
				+ getEsiRegistrationDate() + "'" + ", esiSignatory=" + getEsiSignatory()
				+ ", ptNumber='" + getPtNumber() + "'" + ", ptRegistrationDate='"
				+ getPtRegistrationDate() + "'" + ", ptSignatory=" + getPtSignatory()
				+ "}";
	}
}
