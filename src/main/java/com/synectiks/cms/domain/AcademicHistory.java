package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AcademicHistory.
 */
@Document(indexName = "academichistory")
public class AcademicHistory implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String qualification;

	@NotNull
	private String yearOfPassing;

	@NotNull
	private String institution;

	@NotNull
	private String university;

	@NotNull
	private Long enrollmentNo;

	@NotNull
	private Long score;

	@NotNull
	private Integer percentage;

	@JsonIgnoreProperties("academicHistories")
	private Student student;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public AcademicHistory qualification(String qualification) {
		this.qualification = qualification;
		return this;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getYearOfPassing() {
		return yearOfPassing;
	}

	public AcademicHistory yearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
		return this;
	}

	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public String getInstitution() {
		return institution;
	}

	public AcademicHistory institution(String institution) {
		this.institution = institution;
		return this;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getUniversity() {
		return university;
	}

	public AcademicHistory university(String university) {
		this.university = university;
		return this;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Long getEnrollmentNo() {
		return enrollmentNo;
	}

	public AcademicHistory enrollmentNo(Long enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
		return this;
	}

	public void setEnrollmentNo(Long enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public Long getScore() {
		return score;
	}

	public AcademicHistory score(Long score) {
		this.score = score;
		return this;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public AcademicHistory percentage(Integer percentage) {
		this.percentage = percentage;
		return this;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public Student getStudent() {
		return student;
	}

	public AcademicHistory student(Student student) {
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
		AcademicHistory academicHistory = (AcademicHistory) o;
		if (academicHistory.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), academicHistory.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AcademicHistory{" + "id=" + getId() + ", qualification='"
				+ getQualification() + "'" + ", yearOfPassing='" + getYearOfPassing()
				+ "'" + ", institution='" + getInstitution() + "'" + ", university='"
				+ getUniversity() + "'" + ", enrollmentNo=" + getEnrollmentNo()
				+ ", score=" + getScore() + ", percentage=" + getPercentage() + "}";
	}
}
