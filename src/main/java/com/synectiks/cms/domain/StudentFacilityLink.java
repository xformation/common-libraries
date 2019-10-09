package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A StudentFacilityLink.
 */
@Document(indexName = "studentfacilitylink")
public class StudentFacilityLink implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String linkDesc;

	@JsonIgnoreProperties("")
	private Student student;

	@JsonIgnoreProperties("")
	private Facility facility;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLinkDesc() {
		return linkDesc;
	}

	public StudentFacilityLink linkDesc(String linkDesc) {
		this.linkDesc = linkDesc;
		return this;
	}

	public void setLinkDesc(String linkDesc) {
		this.linkDesc = linkDesc;
	}

	public Student getStudent() {
		return student;
	}

	public StudentFacilityLink student(Student student) {
		this.student = student;
		return this;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Facility getFacility() {
		return facility;
	}

	public StudentFacilityLink facility(Facility facility) {
		this.facility = facility;
		return this;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
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
		StudentFacilityLink studentFacilityLink = (StudentFacilityLink) o;
		if (studentFacilityLink.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), studentFacilityLink.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "StudentFacilityLink{" + "id=" + getId() + ", linkDesc='" + getLinkDesc()
				+ "'" + "}";
	}
}
