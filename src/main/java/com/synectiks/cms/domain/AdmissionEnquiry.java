package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AdmissionEnquiry.
 */
@Document(indexName = "admissionenquiry")
public class AdmissionEnquiry implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String studentName;

	private String studentMiddleName;

	private String studentLastName;

	private String fatherName;

	private String fatherMiddleName;

	private String fatherLastName;

	private String motherName;

	private String motherMiddleName;

	private String motherLastName;

	@NotNull
	private String contactNumber;

	private String alternateMobileNumber;

	private LocalDate dateOfBirth;

	private String email;

	private String sex;

	private String comments;

	@NotNull
	private String courseApplyingFor;

	@NotNull
	private String highestQualification;

	private String modeOfEnquiry;

	private String status;

	private String description;

	private LocalDate enquiryDate;

	private LocalDate updatedOn;

	private String updatedBy;

	@JsonIgnoreProperties("admissionEnquiries")
	private Branch branch;

	@JsonIgnoreProperties("admissionEnquiries")
	private Department department;

	@JsonIgnoreProperties("admissionEnquiries")
	private Batch batch;

	@JsonIgnoreProperties("admissionEnquiries")
	private State state;

	@JsonIgnoreProperties("admissionEnquiries")
	private City city;

	@JsonIgnoreProperties("admissionEnquiries")
	private Country country;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public AdmissionEnquiry studentName(String studentName) {
		this.studentName = studentName;
		return this;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMiddleName() {
		return studentMiddleName;
	}

	public AdmissionEnquiry studentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
		return this;
	}

	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public AdmissionEnquiry studentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
		return this;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public AdmissionEnquiry fatherName(String fatherName) {
		this.fatherName = fatherName;
		return this;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherMiddleName() {
		return fatherMiddleName;
	}

	public AdmissionEnquiry fatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
		return this;
	}

	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public AdmissionEnquiry fatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
		return this;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public AdmissionEnquiry motherName(String motherName) {
		this.motherName = motherName;
		return this;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherMiddleName() {
		return motherMiddleName;
	}

	public AdmissionEnquiry motherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
		return this;
	}

	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public AdmissionEnquiry motherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
		return this;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public AdmissionEnquiry contactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public AdmissionEnquiry alternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
		return this;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public AdmissionEnquiry dateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public AdmissionEnquiry email(String email) {
		this.email = email;
		return this;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public AdmissionEnquiry sex(String sex) {
		this.sex = sex;
		return this;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getComments() {
		return comments;
	}

	public AdmissionEnquiry comments(String comments) {
		this.comments = comments;
		return this;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCourseApplyingFor() {
		return courseApplyingFor;
	}

	public AdmissionEnquiry courseApplyingFor(String courseApplyingFor) {
		this.courseApplyingFor = courseApplyingFor;
		return this;
	}

	public void setCourseApplyingFor(String courseApplyingFor) {
		this.courseApplyingFor = courseApplyingFor;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public AdmissionEnquiry highestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
		return this;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getModeOfEnquiry() {
		return modeOfEnquiry;
	}

	public AdmissionEnquiry modeOfEnquiry(String modeOfEnquiry) {
		this.modeOfEnquiry = modeOfEnquiry;
		return this;
	}

	public void setModeOfEnquiry(String modeOfEnquiry) {
		this.modeOfEnquiry = modeOfEnquiry;
	}

	public String getStatus() {
		return status;
	}

	public AdmissionEnquiry status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public AdmissionEnquiry description(String description) {
		this.description = description;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getEnquiryDate() {
		return enquiryDate;
	}

	public AdmissionEnquiry enquiryDate(LocalDate enquiryDate) {
		this.enquiryDate = enquiryDate;
		return this;
	}

	public void setEnquiryDate(LocalDate enquiryDate) {
		this.enquiryDate = enquiryDate;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public AdmissionEnquiry updatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public AdmissionEnquiry updatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Branch getBranch() {
		return branch;
	}

	public AdmissionEnquiry branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Department getDepartment() {
		return department;
	}

	public AdmissionEnquiry department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Batch getBatch() {
		return batch;
	}

	public AdmissionEnquiry batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public State getState() {
		return state;
	}

	public AdmissionEnquiry state(State state) {
		this.state = state;
		return this;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public AdmissionEnquiry city(City city) {
		this.city = city;
		return this;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public AdmissionEnquiry country(Country country) {
		this.country = country;
		return this;
	}

	public void setCountry(Country country) {
		this.country = country;
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
		AdmissionEnquiry admissionEnquiry = (AdmissionEnquiry) o;
		if (admissionEnquiry.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), admissionEnquiry.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AdmissionEnquiry{" + "id=" + getId() + ", studentName='"
				+ getStudentName() + "'" + ", studentMiddleName='"
				+ getStudentMiddleName() + "'" + ", studentLastName='"
				+ getStudentLastName() + "'" + ", fatherName='" + getFatherName() + "'"
				+ ", fatherMiddleName='" + getFatherMiddleName() + "'"
				+ ", fatherLastName='" + getFatherLastName() + "'" + ", motherName='"
				+ getMotherName() + "'" + ", motherMiddleName='" + getMotherMiddleName()
				+ "'" + ", motherLastName='" + getMotherLastName() + "'"
				+ ", contactNumber='" + getContactNumber() + "'"
				+ ", alternateMobileNumber='" + getAlternateMobileNumber() + "'"
				+ ", dateOfBirth='" + getDateOfBirth() + "'" + ", email='" + getEmail()
				+ "'" + ", sex='" + getSex() + "'" + ", comments='" + getComments() + "'"
				+ ", courseApplyingFor='" + getCourseApplyingFor() + "'"
				+ ", highestQualification='" + getHighestQualification() + "'"
				+ ", modeOfEnquiry='" + getModeOfEnquiry() + "'" + ", status='"
				+ getStatus() + "'" + ", description='" + getDescription() + "'"
				+ ", enquiryDate='" + getEnquiryDate() + "'" + ", updatedOn='"
				+ getUpdatedOn() + "'" + ", updatedBy='" + getUpdatedBy() + "'" + "}";
	}
}
