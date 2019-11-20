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
 * A Student.
 */
@Document(indexName = "student")
public class Student implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String studentName;

	@NotNull
	private String studentMiddleName;

	@NotNull
	private String studentLastName;

	@NotNull
	private String fatherName;

	@NotNull
	private String fatherMiddleName;

	@NotNull
	private String fatherLastName;

	@NotNull
	private String motherName;

	@NotNull
	private String motherMiddleName;

	@NotNull
	private String motherLastName;

	@NotNull
	private Long aadharNo;

	@NotNull
	private LocalDate dateOfBirth;

	@NotNull
	private String placeOfBirth;

	@NotNull
	private String religion;

	@NotNull
	private String caste;

	@NotNull
	private String subCaste;

	@NotNull
	private Integer age;

	@NotNull
	private String sex;

	@NotNull
	private String bloodGroup;

	@NotNull
	private String addressLineOne;

	@NotNull
	private String addressLineTwo;

	@NotNull
	private String addressLineThree;

	@NotNull
	private String town;

	@NotNull
	private String state;

	@NotNull
	private String country;

	@NotNull
	private Long pincode;

	@NotNull
	private String studentContactNumber;

	private String alternateContactNumber;

	@NotNull
	private String studentEmailAddress;

	private String alternateEmailAddress;

	@NotNull
	private String relationWithStudent;

	@NotNull
	private String emergencyContactName;

	@NotNull
	private String emergencyContactMiddleName;

	@NotNull
	private String emergencyContactLastName;

	@NotNull
	private String emergencyContactNo;

	@NotNull
	private String emergencyContactEmailAddress;

	@NotNull
	private String uploadPhoto;

	private Long admissionNo;

	private String rollNo;

	@NotNull
	private String studentType;

	@NotNull
	@JsonIgnoreProperties("students")
	private Department department;

	@NotNull
	@JsonIgnoreProperties("students")
	private Batch batch;

	@NotNull
	@JsonIgnoreProperties("students")
	private Section section;

	@NotNull
	@JsonIgnoreProperties("students")
	private Branch branch;

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

	public Student studentName(String studentName) {
		this.studentName = studentName;
		return this;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMiddleName() {
		return studentMiddleName;
	}

	public Student studentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
		return this;
	}

	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public Student studentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
		return this;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public Student fatherName(String fatherName) {
		this.fatherName = fatherName;
		return this;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherMiddleName() {
		return fatherMiddleName;
	}

	public Student fatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
		return this;
	}

	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public Student fatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
		return this;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public Student motherName(String motherName) {
		this.motherName = motherName;
		return this;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherMiddleName() {
		return motherMiddleName;
	}

	public Student motherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
		return this;
	}

	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public Student motherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
		return this;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public Long getAadharNo() {
		return aadharNo;
	}

	public Student aadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
		return this;
	}

	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Student dateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = LocalDate.parse(dateOfBirth,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public Student placeOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
		return this;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getReligion() {
		return religion;
	}

	public Student religion(String religion) {
		this.religion = religion;
		return this;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public Student caste(String caste) {
		this.caste = caste;
		return this;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getSubCaste() {
		return subCaste;
	}

	public Student subCaste(String subCaste) {
		this.subCaste = subCaste;
		return this;
	}

	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}

	public Integer getAge() {
		return age;
	}

	public Student age(Integer age) {
		this.age = age;
		return this;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public Student sex(String sex) {
		this.sex = sex;
		return this;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public Student bloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
		return this;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public Student addressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
		return this;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public Student addressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
		return this;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getAddressLineThree() {
		return addressLineThree;
	}

	public Student addressLineThree(String addressLineThree) {
		this.addressLineThree = addressLineThree;
		return this;
	}

	public void setAddressLineThree(String addressLineThree) {
		this.addressLineThree = addressLineThree;
	}

	public String getTown() {
		return town;
	}

	public Student town(String town) {
		this.town = town;
		return this;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return state;
	}

	public Student state(String state) {
		this.state = state;
		return this;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public Student country(String country) {
		this.country = country;
		return this;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPincode() {
		return pincode;
	}

	public Student pincode(Long pincode) {
		this.pincode = pincode;
		return this;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getStudentContactNumber() {
		return studentContactNumber;
	}

	public Student studentContactNumber(String studentContactNumber) {
		this.studentContactNumber = studentContactNumber;
		return this;
	}

	public void setStudentContactNumber(String studentContactNumber) {
		this.studentContactNumber = studentContactNumber;
	}

	public String getAlternateContactNumber() {
		return alternateContactNumber;
	}

	public Student alternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
		return this;
	}

	public void setAlternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}

	public String getStudentEmailAddress() {
		return studentEmailAddress;
	}

	public Student studentEmailAddress(String studentEmailAddress) {
		this.studentEmailAddress = studentEmailAddress;
		return this;
	}

	public void setStudentEmailAddress(String studentEmailAddress) {
		this.studentEmailAddress = studentEmailAddress;
	}

	public String getAlternateEmailAddress() {
		return alternateEmailAddress;
	}

	public Student alternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
		return this;
	}

	public void setAlternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
	}

	public String getRelationWithStudent() {
		return relationWithStudent;
	}

	public Student relationWithStudent(String relationWithStudent) {
		this.relationWithStudent = relationWithStudent;
		return this;
	}

	public void setRelationWithStudent(String relationWithStudent) {
		this.relationWithStudent = relationWithStudent;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public Student emergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
		return this;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactMiddleName() {
		return emergencyContactMiddleName;
	}

	public Student emergencyContactMiddleName(String emergencyContactMiddleName) {
		this.emergencyContactMiddleName = emergencyContactMiddleName;
		return this;
	}

	public void setEmergencyContactMiddleName(String emergencyContactMiddleName) {
		this.emergencyContactMiddleName = emergencyContactMiddleName;
	}

	public String getEmergencyContactLastName() {
		return emergencyContactLastName;
	}

	public Student emergencyContactLastName(String emergencyContactLastName) {
		this.emergencyContactLastName = emergencyContactLastName;
		return this;
	}

	public void setEmergencyContactLastName(String emergencyContactLastName) {
		this.emergencyContactLastName = emergencyContactLastName;
	}

	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public Student emergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
		return this;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public String getEmergencyContactEmailAddress() {
		return emergencyContactEmailAddress;
	}

	public Student emergencyContactEmailAddress(String emergencyContactEmailAddress) {
		this.emergencyContactEmailAddress = emergencyContactEmailAddress;
		return this;
	}

	public void setEmergencyContactEmailAddress(String emergencyContactEmailAddress) {
		this.emergencyContactEmailAddress = emergencyContactEmailAddress;
	}

	public String getUploadPhoto() {
		return uploadPhoto;
	}

	public Student uploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
		return this;
	}

	public void setUploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
	}

	public Long getAdmissionNo() {
		return admissionNo;
	}

	public Student admissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
		return this;
	}

	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getRollNo() {
		return rollNo;
	}

	public Student rollNo(String rollNo) {
		this.rollNo = rollNo;
		return this;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentType() {
		return studentType;
	}

	public Student studentType(String studentType) {
		this.studentType = studentType;
		return this;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public Department getDepartment() {
		return department;
	}

	public Student department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Batch getBatch() {
		return batch;
	}

	public Student batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Section getSection() {
		return section;
	}

	public Student section(Section section) {
		this.section = section;
		return this;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Branch getBranch() {
		return branch;
	}

	public Student branch(Branch branch) {
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
		Student student = (Student) o;
		if (student.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), student.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + getId() + ", studentName='" + getStudentName() + "'"
				+ ", studentMiddleName='" + getStudentMiddleName() + "'"
				+ ", studentLastName='" + getStudentLastName() + "'" + ", fatherName='"
				+ getFatherName() + "'" + ", fatherMiddleName='" + getFatherMiddleName()
				+ "'" + ", fatherLastName='" + getFatherLastName() + "'"
				+ ", motherName='" + getMotherName() + "'" + ", motherMiddleName='"
				+ getMotherMiddleName() + "'" + ", motherLastName='" + getMotherLastName()
				+ "'" + ", aadharNo=" + getAadharNo() + ", dateOfBirth='"
				+ getDateOfBirth() + "'" + ", placeOfBirth='" + getPlaceOfBirth() + "'"
				+ ", religion='" + getReligion() + "'" + ", caste='" + getCaste() + "'"
				+ ", subCaste='" + getSubCaste() + "'" + ", age=" + getAge() + ", sex='"
				+ getSex() + "'" + ", bloodGroup='" + getBloodGroup() + "'"
				+ ", addressLineOne='" + getAddressLineOne() + "'" + ", addressLineTwo='"
				+ getAddressLineTwo() + "'" + ", addressLineThree='"
				+ getAddressLineThree() + "'" + ", town='" + getTown() + "'" + ", state='"
				+ getState() + "'" + ", country='" + getCountry() + "'" + ", pincode="
				+ getPincode() + ", studentContactNumber='" + getStudentContactNumber()
				+ "'" + ", alternateContactNumber='" + getAlternateContactNumber() + "'"
				+ ", studentEmailAddress='" + getStudentEmailAddress() + "'"
				+ ", alternateEmailAddress='" + getAlternateEmailAddress() + "'"
				+ ", relationWithStudent='" + getRelationWithStudent() + "'"
				+ ", emergencyContactName='" + getEmergencyContactName() + "'"
				+ ", emergencyContactMiddleName='" + getEmergencyContactMiddleName() + "'"
				+ ", emergencyContactLastName='" + getEmergencyContactLastName() + "'"
				+ ", emergencyContactNo='" + getEmergencyContactNo() + "'"
				+ ", emergencyContactEmailAddress='" + getEmergencyContactEmailAddress()
				+ "'" + ", uploadPhoto='" + getUploadPhoto() + "'" + ", admissionNo="
				+ getAdmissionNo() + ", rollNo='" + getRollNo() + "'" + ", studentType='"
				+ getStudentType() + "'" + "}";
	}

	//Additional computation fields
	private String attendance;
	private String avgExamScore;
	private String subject;
	private String assignEffic;
	private String collaborationEffic;
	private String contributionEffic;
	private String learningEffic;
	private String extraCuriculEffic;
	private String sportsIndex;

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public String getAvgExamScore() {
		return avgExamScore;
	}

	public void setAvgExamScore(String avgExamScore) {
		this.avgExamScore = avgExamScore;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAssignEffic() {
		return assignEffic;
	}

	public void setAssignEffic(String assignEffic) {
		this.assignEffic = assignEffic;
	}

	public String getCollaborationEffic() {
		return collaborationEffic;
	}

	public void setCollaborationEffic(String collaborationEffic) {
		this.collaborationEffic = collaborationEffic;
	}

	public String getContributionEffic() {
		return contributionEffic;
	}

	public void setContributionEffic(String contributionEffic) {
		this.contributionEffic = contributionEffic;
	}

	public String getLearningEffic() {
		return learningEffic;
	}

	public void setLearningEffic(String learningEffic) {
		this.learningEffic = learningEffic;
	}

	public String getExtraCuriculEffic() {
		return extraCuriculEffic;
	}

	public void setExtraCuriculEffic(String extraCuriculEffic) {
		this.extraCuriculEffic = extraCuriculEffic;
	}

	public String getSportsIndex() {
		return sportsIndex;
	}

	public void setSportsIndex(String sportsIndex) {
		this.sportsIndex = sportsIndex;
	}
}
