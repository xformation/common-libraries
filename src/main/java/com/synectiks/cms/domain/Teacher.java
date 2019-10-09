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
 * A Teacher.
 */
@Document(indexName = "teacher")
public class Teacher implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String teacherName;

	@NotNull
	private String teacherMiddleName;

	@NotNull
	private String teacherLastName;

	@NotNull
	private String fatherName;

	@NotNull
	private String fatherMiddleName;

	@NotNull
	private String fatherLastName;

	private String spouseName;

	private String spouseMiddleName;

	private String spouseLastName;

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
	private String teacherContactNumber;

	private String alternateContactNumber;

	@NotNull
	private String teacherEmailAddress;

	private String alternateEmailAddress;

	@NotNull
	private String relationWithStaff;

	@NotNull
	private String emergencyContactName;

	private String emergencyContactMiddleName;

	@NotNull
	private String emergencyContactLastName;

	@NotNull
	private String emergencyContactNo;

	@NotNull
	private String emergencyContactEmailAddress;

	@NotNull
	private String uploadPhoto;

	@NotNull
	private String status;

	private Long employeeId;

	@NotNull
	private String designation;

	@NotNull
	private String staffType;

	@JsonIgnoreProperties("teachers")
	private Department department;

	@JsonIgnoreProperties("teachers")
	private Branch branch;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public Teacher teacherName(String teacherName) {
		this.teacherName = teacherName;
		return this;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherMiddleName() {
		return teacherMiddleName;
	}

	public Teacher teacherMiddleName(String teacherMiddleName) {
		this.teacherMiddleName = teacherMiddleName;
		return this;
	}

	public void setTeacherMiddleName(String teacherMiddleName) {
		this.teacherMiddleName = teacherMiddleName;
	}

	public String getTeacherLastName() {
		return teacherLastName;
	}

	public Teacher teacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
		return this;
	}

	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public Teacher fatherName(String fatherName) {
		this.fatherName = fatherName;
		return this;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherMiddleName() {
		return fatherMiddleName;
	}

	public Teacher fatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
		return this;
	}

	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public Teacher fatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
		return this;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public Teacher spouseName(String spouseName) {
		this.spouseName = spouseName;
		return this;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseMiddleName() {
		return spouseMiddleName;
	}

	public Teacher spouseMiddleName(String spouseMiddleName) {
		this.spouseMiddleName = spouseMiddleName;
		return this;
	}

	public void setSpouseMiddleName(String spouseMiddleName) {
		this.spouseMiddleName = spouseMiddleName;
	}

	public String getSpouseLastName() {
		return spouseLastName;
	}

	public Teacher spouseLastName(String spouseLastName) {
		this.spouseLastName = spouseLastName;
		return this;
	}

	public void setSpouseLastName(String spouseLastName) {
		this.spouseLastName = spouseLastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public Teacher motherName(String motherName) {
		this.motherName = motherName;
		return this;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherMiddleName() {
		return motherMiddleName;
	}

	public Teacher motherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
		return this;
	}

	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public Teacher motherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
		return this;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public Long getAadharNo() {
		return aadharNo;
	}

	public Teacher aadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
		return this;
	}

	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Teacher dateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public Teacher placeOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
		return this;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getReligion() {
		return religion;
	}

	public Teacher religion(String religion) {
		this.religion = religion;
		return this;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public Teacher caste(String caste) {
		this.caste = caste;
		return this;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getSubCaste() {
		return subCaste;
	}

	public Teacher subCaste(String subCaste) {
		this.subCaste = subCaste;
		return this;
	}

	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}

	public Integer getAge() {
		return age;
	}

	public Teacher age(Integer age) {
		this.age = age;
		return this;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public Teacher sex(String sex) {
		this.sex = sex;
		return this;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public Teacher bloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
		return this;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public Teacher addressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
		return this;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public Teacher addressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
		return this;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getAddressLineThree() {
		return addressLineThree;
	}

	public Teacher addressLineThree(String addressLineThree) {
		this.addressLineThree = addressLineThree;
		return this;
	}

	public void setAddressLineThree(String addressLineThree) {
		this.addressLineThree = addressLineThree;
	}

	public String getTown() {
		return town;
	}

	public Teacher town(String town) {
		this.town = town;
		return this;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return state;
	}

	public Teacher state(String state) {
		this.state = state;
		return this;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public Teacher country(String country) {
		this.country = country;
		return this;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPincode() {
		return pincode;
	}

	public Teacher pincode(Long pincode) {
		this.pincode = pincode;
		return this;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getTeacherContactNumber() {
		return teacherContactNumber;
	}

	public Teacher teacherContactNumber(String teacherContactNumber) {
		this.teacherContactNumber = teacherContactNumber;
		return this;
	}

	public void setTeacherContactNumber(String teacherContactNumber) {
		this.teacherContactNumber = teacherContactNumber;
	}

	public String getAlternateContactNumber() {
		return alternateContactNumber;
	}

	public Teacher alternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
		return this;
	}

	public void setAlternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}

	public String getTeacherEmailAddress() {
		return teacherEmailAddress;
	}

	public Teacher teacherEmailAddress(String teacherEmailAddress) {
		this.teacherEmailAddress = teacherEmailAddress;
		return this;
	}

	public void setTeacherEmailAddress(String teacherEmailAddress) {
		this.teacherEmailAddress = teacherEmailAddress;
	}

	public String getAlternateEmailAddress() {
		return alternateEmailAddress;
	}

	public Teacher alternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
		return this;
	}

	public void setAlternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
	}

	public String getRelationWithStaff() {
		return relationWithStaff;
	}

	public Teacher relationWithStaff(String relationWithStaff) {
		this.relationWithStaff = relationWithStaff;
		return this;
	}

	public void setRelationWithStaff(String relationWithStaff) {
		this.relationWithStaff = relationWithStaff;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public Teacher emergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
		return this;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactMiddleName() {
		return emergencyContactMiddleName;
	}

	public Teacher emergencyContactMiddleName(String emergencyContactMiddleName) {
		this.emergencyContactMiddleName = emergencyContactMiddleName;
		return this;
	}

	public void setEmergencyContactMiddleName(String emergencyContactMiddleName) {
		this.emergencyContactMiddleName = emergencyContactMiddleName;
	}

	public String getEmergencyContactLastName() {
		return emergencyContactLastName;
	}

	public Teacher emergencyContactLastName(String emergencyContactLastName) {
		this.emergencyContactLastName = emergencyContactLastName;
		return this;
	}

	public void setEmergencyContactLastName(String emergencyContactLastName) {
		this.emergencyContactLastName = emergencyContactLastName;
	}

	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public Teacher emergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
		return this;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public String getEmergencyContactEmailAddress() {
		return emergencyContactEmailAddress;
	}

	public Teacher emergencyContactEmailAddress(String emergencyContactEmailAddress) {
		this.emergencyContactEmailAddress = emergencyContactEmailAddress;
		return this;
	}

	public void setEmergencyContactEmailAddress(String emergencyContactEmailAddress) {
		this.emergencyContactEmailAddress = emergencyContactEmailAddress;
	}

	public String getUploadPhoto() {
		return uploadPhoto;
	}

	public Teacher uploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
		return this;
	}

	public void setUploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
	}

	public String getStatus() {
		return status;
	}

	public Teacher status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public Teacher employeeId(Long employeeId) {
		this.employeeId = employeeId;
		return this;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getDesignation() {
		return designation;
	}

	public Teacher designation(String designation) {
		this.designation = designation;
		return this;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getStaffType() {
		return staffType;
	}

	public Teacher staffType(String staffType) {
		this.staffType = staffType;
		return this;
	}

	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

	public Department getDepartment() {
		return department;
	}

	public Teacher department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Branch getBranch() {
		return branch;
	}

	public Teacher branch(Branch branch) {
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
		Teacher teacher = (Teacher) o;
		if (teacher.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), teacher.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Teacher{" + "id=" + getId() + ", teacherName='" + getTeacherName() + "'"
				+ ", teacherMiddleName='" + getTeacherMiddleName() + "'"
				+ ", teacherLastName='" + getTeacherLastName() + "'" + ", fatherName='"
				+ getFatherName() + "'" + ", fatherMiddleName='" + getFatherMiddleName()
				+ "'" + ", fatherLastName='" + getFatherLastName() + "'"
				+ ", spouseName='" + getSpouseName() + "'" + ", spouseMiddleName='"
				+ getSpouseMiddleName() + "'" + ", spouseLastName='" + getSpouseLastName()
				+ "'" + ", motherName='" + getMotherName() + "'" + ", motherMiddleName='"
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
				+ getPincode() + ", teacherContactNumber='" + getTeacherContactNumber()
				+ "'" + ", alternateContactNumber='" + getAlternateContactNumber() + "'"
				+ ", teacherEmailAddress='" + getTeacherEmailAddress() + "'"
				+ ", alternateEmailAddress='" + getAlternateEmailAddress() + "'"
				+ ", relationWithStaff='" + getRelationWithStaff() + "'"
				+ ", emergencyContactName='" + getEmergencyContactName() + "'"
				+ ", emergencyContactMiddleName='" + getEmergencyContactMiddleName() + "'"
				+ ", emergencyContactLastName='" + getEmergencyContactLastName() + "'"
				+ ", emergencyContactNo='" + getEmergencyContactNo() + "'"
				+ ", emergencyContactEmailAddress='" + getEmergencyContactEmailAddress()
				+ "'" + ", uploadPhoto='" + getUploadPhoto() + "'" + ", status='"
				+ getStatus() + "'" + ", employeeId=" + getEmployeeId()
				+ ", designation='" + getDesignation() + "'" + ", staffType='"
				+ getStaffType() + "'" + "}";
	}
}
