package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AdminAttendance.
 */
@Document(indexName = "adminattendance")
public class AdminAttendance implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	private LocalDate updatedOn;

	private String updatedBy;

	@JsonIgnoreProperties("")
	private Lecture lecture;

	@JsonIgnoreProperties("")
	private Branch branch;

	@JsonIgnoreProperties("")
	private College college;

	@JsonIgnoreProperties("")
	private Department department;

	@JsonIgnoreProperties("")
	private AcademicYear academicyear;

	@JsonIgnoreProperties("")
	private Section section;

	@JsonIgnoreProperties("")
	private Student student;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public AdminAttendance updatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public void setUpdateOn(String date) {
		this.updatedOn = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public AdminAttendance updatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Lecture getLecture() {
		return lecture;
	}

	public AdminAttendance lecture(Lecture lecture) {
		this.lecture = lecture;
		return this;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	public Branch getBranch() {
		return branch;
	}

	public AdminAttendance branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public College getCollege() {
		return college;
	}

	public AdminAttendance college(College college) {
		this.college = college;
		return this;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Department getDepartment() {
		return department;
	}

	public AdminAttendance department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public AcademicYear getAcademicyear() {
		return academicyear;
	}

	public AdminAttendance academicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
		return this;
	}

	public void setAcademicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
	}

	public Section getSection() {
		return section;
	}

	public AdminAttendance section(Section section) {
		this.section = section;
		return this;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Student getStudent() {
		return student;
	}

	public AdminAttendance student(Student student) {
		this.student = student;
		return this;
	}

	public void setStudent(Student student) {
		this.student = student;
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
		AdminAttendance adminAttendance = (AdminAttendance) o;
		if (adminAttendance.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), adminAttendance.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AdminAttendance{" + "id=" + getId() + ", updatedOn='" + getUpdatedOn()
				+ "'" + ", updatedBy='" + getUpdatedBy() + "'" + "}";
	}
}
