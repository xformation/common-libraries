package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Documents.
 */
@Document(indexName = "documents")
public class Documents implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String documentName;

	@NotNull
	private String documentFilePath;

	private Student student;

	@JsonIgnoreProperties("documents")
	private Vehicle vehicle;

	@JsonIgnoreProperties("documents")
	private Employee employee;

	@JsonIgnoreProperties("documents")
	private Contract contract;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocumentName() {
		return documentName;
	}

	public Documents documentName(String documentName) {
		this.documentName = documentName;
		return this;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentFilePath() {
		return documentFilePath;
	}

	public Documents documentFilePath(String documentFilePath) {
		this.documentFilePath = documentFilePath;
		return this;
	}

	public void setDocumentFilePath(String documentFilePath) {
		this.documentFilePath = documentFilePath;
	}

	public Student getStudent() {
		return student;
	}

	public Documents student(Student student) {
		this.student = student;
		return this;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Documents vehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		return this;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Employee getEmployee() {
		return employee;
	}

	public Documents employee(Employee employee) {
		this.employee = employee;
		return this;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Contract getContract() {
		return contract;
	}

	public Documents contract(Contract contract) {
		this.contract = contract;
		return this;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
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
		Documents documents = (Documents) o;
		if (documents.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), documents.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Documents{" + "id=" + getId() + ", documentName='" + getDocumentName()
				+ "'" + ", documentFilePath='" + getDocumentFilePath() + "'" + "}";
	}
}
