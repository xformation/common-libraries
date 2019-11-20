package com.synectiks.cms.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AcademicExamSetting.
 */
@Document(indexName = "academicexamsetting")
public class AcademicExamSetting implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String examName;

	@NotNull
	private String semester;

	@NotNull
	private LocalDate examDate;

	@NotNull
	private String startTime;

	@NotNull
	private String endTime;

	private String gradeType;

	@NotNull
	private Integer total;

	@NotNull
	private Integer passing;

	private String actions;

	private Long groupvalue;

	@NotNull
	private Long countvalue;

	@JsonIgnoreProperties("academicExamSettings")
	private Branch branch;

	@JsonIgnoreProperties("academicExamSettings")
	private Subject subject;

	@JsonIgnoreProperties("academicExamSettings")
	private Department department;

	@JsonIgnoreProperties("academicExamSettings")
	private TypeOfGrading typeOfGrading;

	@JsonIgnoreProperties("academicExamSettings")
	private AcademicYear academicyear;

	@JsonIgnoreProperties("academicExamSettings")
	private Section section;

	@JsonIgnoreProperties("academicExamSettings")
	private Batch batch;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamName() {
		return examName;
	}

	public AcademicExamSetting examName(String examName) {
		this.examName = examName;
		return this;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getSemester() {
		return semester;
	}

	public AcademicExamSetting semester(String semester) {
		this.semester = semester;
		return this;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public LocalDate getExamDate() {
		return examDate;
	}

	public AcademicExamSetting examDate(LocalDate examDate) {
		this.examDate = examDate;
		return this;
	}

	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = LocalDate.parse(examDate,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getStartTime() {
		return startTime;
	}

	public AcademicExamSetting startTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public AcademicExamSetting endTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getGradeType() {
		return gradeType;
	}

	public AcademicExamSetting gradeType(String gradeType) {
		this.gradeType = gradeType;
		return this;
	}

	public void setGradeType(String gradeType) {
		this.gradeType = gradeType;
	}

	public Integer getTotal() {
		return total;
	}

	public AcademicExamSetting total(Integer total) {
		this.total = total;
		return this;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPassing() {
		return passing;
	}

	public AcademicExamSetting passing(Integer passing) {
		this.passing = passing;
		return this;
	}

	public void setPassing(Integer passing) {
		this.passing = passing;
	}

	public String getActions() {
		return actions;
	}

	public AcademicExamSetting actions(String actions) {
		this.actions = actions;
		return this;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public Long getGroupvalue() {
		return groupvalue;
	}

	public AcademicExamSetting groupvalue(Long groupvalue) {
		this.groupvalue = groupvalue;
		return this;
	}

	public void setGroupvalue(Long groupvalue) {
		this.groupvalue = groupvalue;
	}

	public Long getCountvalue() {
		return countvalue;
	}

	public AcademicExamSetting countvalue(Long countvalue) {
		this.countvalue = countvalue;
		return this;
	}

	public void setCountvalue(Long countvalue) {
		this.countvalue = countvalue;
	}

	public Branch getBranch() {
		return branch;
	}

	public AcademicExamSetting branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Subject getSubject() {
		return subject;
	}

	public AcademicExamSetting subject(Subject subject) {
		this.subject = subject;
		return this;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Department getDepartment() {
		return department;
	}

	public AcademicExamSetting department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public TypeOfGrading getTypeOfGrading() {
		return typeOfGrading;
	}

	public AcademicExamSetting typeOfGrading(TypeOfGrading typeOfGrading) {
		this.typeOfGrading = typeOfGrading;
		return this;
	}

	public void setTypeOfGrading(TypeOfGrading typeOfGrading) {
		this.typeOfGrading = typeOfGrading;
	}

	public AcademicYear getAcademicyear() {
		return academicyear;
	}

	public AcademicExamSetting academicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
		return this;
	}

	public void setAcademicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
	}

	public Section getSection() {
		return section;
	}

	public AcademicExamSetting section(Section section) {
		this.section = section;
		return this;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Batch getBatch() {
		return batch;
	}

	public AcademicExamSetting batch(Batch batch) {
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
		AcademicExamSetting academicExamSetting = (AcademicExamSetting) o;
		if (academicExamSetting.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), academicExamSetting.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AcademicExamSetting{" + "id=" + getId() + ", examName='" + getExamName()
				+ "'" + ", semester='" + getSemester() + "'" + ", examDate='"
				+ getExamDate() + "'" + ", startTime='" + getStartTime() + "'"
				+ ", endTime='" + getEndTime() + "'" + ", gradeType='" + getGradeType()
				+ "'" + ", total=" + getTotal() + ", passing=" + getPassing()
				+ ", actions='" + getActions() + "'" + ", groupvalue=" + getGroupvalue()
				+ ", countvalue=" + getCountvalue() + "}";
	}
}
