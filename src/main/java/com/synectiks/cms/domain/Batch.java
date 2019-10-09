package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Batch.
 */
@Document(indexName = "batch")
public class Batch implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String batch;

	@JsonIgnoreProperties("batches")
	private Department department;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBatch() {
		return batch;
	}

	public Batch batch(String batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Department getDepartment() {
		return department;
	}

	public Batch department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
		Batch batch = (Batch) o;
		if (batch.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), batch.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Batch{" + "id=" + getId() + ", batch='" + getBatch() + "'" + "}";
	}
}
