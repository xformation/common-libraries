package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Library.
 */
@Document(indexName = "library")
public class Library implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String bookTitle;

	@NotNull
	private String author;

	@NotNull
	private Long noOfCopies;

	@NotNull
	private Long bookNo;

	private String additionalInfo;

	private Long uniqueNo;

	@JsonIgnoreProperties("libraries")
	private Batch batch;

	@JsonIgnoreProperties("libraries")
	private Subject subject;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public Library bookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
		return this;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public Library author(String author) {
		this.author = author;
		return this;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getNoOfCopies() {
		return noOfCopies;
	}

	public Library noOfCopies(Long noOfCopies) {
		this.noOfCopies = noOfCopies;
		return this;
	}

	public void setNoOfCopies(Long noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public Long getBookNo() {
		return bookNo;
	}

	public Library bookNo(Long bookNo) {
		this.bookNo = bookNo;
		return this;
	}

	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public Library additionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public Long getUniqueNo() {
		return uniqueNo;
	}

	public Library uniqueNo(Long uniqueNo) {
		this.uniqueNo = uniqueNo;
		return this;
	}

	public void setUniqueNo(Long uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

	public Batch getBatch() {
		return batch;
	}

	public Library batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public Subject getSubject() {
		return subject;
	}

	public Library subject(Subject subject) {
		this.subject = subject;
		return this;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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
		Library library = (Library) o;
		if (library.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), library.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Library{" + "id=" + getId() + ", bookTitle='" + getBookTitle() + "'"
				+ ", author='" + getAuthor() + "'" + ", noOfCopies=" + getNoOfCopies()
				+ ", bookNo=" + getBookNo() + ", additionalInfo='" + getAdditionalInfo()
				+ "'" + ", uniqueNo=" + getUniqueNo() + "}";
	}
}
