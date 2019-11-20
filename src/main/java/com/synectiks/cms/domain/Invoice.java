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
 * A Invoice.
 */
@Document(indexName = "invoice")
public class Invoice implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String invoiceNumber;

	@NotNull
	private Long amountPaid;

	@NotNull
	private LocalDate paymentDate;

	@NotNull
	private LocalDate nextPaymentDate;

	@NotNull
	private Long outStandingAmount;

	@NotNull
	private String modeOfPayment;

	private Long chequeNumber;

	private Long demandDraftNumber;

	private String onlineTxnRefNumber;

	@NotNull
	private String paymentStatus;

	@NotNull
	private String comments;

	@NotNull
	private String updatedBy;

	@NotNull
	private LocalDate updatedOn;

	@JsonIgnoreProperties("")
	private FeeCategory feeCategory;

	@JsonIgnoreProperties("")
	private FeeDetails feeDetails;

	@JsonIgnoreProperties("")
	private DueDate dueDate;

	@JsonIgnoreProperties("")
	private PaymentRemainder paymentRemainder;

	@JsonIgnoreProperties("")
	private College college;

	@JsonIgnoreProperties("")
	private Branch branch;

	@JsonIgnoreProperties("")
	private Student student;

	@JsonIgnoreProperties("")
	private AcademicYear academicYear;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public Invoice invoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
		return this;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Long getAmountPaid() {
		return amountPaid;
	}

	public Invoice amountPaid(Long amountPaid) {
		this.amountPaid = amountPaid;
		return this;
	}

	public void setAmountPaid(Long amountPaid) {
		this.amountPaid = amountPaid;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public Invoice paymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setPaymentDate(String date) {
		this.paymentDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getNextPaymentDate() {
		return nextPaymentDate;
	}

	public Invoice nextPaymentDate(LocalDate nextPaymentDate) {
		this.nextPaymentDate = nextPaymentDate;
		return this;
	}

	public void setNextPaymentDate(LocalDate nextPaymentDate) {
		this.nextPaymentDate = nextPaymentDate;
	}

	public void setNextPaymentDate(String date) {
		this.nextPaymentDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public Long getOutStandingAmount() {
		return outStandingAmount;
	}

	public Invoice outStandingAmount(Long outStandingAmount) {
		this.outStandingAmount = outStandingAmount;
		return this;
	}

	public void setOutStandingAmount(Long outStandingAmount) {
		this.outStandingAmount = outStandingAmount;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public Invoice modeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
		return this;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public Long getChequeNumber() {
		return chequeNumber;
	}

	public Invoice chequeNumber(Long chequeNumber) {
		this.chequeNumber = chequeNumber;
		return this;
	}

	public void setChequeNumber(Long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public Long getDemandDraftNumber() {
		return demandDraftNumber;
	}

	public Invoice demandDraftNumber(Long demandDraftNumber) {
		this.demandDraftNumber = demandDraftNumber;
		return this;
	}

	public void setDemandDraftNumber(Long demandDraftNumber) {
		this.demandDraftNumber = demandDraftNumber;
	}

	public String getOnlineTxnRefNumber() {
		return onlineTxnRefNumber;
	}

	public Invoice onlineTxnRefNumber(String onlineTxnRefNumber) {
		this.onlineTxnRefNumber = onlineTxnRefNumber;
		return this;
	}

	public void setOnlineTxnRefNumber(String onlineTxnRefNumber) {
		this.onlineTxnRefNumber = onlineTxnRefNumber;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public Invoice paymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
		return this;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getComments() {
		return comments;
	}

	public Invoice comments(String comments) {
		this.comments = comments;
		return this;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Invoice updatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public Invoice updatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public void setUpdatedOn(String date) {
		this.updatedOn = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public FeeCategory getFeeCategory() {
		return feeCategory;
	}

	public Invoice feeCategory(FeeCategory feeCategory) {
		this.feeCategory = feeCategory;
		return this;
	}

	public void setFeeCategory(FeeCategory feeCategory) {
		this.feeCategory = feeCategory;
	}

	public FeeDetails getFeeDetails() {
		return feeDetails;
	}

	public Invoice feeDetails(FeeDetails feeDetails) {
		this.feeDetails = feeDetails;
		return this;
	}

	public void setFeeDetails(FeeDetails feeDetails) {
		this.feeDetails = feeDetails;
	}

	public DueDate getDueDate() {
		return dueDate;
	}

	public Invoice dueDate(DueDate dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public void setDueDate(DueDate dueDate) {
		this.dueDate = dueDate;
	}

	public PaymentRemainder getPaymentRemainder() {
		return paymentRemainder;
	}

	public Invoice paymentRemainder(PaymentRemainder paymentRemainder) {
		this.paymentRemainder = paymentRemainder;
		return this;
	}

	public void setPaymentRemainder(PaymentRemainder paymentRemainder) {
		this.paymentRemainder = paymentRemainder;
	}

	public College getCollege() {
		return college;
	}

	public Invoice college(College college) {
		this.college = college;
		return this;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Branch getBranch() {
		return branch;
	}

	public Invoice branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Student getStudent() {
		return student;
	}

	public Invoice student(Student student) {
		this.student = student;
		return this;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public Invoice academicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
		return this;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
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
		Invoice invoice = (Invoice) o;
		if (invoice.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), invoice.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Invoice{" + "id=" + getId() + ", invoiceNumber='" + getInvoiceNumber()
				+ "'" + ", amountPaid=" + getAmountPaid() + ", paymentDate='"
				+ getPaymentDate() + "'" + ", nextPaymentDate='" + getNextPaymentDate()
				+ "'" + ", outStandingAmount=" + getOutStandingAmount()
				+ ", modeOfPayment='" + getModeOfPayment() + "'" + ", chequeNumber="
				+ getChequeNumber() + ", demandDraftNumber=" + getDemandDraftNumber()
				+ ", onlineTxnRefNumber='" + getOnlineTxnRefNumber() + "'"
				+ ", paymentStatus='" + getPaymentStatus() + "'" + ", comments='"
				+ getComments() + "'" + ", updatedBy='" + getUpdatedBy() + "'"
				+ ", updatedOn='" + getUpdatedOn() + "'" + "}";
	}
}
