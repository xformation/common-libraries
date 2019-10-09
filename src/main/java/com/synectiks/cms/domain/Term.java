package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Term.
 */
@Document(indexName = "term")
public class Term implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String termsDesc;

	@NotNull
	private LocalDate startDate;

	@NotNull
	private LocalDate endDate;

	@NotNull
	private String termStatus;

	@JsonIgnoreProperties("terms")
	private AcademicYear academicyear;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTermsDesc() {
		return termsDesc;
	}

	public Term termsDesc(String termsDesc) {
		this.termsDesc = termsDesc;
		return this;
	}

	public void setTermsDesc(String termsDesc) {
		this.termsDesc = termsDesc;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public Term startDate(LocalDate startDate) {
		this.startDate = startDate;
		return this;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public Term endDate(LocalDate endDate) {
		this.endDate = endDate;
		return this;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getTermStatus() {
		return termStatus;
	}

	public Term termStatus(String termStatus) {
		this.termStatus = termStatus;
		return this;
	}

	public void setTermStatus(String termStatus) {
		this.termStatus = termStatus;
	}

	public AcademicYear getAcademicyear() {
		return academicyear;
	}

	public Term academicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
		return this;
	}

	public void setAcademicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
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
		Term term = (Term) o;
		if (term.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), term.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Term{" + "id=" + getId() + ", termsDesc='" + getTermsDesc() + "'"
				+ ", startDate='" + getStartDate() + "'" + ", endDate='" + getEndDate()
				+ "'" + ", termStatus='" + getTermStatus() + "'" + "}";
	}
}
