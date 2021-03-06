package com.synectiks.cms.entities;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AdmissionApplication.
 */
@Entity
@Table(name = "admission_application")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "admissionapplication")
public class AdmissionApplication implements Serializable, IESEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "source_of_application")
    private String sourceOfApplication;

    


	@Column(name = "application_date")
    @JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate applicationDate;

    @Column(name = "completion_date")
    @JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate completionDate;

    @Column(name = "admission_no")
    private Long admissionNo;

    @Column(name = "admission_date")
    @JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate admissionDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "application_status")
    private String applicationStatus;

    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "academic_year_id")
    private Long academicYearId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    @JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    @JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate updatedOn;

    @ManyToOne
    @JsonIgnoreProperties("admissionApplications")
    private AdmissionEnquiry admissionEnquiry;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceOfApplication() {
        return sourceOfApplication;
    }

    public AdmissionApplication sourceOfApplication(String sourceOfApplication) {
        this.sourceOfApplication = sourceOfApplication;
        return this;
    }

    public void setSourceOfApplication(String sourceOfApplication) {
        this.sourceOfApplication = sourceOfApplication;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public AdmissionApplication applicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
        return this;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public AdmissionApplication completionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public Long getAdmissionNo() {
        return admissionNo;
    }

    public AdmissionApplication admissionNo(Long admissionNo) {
        this.admissionNo = admissionNo;
        return this;
    }

    public void setAdmissionNo(Long admissionNo) {
        this.admissionNo = admissionNo;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public AdmissionApplication admissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
        return this;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getComments() {
        return comments;
    }

    public AdmissionApplication comments(String comments) {
        this.comments = comments;
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public AdmissionApplication applicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
        return this;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Long getBranchId() {
        return branchId;
    }

    public AdmissionApplication branchId(Long branchId) {
        this.branchId = branchId;
        return this;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Long getAcademicYearId() {
        return academicYearId;
    }

    public AdmissionApplication academicYearId(Long academicYearId) {
        this.academicYearId = academicYearId;
        return this;
    }

    public void setAcademicYearId(Long academicYearId) {
        this.academicYearId = academicYearId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public AdmissionApplication createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public AdmissionApplication createdOn(LocalDate createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public AdmissionApplication updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDate getUpdatedOn() {
        return updatedOn;
    }

    public AdmissionApplication updatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    public void setUpdatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
    }

    public AdmissionEnquiry getAdmissionEnquiry() {
        return admissionEnquiry;
    }

    public AdmissionApplication admissionEnquiry(AdmissionEnquiry admissionEnquiry) {
        this.admissionEnquiry = admissionEnquiry;
        return this;
    }

    public void setAdmissionEnquiry(AdmissionEnquiry admissionEnquiry) {
        this.admissionEnquiry = admissionEnquiry;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdmissionApplication)) {
            return false;
        }
        return id != null && id.equals(((AdmissionApplication) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "AdmissionApplication{" +
            "id=" + getId() +
            ", sourceOfApplication='" + getSourceOfApplication() + "'" +
            ", applicationDate='" + getApplicationDate() + "'" +
            ", completionDate='" + getCompletionDate() + "'" +
            ", admissionNo=" + getAdmissionNo() +
            ", admissionDate='" + getAdmissionDate() + "'" +
            ", comments='" + getComments() + "'" +
            ", applicationStatus='" + getApplicationStatus() + "'" +
            ", branchId=" + getBranchId() +
            ", academicYearId=" + getAcademicYearId() +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdOn='" + getCreatedOn() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedOn='" + getUpdatedOn() + "'" +
            "}";
    }
}
