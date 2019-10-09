package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Location.
 */
@Document(indexName = "location")
public class Location implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String name;

	@NotNull
	private String address;

	@NotNull
	private String appliesTo;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Location name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public Location address(String address) {
		this.address = address;
		return this;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAppliesTo() {
		return appliesTo;
	}

	public Location appliesTo(String appliesTo) {
		this.appliesTo = appliesTo;
		return this;
	}

	public void setAppliesTo(String appliesTo) {
		this.appliesTo = appliesTo;
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
		Location location = (Location) o;
		if (location.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), location.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Location{" + "id=" + getId() + ", name='" + getName() + "'"
				+ ", address='" + getAddress() + "'" + ", appliesTo='" + getAppliesTo()
				+ "'" + "}";
	}
}
