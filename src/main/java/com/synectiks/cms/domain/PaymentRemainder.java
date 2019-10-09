package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A PaymentRemainder.
 */
@Document(indexName = "paymentremainder")
public class PaymentRemainder implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String isAutoRemainder;

	private String isFirstPaymentRemainder;

	private Integer firstPaymentRemainderDays;

	private String isSecondPaymentRemainder;

	private Integer secondPaymentRemainderDays;

	private String isOverDuePaymentRemainder;

	private String overDuePaymentRemainderAfterDueDateOrUntilPaid;

	private Integer overDuePaymentRemainderDays;

	private String isRemainderRecipients;

	private String remainderRecipients;

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

	public String getIsAutoRemainder() {
		return isAutoRemainder;
	}

	public PaymentRemainder isAutoRemainder(String isAutoRemainder) {
		this.isAutoRemainder = isAutoRemainder;
		return this;
	}

	public void setIsAutoRemainder(String isAutoRemainder) {
		this.isAutoRemainder = isAutoRemainder;
	}

	public String getIsFirstPaymentRemainder() {
		return isFirstPaymentRemainder;
	}

	public PaymentRemainder isFirstPaymentRemainder(String isFirstPaymentRemainder) {
		this.isFirstPaymentRemainder = isFirstPaymentRemainder;
		return this;
	}

	public void setIsFirstPaymentRemainder(String isFirstPaymentRemainder) {
		this.isFirstPaymentRemainder = isFirstPaymentRemainder;
	}

	public Integer getFirstPaymentRemainderDays() {
		return firstPaymentRemainderDays;
	}

	public PaymentRemainder firstPaymentRemainderDays(Integer firstPaymentRemainderDays) {
		this.firstPaymentRemainderDays = firstPaymentRemainderDays;
		return this;
	}

	public void setFirstPaymentRemainderDays(Integer firstPaymentRemainderDays) {
		this.firstPaymentRemainderDays = firstPaymentRemainderDays;
	}

	public String getIsSecondPaymentRemainder() {
		return isSecondPaymentRemainder;
	}

	public PaymentRemainder isSecondPaymentRemainder(String isSecondPaymentRemainder) {
		this.isSecondPaymentRemainder = isSecondPaymentRemainder;
		return this;
	}

	public void setIsSecondPaymentRemainder(String isSecondPaymentRemainder) {
		this.isSecondPaymentRemainder = isSecondPaymentRemainder;
	}

	public Integer getSecondPaymentRemainderDays() {
		return secondPaymentRemainderDays;
	}

	public PaymentRemainder secondPaymentRemainderDays(
			Integer secondPaymentRemainderDays) {
		this.secondPaymentRemainderDays = secondPaymentRemainderDays;
		return this;
	}

	public void setSecondPaymentRemainderDays(Integer secondPaymentRemainderDays) {
		this.secondPaymentRemainderDays = secondPaymentRemainderDays;
	}

	public String getIsOverDuePaymentRemainder() {
		return isOverDuePaymentRemainder;
	}

	public PaymentRemainder isOverDuePaymentRemainder(String isOverDuePaymentRemainder) {
		this.isOverDuePaymentRemainder = isOverDuePaymentRemainder;
		return this;
	}

	public void setIsOverDuePaymentRemainder(String isOverDuePaymentRemainder) {
		this.isOverDuePaymentRemainder = isOverDuePaymentRemainder;
	}

	public String getOverDuePaymentRemainderAfterDueDateOrUntilPaid() {
		return overDuePaymentRemainderAfterDueDateOrUntilPaid;
	}

	public PaymentRemainder overDuePaymentRemainderAfterDueDateOrUntilPaid(
			String overDuePaymentRemainderAfterDueDateOrUntilPaid) {
		this.overDuePaymentRemainderAfterDueDateOrUntilPaid = overDuePaymentRemainderAfterDueDateOrUntilPaid;
		return this;
	}

	public void setOverDuePaymentRemainderAfterDueDateOrUntilPaid(
			String overDuePaymentRemainderAfterDueDateOrUntilPaid) {
		this.overDuePaymentRemainderAfterDueDateOrUntilPaid = overDuePaymentRemainderAfterDueDateOrUntilPaid;
	}

	public Integer getOverDuePaymentRemainderDays() {
		return overDuePaymentRemainderDays;
	}

	public PaymentRemainder overDuePaymentRemainderDays(
			Integer overDuePaymentRemainderDays) {
		this.overDuePaymentRemainderDays = overDuePaymentRemainderDays;
		return this;
	}

	public void setOverDuePaymentRemainderDays(Integer overDuePaymentRemainderDays) {
		this.overDuePaymentRemainderDays = overDuePaymentRemainderDays;
	}

	public String getIsRemainderRecipients() {
		return isRemainderRecipients;
	}

	public PaymentRemainder isRemainderRecipients(String isRemainderRecipients) {
		this.isRemainderRecipients = isRemainderRecipients;
		return this;
	}

	public void setIsRemainderRecipients(String isRemainderRecipients) {
		this.isRemainderRecipients = isRemainderRecipients;
	}

	public String getRemainderRecipients() {
		return remainderRecipients;
	}

	public PaymentRemainder remainderRecipients(String remainderRecipients) {
		this.remainderRecipients = remainderRecipients;
		return this;
	}

	public void setRemainderRecipients(String remainderRecipients) {
		this.remainderRecipients = remainderRecipients;
	}

	public College getCollege() {
		return college;
	}

	public PaymentRemainder college(College college) {
		this.college = college;
		return this;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Branch getBranch() {
		return branch;
	}

	public PaymentRemainder branch(Branch branch) {
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
		PaymentRemainder paymentRemainder = (PaymentRemainder) o;
		if (paymentRemainder.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), paymentRemainder.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "PaymentRemainder{" + "id=" + getId() + ", isAutoRemainder='"
				+ getIsAutoRemainder() + "'" + ", isFirstPaymentRemainder='"
				+ getIsFirstPaymentRemainder() + "'" + ", firstPaymentRemainderDays="
				+ getFirstPaymentRemainderDays() + ", isSecondPaymentRemainder='"
				+ getIsSecondPaymentRemainder() + "'" + ", secondPaymentRemainderDays="
				+ getSecondPaymentRemainderDays() + ", isOverDuePaymentRemainder='"
				+ getIsOverDuePaymentRemainder() + "'"
				+ ", overDuePaymentRemainderAfterDueDateOrUntilPaid='"
				+ getOverDuePaymentRemainderAfterDueDateOrUntilPaid() + "'"
				+ ", overDuePaymentRemainderDays=" + getOverDuePaymentRemainderDays()
				+ ", isRemainderRecipients='" + getIsRemainderRecipients() + "'"
				+ ", remainderRecipients='" + getRemainderRecipients() + "'" + "}";
	}
}
