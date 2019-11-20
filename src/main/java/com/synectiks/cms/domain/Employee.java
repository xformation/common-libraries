package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Employee.
 */
@Document(indexName = "employee")
public class Employee implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String employeeName;

	@NotNull
	private String designation;

	@NotNull
	private LocalDate joiningDate;

	private LocalDate jobEndDate;

	private LocalDate resignationDate;

	private LocalDate resignationAcceptanceDate;

	private String aadharNo;

	private String panNo;

	private String passportNo;

	private String primaryContactNo;

	private String secondaryContactNo;

	private String employeeFatherName;

	private String employeeMotherName;

	private String primaryAddress;

	private String secondaryAddress;

	private String employeeAddress;

	private String personalMailId;

	private String officialMailId;

	private String disability;

	private String drivingLicenceNo;

	private LocalDate drivingLicenceValidity;

	private String gender;

	private String typeOfEmployment;

	private Long managerId;

	private String status;

	private String maritalStatus;

	@NotNull
	@JsonIgnoreProperties("employees")
	private Branch branch;

	@JsonIgnoreProperties("employees")
	private TransportRoute transportRoute;

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

	public String getEmployeeName() {
		return employeeName;
	}

	public Employee employeeName(String employeeName) {
		this.employeeName = employeeName;
		return this;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public Employee designation(String designation) {
		this.designation = designation;
		return this;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public Employee joiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
		return this;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public void setJoiningDate(String date) {
		this.joiningDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getJobEndDate() {
		return jobEndDate;
	}

	public Employee jobEndDate(LocalDate jobEndDate) {
		this.jobEndDate = jobEndDate;
		return this;
	}

	public void setJobEndDate(LocalDate jobEndDate) {
		this.jobEndDate = jobEndDate;
	}

	public void setJobEndDate(String date) {
		this.jobEndDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getResignationDate() {
		return resignationDate;
	}

	public Employee resignationDate(LocalDate resignationDate) {
		this.resignationDate = resignationDate;
		return this;
	}

	public void setResignationDate(LocalDate resignationDate) {
		this.resignationDate = resignationDate;
	}

	public void setResignationDate(String date) {
		this.resignationDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getResignationAcceptanceDate() {
		return resignationAcceptanceDate;
	}

	public Employee resignationAcceptanceDate(LocalDate resignationAcceptanceDate) {
		this.resignationAcceptanceDate = resignationAcceptanceDate;
		return this;
	}

	public void setResignationAcceptanceDate(LocalDate resignationAcceptanceDate) {
		this.resignationAcceptanceDate = resignationAcceptanceDate;
	}

	public void setResignationAcceptanceDate(String date) {
		this.resignationAcceptanceDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public Employee aadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
		return this;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public Employee panNo(String panNo) {
		this.panNo = panNo;
		return this;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public Employee passportNo(String passportNo) {
		this.passportNo = passportNo;
		return this;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getPrimaryContactNo() {
		return primaryContactNo;
	}

	public Employee primaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
		return this;
	}

	public void setPrimaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}

	public String getSecondaryContactNo() {
		return secondaryContactNo;
	}

	public Employee secondaryContactNo(String secondaryContactNo) {
		this.secondaryContactNo = secondaryContactNo;
		return this;
	}

	public void setSecondaryContactNo(String secondaryContactNo) {
		this.secondaryContactNo = secondaryContactNo;
	}

	public String getEmployeeFatherName() {
		return employeeFatherName;
	}

	public Employee employeeFatherName(String employeeFatherName) {
		this.employeeFatherName = employeeFatherName;
		return this;
	}

	public void setEmployeeFatherName(String employeeFatherName) {
		this.employeeFatherName = employeeFatherName;
	}

	public String getEmployeeMotherName() {
		return employeeMotherName;
	}

	public Employee employeeMotherName(String employeeMotherName) {
		this.employeeMotherName = employeeMotherName;
		return this;
	}

	public void setEmployeeMotherName(String employeeMotherName) {
		this.employeeMotherName = employeeMotherName;
	}

	public String getPrimaryAddress() {
		return primaryAddress;
	}

	public Employee primaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
		return this;
	}

	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public String getSecondaryAddress() {
		return secondaryAddress;
	}

	public Employee secondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
		return this;
	}

	public void setSecondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public Employee employeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
		return this;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getPersonalMailId() {
		return personalMailId;
	}

	public Employee personalMailId(String personalMailId) {
		this.personalMailId = personalMailId;
		return this;
	}

	public void setPersonalMailId(String personalMailId) {
		this.personalMailId = personalMailId;
	}

	public String getOfficialMailId() {
		return officialMailId;
	}

	public Employee officialMailId(String officialMailId) {
		this.officialMailId = officialMailId;
		return this;
	}

	public void setOfficialMailId(String officialMailId) {
		this.officialMailId = officialMailId;
	}

	public String getDisability() {
		return disability;
	}

	public Employee disability(String disability) {
		this.disability = disability;
		return this;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public String getDrivingLicenceNo() {
		return drivingLicenceNo;
	}

	public Employee drivingLicenceNo(String drivingLicenceNo) {
		this.drivingLicenceNo = drivingLicenceNo;
		return this;
	}

	public void setDrivingLicenceNo(String drivingLicenceNo) {
		this.drivingLicenceNo = drivingLicenceNo;
	}

	public LocalDate getDrivingLicenceValidity() {
		return drivingLicenceValidity;
	}

	public Employee drivingLicenceValidity(LocalDate drivingLicenceValidity) {
		this.drivingLicenceValidity = drivingLicenceValidity;
		return this;
	}

	public void setDrivingLicenceValidity(LocalDate drivingLicenceValidity) {
		this.drivingLicenceValidity = drivingLicenceValidity;
	}

	public void setDrivingLicenceValidity(String date) {
		this.drivingLicenceValidity = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getGender() {
		return gender;
	}

	public Employee gender(String gender) {
		this.gender = gender;
		return this;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public Employee typeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
		return this;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	public Long getManagerId() {
		return managerId;
	}

	public Employee managerId(Long managerId) {
		this.managerId = managerId;
		return this;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getStatus() {
		return status;
	}

	public Employee status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public Employee maritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
		return this;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Branch getBranch() {
		return branch;
	}

	public Employee branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public TransportRoute getTransportRoute() {
		return transportRoute;
	}

	public Employee transportRoute(TransportRoute transportRoute) {
		this.transportRoute = transportRoute;
		return this;
	}

	public void setTransportRoute(TransportRoute transportRoute) {
		this.transportRoute = transportRoute;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Employee vehicle(Vehicle vehicle) {
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
		Employee employee = (Employee) o;
		if (employee.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), employee.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + getId() + ", employeeName='" + getEmployeeName()
				+ "'" + ", designation='" + getDesignation() + "'" + ", joiningDate='"
				+ getJoiningDate() + "'" + ", jobEndDate='" + getJobEndDate() + "'"
				+ ", resignationDate='" + getResignationDate() + "'"
				+ ", resignationAcceptanceDate='" + getResignationAcceptanceDate() + "'"
				+ ", aadharNo='" + getAadharNo() + "'" + ", panNo='" + getPanNo() + "'"
				+ ", passportNo='" + getPassportNo() + "'" + ", primaryContactNo='"
				+ getPrimaryContactNo() + "'" + ", secondaryContactNo='"
				+ getSecondaryContactNo() + "'" + ", employeeFatherName='"
				+ getEmployeeFatherName() + "'" + ", employeeMotherName='"
				+ getEmployeeMotherName() + "'" + ", primaryAddress='"
				+ getPrimaryAddress() + "'" + ", secondaryAddress='"
				+ getSecondaryAddress() + "'" + ", employeeAddress='"
				+ getEmployeeAddress() + "'" + ", personalMailId='" + getPersonalMailId()
				+ "'" + ", officialMailId='" + getOfficialMailId() + "'"
				+ ", disability='" + getDisability() + "'" + ", drivingLicenceNo='"
				+ getDrivingLicenceNo() + "'" + ", drivingLicenceValidity='"
				+ getDrivingLicenceValidity() + "'" + ", gender='" + getGender() + "'"
				+ ", typeOfEmployment='" + getTypeOfEmployment() + "'" + ", managerId="
				+ getManagerId() + ", status='" + getStatus() + "'" + ", maritalStatus='"
				+ getMaritalStatus() + "'" + "}";
	}
}
