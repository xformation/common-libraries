package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Vehicle.
 */
// @Document(indexName = "vehicle")
public class Vehicle implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String vehicleNumber;

	@NotNull
	private String vehicleType;

	@NotNull
	private Long capacity;

	@NotNull
	private String ownerShip;

	private LocalDate dateOfRegistration;

	private String yearOfManufacturing;

	private String manufacturingCompany;

	private String model;

	private String chasisNo;

	@NotNull
	private String rcNo;

	@NotNull
	private String contactNumber;

	@NotNull
	private String status;

	private Insurance insurance;

	private Employee employee;

	@JsonIgnoreProperties("")
	private TransportRoute transportRoute;

	@JsonIgnoreProperties("")
	private Contract contract;

	@JsonIgnoreProperties("")
	private College college;

	@JsonIgnoreProperties("")
	private Branch branch;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public Vehicle vehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
		return this;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public Vehicle vehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
		return this;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Long getCapacity() {
		return capacity;
	}

	public Vehicle capacity(Long capacity) {
		this.capacity = capacity;
		return this;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public String getOwnerShip() {
		return ownerShip;
	}

	public Vehicle ownerShip(String ownerShip) {
		this.ownerShip = ownerShip;
		return this;
	}

	public void setOwnerShip(String ownerShip) {
		this.ownerShip = ownerShip;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public Vehicle dateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
		return this;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public void setDateOfRegistration(String date) {
		this.dateOfRegistration = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getYearOfManufacturing() {
		return yearOfManufacturing;
	}

	public Vehicle yearOfManufacturing(String yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
		return this;
	}

	public void setYearOfManufacturing(String yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

	public String getManufacturingCompany() {
		return manufacturingCompany;
	}

	public Vehicle manufacturingCompany(String manufacturingCompany) {
		this.manufacturingCompany = manufacturingCompany;
		return this;
	}

	public void setManufacturingCompany(String manufacturingCompany) {
		this.manufacturingCompany = manufacturingCompany;
	}

	public String getModel() {
		return model;
	}

	public Vehicle model(String model) {
		this.model = model;
		return this;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public Vehicle chasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
		return this;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getRcNo() {
		return rcNo;
	}

	public Vehicle rcNo(String rcNo) {
		this.rcNo = rcNo;
		return this;
	}

	public void setRcNo(String rcNo) {
		this.rcNo = rcNo;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public Vehicle contactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getStatus() {
		return status;
	}

	public Vehicle status(String status) {
		this.status = status;
		return this;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public Vehicle insurance(Insurance insurance) {
		this.insurance = insurance;
		return this;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Employee getEmployee() {
		return employee;
	}

	public Vehicle employee(Employee employee) {
		this.employee = employee;
		return this;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public TransportRoute getTransportRoute() {
		return transportRoute;
	}

	public Vehicle transportRoute(TransportRoute transportRoute) {
		this.transportRoute = transportRoute;
		return this;
	}

	public void setTransportRoute(TransportRoute transportRoute) {
		this.transportRoute = transportRoute;
	}

	public Contract getContract() {
		return contract;
	}

	public Vehicle contract(Contract contract) {
		this.contract = contract;
		return this;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public College getCollege() {
		return college;
	}

	public Vehicle college(College college) {
		this.college = college;
		return this;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Branch getBranch() {
		return branch;
	}

	public Vehicle branch(Branch branch) {
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
		Vehicle vehicle = (Vehicle) o;
		if (vehicle.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), vehicle.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Vehicle{" + "id=" + getId() + ", vehicleNumber='" + getVehicleNumber()
				+ "'" + ", vehicleType='" + getVehicleType() + "'" + ", capacity="
				+ getCapacity() + ", ownerShip='" + getOwnerShip() + "'"
				+ ", dateOfRegistration='" + getDateOfRegistration() + "'"
				+ ", yearOfManufacturing='" + getYearOfManufacturing() + "'"
				+ ", manufacturingCompany='" + getManufacturingCompany() + "'"
				+ ", model='" + getModel() + "'" + ", chasisNo='" + getChasisNo() + "'"
				+ ", rcNo='" + getRcNo() + "'" + ", contactNumber='" + getContactNumber()
				+ "'" + ", status='" + getStatus() + "'" + "}";
	}
}
