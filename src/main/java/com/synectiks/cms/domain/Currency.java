package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Currency.
 */
@Document(indexName = "currency")
public class Currency implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String currencyName;

	private String currencyCode;

	private String currencySymbol;

	@JsonIgnoreProperties("currencies")
	private Country country;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public Currency currencyName(String currencyName) {
		this.currencyName = currencyName;
		return this;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public Currency currencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
		return this;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public Currency currencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
		return this;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	public Country getCountry() {
		return country;
	}

	public Currency country(Country country) {
		this.country = country;
		return this;
	}

	public void setCountry(Country country) {
		this.country = country;
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
		Currency currency = (Currency) o;
		if (currency.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), currency.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Currency{" + "id=" + getId() + ", currencyName='" + getCurrencyName()
				+ "'" + ", currencyCode='" + getCurrencyCode() + "'"
				+ ", currencySymbol='" + getCurrencySymbol() + "'" + "}";
	}
}
