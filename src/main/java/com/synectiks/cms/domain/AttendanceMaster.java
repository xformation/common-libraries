package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AttendanceMaster.
 */
@Document(indexName = "attendancemaster")
public class AttendanceMaster implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String desc;

	@JsonIgnoreProperties("attendanceMasters")
	private Batch batch;

	@JsonIgnoreProperties("attendanceMasters")
	private Section section;

	@JsonIgnoreProperties("attendanceMasters")
	private Teach teach;

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

	public AttendanceMaster desc(String desc) {
		this.desc = desc;
		return this;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Batch getBatch() {
		return batch;
	}

	public AttendanceMaster batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Section getSection() {
		return section;
	}

	public AttendanceMaster section(Section section) {
		this.section = section;
		return this;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Teach getTeach() {
		return teach;
	}

	public AttendanceMaster teach(Teach teach) {
		this.teach = teach;
		return this;
	}

	public void setTeach(Teach teach) {
		this.teach = teach;
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
		AttendanceMaster attendanceMaster = (AttendanceMaster) o;
		if (attendanceMaster.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), attendanceMaster.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AttendanceMaster{" + "id=" + getId() + ", desc='" + getDesc() + "'" + "}";
	}
}
