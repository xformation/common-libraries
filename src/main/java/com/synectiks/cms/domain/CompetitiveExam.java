package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A CompetitiveExam.
 */
@Document(indexName = "competitiveexam")
public class CompetitiveExam implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String testName;

	@NotNull
	private Integer testScore;

	@NotNull
	private Long enrollmentNo;

	@NotNull
	private Long rank;

	@JsonIgnoreProperties("competitiveExams")
	private Student student;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTestName() {
		return testName;
	}

	public CompetitiveExam testName(String testName) {
		this.testName = testName;
		return this;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Integer getTestScore() {
		return testScore;
	}

	public CompetitiveExam testScore(Integer testScore) {
		this.testScore = testScore;
		return this;
	}

	public void setTestScore(Integer testScore) {
		this.testScore = testScore;
	}

	public Long getEnrollmentNo() {
		return enrollmentNo;
	}

	public CompetitiveExam enrollmentNo(Long enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
		return this;
	}

	public void setEnrollmentNo(Long enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public Long getRank() {
		return rank;
	}

	public CompetitiveExam rank(Long rank) {
		this.rank = rank;
		return this;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public Student getStudent() {
		return student;
	}

	public CompetitiveExam student(Student student) {
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
		CompetitiveExam competitiveExam = (CompetitiveExam) o;
		if (competitiveExam.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), competitiveExam.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "CompetitiveExam{" + "id=" + getId() + ", testName='" + getTestName() + "'"
				+ ", testScore=" + getTestScore() + ", enrollmentNo=" + getEnrollmentNo()
				+ ", rank=" + getRank() + "}";
	}
}
