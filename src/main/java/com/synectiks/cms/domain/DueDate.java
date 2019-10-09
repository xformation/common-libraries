package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A DueDate.
 */
@Document(indexName = "duedate")
public class DueDate implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String paymentMethod;

	@NotNull
	private Integer installments;

	private String dayDesc;

	private Integer paymentDay;

	private String frequency;

	@JsonIgnoreProperties("")
	private College college;

	@JsonIgnoreProperties("")
	private Branch branch;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public DueDate paymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Integer getInstallments() {
		return installments;
	}

	public DueDate installments(Integer installments) {
		this.installments = installments;
		return this;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

	public String getDayDesc() {
		return dayDesc;
	}

	public DueDate dayDesc(String dayDesc) {
		this.dayDesc = dayDesc;
		return this;
	}

	public void setDayDesc(String dayDesc) {
		this.dayDesc = dayDesc;
	}

	public Integer getPaymentDay() {
		return paymentDay;
	}

	public DueDate paymentDay(Integer paymentDay) {
		this.paymentDay = paymentDay;
		return this;
	}

	public void setPaymentDay(Integer paymentDay) {
		this.paymentDay = paymentDay;
	}

	public String getFrequency() {
		return frequency;
	}

	public DueDate frequency(String frequency) {
		this.frequency = frequency;
		return this;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public College getCollege() {
		return college;
	}

	public DueDate college(College college) {
		this.college = college;
		return this;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Branch getBranch() {
		return branch;
	}

	public DueDate branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
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
		DueDate dueDate = (DueDate) o;
		if (dueDate.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), dueDate.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "DueDate{" + "id=" + getId() + ", paymentMethod='" + getPaymentMethod()
				+ "'" + ", installments=" + getInstallments() + ", dayDesc='"
				+ getDayDesc() + "'" + ", paymentDay=" + getPaymentDay() + ", frequency='"
				+ getFrequency() + "'" + "}";
	}
}
