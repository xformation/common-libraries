package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.synectiks.commons.interfaces.IESEntity;

/**
 * A TypeOfGrading.
 */
@Document(indexName = "typeofgrading")
public class TypeOfGrading implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private Integer minMarks;

	@NotNull
	private Integer maxMarks;

	@NotNull
	private String grades;

	@NotNull
	private Long groupvalue;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMinMarks() {
		return minMarks;
	}

	public TypeOfGrading minMarks(Integer minMarks) {
		this.minMarks = minMarks;
		return this;
	}

	public void setMinMarks(Integer minMarks) {
		this.minMarks = minMarks;
	}

	public Integer getMaxMarks() {
		return maxMarks;
	}

	public TypeOfGrading maxMarks(Integer maxMarks) {
		this.maxMarks = maxMarks;
		return this;
	}

	public void setMaxMarks(Integer maxMarks) {
		this.maxMarks = maxMarks;
	}

	public String getGrades() {
		return grades;
	}

	public TypeOfGrading grades(String grades) {
		this.grades = grades;
		return this;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}

	public Long getGroupvalue() {
		return groupvalue;
	}

	public TypeOfGrading groupvalue(Long groupvalue) {
		this.groupvalue = groupvalue;
		return this;
	}

	public void setGroupvalue(Long groupvalue) {
		this.groupvalue = groupvalue;
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
		TypeOfGrading typeOfGrading = (TypeOfGrading) o;
		if (typeOfGrading.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), typeOfGrading.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "TypeOfGrading{" + "id=" + getId() + ", minMarks=" + getMinMarks()
				+ ", maxMarks=" + getMaxMarks() + ", grades='" + getGrades() + "'"
				+ ", groupvalue=" + getGroupvalue() + "}";
	}
}
