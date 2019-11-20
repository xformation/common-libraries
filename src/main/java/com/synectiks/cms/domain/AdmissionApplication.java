package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AdmissionApplication.
 */
@Document(indexName = "admissionapplication")
public class AdmissionApplication implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	@Field(type = FieldType.Keyword)
	private Long id;

	private String admissionStatus;

	private String studentName;

	private String studentMiddleName;

	private String studentLastName;

	private String fatherName;

	private String fatherMiddleName;

	private String fatherLastName;

	private String motherName;

	private String motherMiddleName;

	private String motherLastName;

	private String contactNumber;

	private String alternateMobileNumber;

	private LocalDate dateOfBirth;

	private String email;

	private String sex;

	private String comments;

	private Integer applicationId;

	private String uploadPhoto;

	private String course;

	private LocalDate admissionDate;

	private String status;

	@JsonIgnoreProperties("admissionApplications")
	private AdmissionEnquiry admissionEnquiry;

	@JsonIgnoreProperties("admissionApplications")
	private AcademicHistory academicHistory;

	@JsonIgnoreProperties("admissionApplications")
	private Documents documents;

	@JsonIgnoreProperties("admissionApplications")
	private Branch branch;

	@JsonIgnoreProperties("admissionApplications")
	private Batch batch;

	@JsonIgnoreProperties("admissionApplications")
	private State state;

	@JsonIgnoreProperties("admissionApplications")
	private City city;

	@JsonIgnoreProperties("admissionApplications")
	private Country country;

	@JsonIgnoreProperties("admissionApplications")
	private Department department;

	@JsonIgnoreProperties("admissionApplications")
	private AcademicYear academicyear;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdmissionStatus() {
		return admissionStatus;
	}

	public AdmissionApplication admissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
		return this;
	}

	public void setAdmissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
	}

	public String getStudentName() {
		return studentName;
	}

	public AdmissionApplication studentName(String studentName) {
		this.studentName = studentName;
		return this;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMiddleName() {
		return studentMiddleName;
	}

	public AdmissionApplication studentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
		return this;
	}

	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public AdmissionApplication studentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
		return this;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public AdmissionApplication fatherName(String fatherName) {
		this.fatherName = fatherName;
		return this;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherMiddleName() {
		return fatherMiddleName;
	}

	public AdmissionApplication fatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
		return this;
	}

	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public AdmissionApplication fatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
		return this;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public AdmissionApplication motherName(String motherName) {
		this.motherName = motherName;
		return this;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherMiddleName() {
		return motherMiddleName;
	}

	public AdmissionApplication motherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
		return this;
	}

	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public AdmissionApplication motherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
		return this;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public AdmissionApplication contactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public AdmissionApplication alternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
		return this;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public AdmissionApplication dateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfBirth(String date) {
		this.dateOfBirth = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getEmail() {
		return email;
	}

	public AdmissionApplication email(String email) {
		this.email = email;
		return this;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public AdmissionApplication sex(String sex) {
		this.sex = sex;
		return this;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getComments() {
		return comments;
	}

	public AdmissionApplication comments(String comments) {
		this.comments = comments;
		return this;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public AdmissionApplication applicationId(Integer applicationId) {
		this.applicationId = applicationId;
		return this;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public String getUploadPhoto() {
		return uploadPhoto;
	}

	public AdmissionApplication uploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
		return this;
	}

	public void setUploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
	}

	public String getCourse() {
		return course;
	}

	public AdmissionApplication course(String course) {
		this.course = course;
		return this;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public AdmissionApplication admissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
		return this;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public void setAdmissionDate(String date) {
		this.admissionDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getStatus() {
		return status;
	}

	public AdmissionApplication status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AdmissionEnquiry getAdmissionEnquiry() {
		return admissionEnquiry;
	}

	public AdmissionApplication admissionEnquiry(AdmissionEnquiry admissionEnquiry) {
		this.admissionEnquiry = admissionEnquiry;
		return this;
	}

	public void setAdmissionEnquiry(AdmissionEnquiry admissionEnquiry) {
		this.admissionEnquiry = admissionEnquiry;
	}

	public AcademicHistory getAcademicHistory() {
		return academicHistory;
	}

	public AdmissionApplication academicHistory(AcademicHistory academicHistory) {
		this.academicHistory = academicHistory;
		return this;
	}

	public void setAcademicHistory(AcademicHistory academicHistory) {
		this.academicHistory = academicHistory;
	}

	public Documents getDocuments() {
		return documents;
	}

	public AdmissionApplication documents(Documents documents) {
		this.documents = documents;
		return this;
	}

	public void setDocuments(Documents documents) {
		this.documents = documents;
	}

	public Branch getBranch() {
		return branch;
	}

	public AdmissionApplication branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Batch getBatch() {
		return batch;
	}

	public AdmissionApplication batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public State getState() {
		return state;
	}

	public AdmissionApplication state(State state) {
		this.state = state;
		return this;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public AdmissionApplication city(City city) {
		this.city = city;
		return this;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public AdmissionApplication country(Country country) {
		this.country = country;
		return this;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Department getDepartment() {
		return department;
	}

	public AdmissionApplication department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public AcademicYear getAcademicyear() {
		return academicyear;
	}

	public AdmissionApplication academicyear(AcademicYear academicYear) {
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
		if (!(o instanceof AdmissionApplication)) {
			return false;
		}
		return id != null && id.equals(((AdmissionApplication) o).id);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return "AdmissionApplication{" + "id=" + getId() + ", admissionStatus='"
				+ getAdmissionStatus() + "'" + ", studentName='" + getStudentName() + "'"
				+ ", studentMiddleName='" + getStudentMiddleName() + "'"
				+ ", studentLastName='" + getStudentLastName() + "'" + ", fatherName='"
				+ getFatherName() + "'" + ", fatherMiddleName='" + getFatherMiddleName()
				+ "'" + ", fatherLastName='" + getFatherLastName() + "'"
				+ ", motherName='" + getMotherName() + "'" + ", motherMiddleName='"
				+ getMotherMiddleName() + "'" + ", motherLastName='" + getMotherLastName()
				+ "'" + ", contactNumber='" + getContactNumber() + "'"
				+ ", alternateMobileNumber='" + getAlternateMobileNumber() + "'"
				+ ", dateOfBirth='" + getDateOfBirth() + "'" + ", email='" + getEmail()
				+ "'" + ", sex='" + getSex() + "'" + ", comments='" + getComments() + "'"
				+ ", applicationId=" + getApplicationId() + ", uploadPhoto='"
				+ getUploadPhoto() + "'" + ", course='" + getCourse() + "'"
				+ ", admissionDate='" + getAdmissionDate() + "'" + ", status='"
				+ getStatus() + "'" + "}";
	}
}
