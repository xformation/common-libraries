package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A StudentAttendance.
 */
@Document(indexName = "studentattendance")
public class StudentAttendance implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String attendanceStatus;

	private String comments;

	@JsonIgnoreProperties("studentAttendances")
	private Student student;

	@JsonIgnoreProperties("studentAttendances")
	private Lecture lecture;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public StudentAttendance attendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
		return this;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

	public String getComments() {
		return comments;
	}

	public StudentAttendance comments(String comments) {
		this.comments = comments;
		return this;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Student getStudent() {
		return student;
	}

	public StudentAttendance student(Student student) {
		this.student = student;
		return this;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Lecture getLecture() {
		return lecture;
	}

	public StudentAttendance lecture(Lecture lecture) {
		this.lecture = lecture;
		return this;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
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
		StudentAttendance studentAttendance = (StudentAttendance) o;
		if (studentAttendance.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), studentAttendance.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "StudentAttendance{" + "id=" + getId() + ", attendanceStatus='"
				+ getAttendanceStatus() + "'" + ", comments='" + getComments() + "'"
				+ "}";
	}
}
