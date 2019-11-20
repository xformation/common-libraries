package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AdminOverview.
 */
@Document(indexName = "adminoverview")
public class AdminOverview implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private LocalDate chooseDate;

	@NotNull
	private String section;

	@NotNull
	private String lectureOne;

	@NotNull
	private String lectureTwo;

	@NotNull
	private String lectureThree;

	@NotNull
	private String lectureFour;

	@NotNull
	private String lectureFive;

	@NotNull
	private String lectureSix;

	@NotNull
	private String lectureSeven;

	@NotNull
	private String lectureEight;

	@JsonIgnoreProperties("")
	private Department department;

	@JsonIgnoreProperties("")
	private Batch batch;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getChooseDate() {
		return chooseDate;
	}

	public AdminOverview chooseDate(LocalDate chooseDate) {
		this.chooseDate = chooseDate;
		return this;
	}

	public void setChooseDate(LocalDate chooseDate) {
		this.chooseDate = chooseDate;
	}

	public void setChooseDate(String date) {
		this.chooseDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getSection() {
		return section;
	}

	public AdminOverview section(String section) {
		this.section = section;
		return this;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getLectureOne() {
		return lectureOne;
	}

	public AdminOverview lectureOne(String lectureOne) {
		this.lectureOne = lectureOne;
		return this;
	}

	public void setLectureOne(String lectureOne) {
		this.lectureOne = lectureOne;
	}

	public String getLectureTwo() {
		return lectureTwo;
	}

	public AdminOverview lectureTwo(String lectureTwo) {
		this.lectureTwo = lectureTwo;
		return this;
	}

	public void setLectureTwo(String lectureTwo) {
		this.lectureTwo = lectureTwo;
	}

	public String getLectureThree() {
		return lectureThree;
	}

	public AdminOverview lectureThree(String lectureThree) {
		this.lectureThree = lectureThree;
		return this;
	}

	public void setLectureThree(String lectureThree) {
		this.lectureThree = lectureThree;
	}

	public String getLectureFour() {
		return lectureFour;
	}

	public AdminOverview lectureFour(String lectureFour) {
		this.lectureFour = lectureFour;
		return this;
	}

	public void setLectureFour(String lectureFour) {
		this.lectureFour = lectureFour;
	}

	public String getLectureFive() {
		return lectureFive;
	}

	public AdminOverview lectureFive(String lectureFive) {
		this.lectureFive = lectureFive;
		return this;
	}

	public void setLectureFive(String lectureFive) {
		this.lectureFive = lectureFive;
	}

	public String getLectureSix() {
		return lectureSix;
	}

	public AdminOverview lectureSix(String lectureSix) {
		this.lectureSix = lectureSix;
		return this;
	}

	public void setLectureSix(String lectureSix) {
		this.lectureSix = lectureSix;
	}

	public String getLectureSeven() {
		return lectureSeven;
	}

	public AdminOverview lectureSeven(String lectureSeven) {
		this.lectureSeven = lectureSeven;
		return this;
	}

	public void setLectureSeven(String lectureSeven) {
		this.lectureSeven = lectureSeven;
	}

	public String getLectureEight() {
		return lectureEight;
	}

	public AdminOverview lectureEight(String lectureEight) {
		this.lectureEight = lectureEight;
		return this;
	}

	public void setLectureEight(String lectureEight) {
		this.lectureEight = lectureEight;
	}

	public Department getDepartment() {
		return department;
	}

	public AdminOverview department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Batch getBatch() {
		return batch;
	}

	public AdminOverview batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
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
		AdminOverview adminOverview = (AdminOverview) o;
		if (adminOverview.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), adminOverview.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AdminOverview{" + "id=" + getId() + ", chooseDate='" + getChooseDate()
				+ "'" + ", section='" + getSection() + "'" + ", lectureOne='"
				+ getLectureOne() + "'" + ", lectureTwo='" + getLectureTwo() + "'"
				+ ", lectureThree='" + getLectureThree() + "'" + ", lectureFour='"
				+ getLectureFour() + "'" + ", lectureFive='" + getLectureFive() + "'"
				+ ", lectureSix='" + getLectureSix() + "'" + ", lectureSeven='"
				+ getLectureSeven() + "'" + ", lectureEight='" + getLectureEight() + "'"
				+ "}";
	}
}
