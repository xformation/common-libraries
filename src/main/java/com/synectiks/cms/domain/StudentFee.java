package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.synectiks.commons.interfaces.IESEntity;

/**
 * A StudentFee.
 */
@Document(indexName = "studentfee")
public class StudentFee implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String totalFee;

	@NotNull
	private String feesPaid;

	@NotNull
	private String feesDue;

	@NotNull
	private LocalDate dueDate;

	@NotNull
	private String totalRemaining;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public StudentFee totalFee(String totalFee) {
		this.totalFee = totalFee;
		return this;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getFeesPaid() {
		return feesPaid;
	}

	public StudentFee feesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
		return this;
	}

	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}

	public String getFeesDue() {
		return feesDue;
	}

	public StudentFee feesDue(String feesDue) {
		this.feesDue = feesDue;
		return this;
	}

	public void setFeesDue(String feesDue) {
		this.feesDue = feesDue;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public StudentFee dueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getTotalRemaining() {
		return totalRemaining;
	}

	public StudentFee totalRemaining(String totalRemaining) {
		this.totalRemaining = totalRemaining;
		return this;
	}

	public void setTotalRemaining(String totalRemaining) {
		this.totalRemaining = totalRemaining;
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
		StudentFee studentFee = (StudentFee) o;
		if (studentFee.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), studentFee.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "StudentFee{" + "id=" + getId() + ", totalFee='" + getTotalFee() + "'"
				+ ", feesPaid='" + getFeesPaid() + "'" + ", feesDue='" + getFeesDue()
				+ "'" + ", dueDate='" + getDueDate() + "'" + ", totalRemaining='"
				+ getTotalRemaining() + "'" + "}";
	}
}
