package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Teach.
 */
@Document(indexName = "teach")
public class Teach implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String desc;

	@JsonIgnoreProperties("teaches")
	private Subject subject;

	@JsonIgnoreProperties("teaches")
	private Teacher teacher;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public Teach desc(String desc) {
		this.desc = desc;
		return this;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Subject getSubject() {
		return subject;
	}

	public Teach subject(Subject subject) {
		this.subject = subject;
		return this;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public Teach teacher(Teacher teacher) {
		this.teacher = teacher;
		return this;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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
		Teach teach = (Teach) o;
		if (teach.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), teach.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Teach{" + "id=" + getId() + ", desc='" + getDesc() + "'" + "}";
	}
}
