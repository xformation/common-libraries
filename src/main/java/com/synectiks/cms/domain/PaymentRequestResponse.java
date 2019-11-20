package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A PaymentRequestResponse.
 */
@Document(indexName = "paymentrequestresponse")
public class PaymentRequestResponse implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	@Field(type = FieldType.Keyword)
	private Long id;

	private String requestMerchantID;

	private String requestUniqueTransactionNo;

	private String requestTxnAmount;

	private String requestCurrencyType;

	private String requestTypeField1;

	private String requestSecurityID;

	private String requestTypeField2;

	private String requestTxtadditional1;

	private String requestTxtadditional2;

	private String requestTxtadditional3;

	private String requestTxtadditional4;

	private String requestTxtadditional5;

	private String requestTxtadditional6;

	private String requestTxtadditional7;

	private String requestRu;

	private String requestCheckSum;

	private String requestMsg;

	private String responseMerchantID;

	private String responseUniqueTransactionNo;

	private String responseTxnReferenceNo;

	private String responseBankReferenceNo;

	private String responseTxnAmount;

	private String responseBankID;

	private String responseBankMerchantID;

	private String responseTxnType;

	private String responseCurrencyName;

	private String responseItemCode;

	private String responseSecurityType;

	private String responseSecurityID;

	private String responseSecurityPassword;

	private String responseTxnDate;

	private String responseAuthStatus;

	private String responseSettlementType;

	private String responseAdditionalInfo1;

	private String responseAdditionalInfo2;

	private String responseAdditionalInfo3;

	private String responseAdditionalInfo4;

	private String responseAdditionalInfo5;

	private String responseAdditionalInfo6;

	private String responseAdditionalInfo7;

	private String responseErrorStatus;

	private String responseErrorDescription;

	private String responseCheckSum;

	private String responseMsg;

	private String user;

	private LocalDate requestTxnDate;

	private String requestTxnTime;

	@JsonIgnoreProperties("paymentRequestResponses")
	private Branch branch;

	@JsonIgnoreProperties("paymentRequestResponses")
	private AcademicYear academicYear;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequestMerchantID() {
		return requestMerchantID;
	}

	public PaymentRequestResponse requestMerchantID(String requestMerchantID) {
		this.requestMerchantID = requestMerchantID;
		return this;
	}

	public void setRequestMerchantID(String requestMerchantID) {
		this.requestMerchantID = requestMerchantID;
	}

	public String getRequestUniqueTransactionNo() {
		return requestUniqueTransactionNo;
	}

	public PaymentRequestResponse requestUniqueTransactionNo(
			String requestUniqueTransactionNo) {
		this.requestUniqueTransactionNo = requestUniqueTransactionNo;
		return this;
	}

	public void setRequestUniqueTransactionNo(String requestUniqueTransactionNo) {
		this.requestUniqueTransactionNo = requestUniqueTransactionNo;
	}

	public String getRequestTxnAmount() {
		return requestTxnAmount;
	}

	public PaymentRequestResponse requestTxnAmount(String requestTxnAmount) {
		this.requestTxnAmount = requestTxnAmount;
		return this;
	}

	public void setRequestTxnAmount(String requestTxnAmount) {
		this.requestTxnAmount = requestTxnAmount;
	}

	public String getRequestCurrencyType() {
		return requestCurrencyType;
	}

	public PaymentRequestResponse requestCurrencyType(String requestCurrencyType) {
		this.requestCurrencyType = requestCurrencyType;
		return this;
	}

	public void setRequestCurrencyType(String requestCurrencyType) {
		this.requestCurrencyType = requestCurrencyType;
	}

	public String getRequestTypeField1() {
		return requestTypeField1;
	}

	public PaymentRequestResponse requestTypeField1(String requestTypeField1) {
		this.requestTypeField1 = requestTypeField1;
		return this;
	}

	public void setRequestTypeField1(String requestTypeField1) {
		this.requestTypeField1 = requestTypeField1;
	}

	public String getRequestSecurityID() {
		return requestSecurityID;
	}

	public PaymentRequestResponse requestSecurityID(String requestSecurityID) {
		this.requestSecurityID = requestSecurityID;
		return this;
	}

	public void setRequestSecurityID(String requestSecurityID) {
		this.requestSecurityID = requestSecurityID;
	}

	public String getRequestTypeField2() {
		return requestTypeField2;
	}

	public PaymentRequestResponse requestTypeField2(String requestTypeField2) {
		this.requestTypeField2 = requestTypeField2;
		return this;
	}

	public void setRequestTypeField2(String requestTypeField2) {
		this.requestTypeField2 = requestTypeField2;
	}

	public String getRequestTxtadditional1() {
		return requestTxtadditional1;
	}

	public PaymentRequestResponse requestTxtadditional1(String requestTxtadditional1) {
		this.requestTxtadditional1 = requestTxtadditional1;
		return this;
	}

	public void setRequestTxtadditional1(String requestTxtadditional1) {
		this.requestTxtadditional1 = requestTxtadditional1;
	}

	public String getRequestTxtadditional2() {
		return requestTxtadditional2;
	}

	public PaymentRequestResponse requestTxtadditional2(String requestTxtadditional2) {
		this.requestTxtadditional2 = requestTxtadditional2;
		return this;
	}

	public void setRequestTxtadditional2(String requestTxtadditional2) {
		this.requestTxtadditional2 = requestTxtadditional2;
	}

	public String getRequestTxtadditional3() {
		return requestTxtadditional3;
	}

	public PaymentRequestResponse requestTxtadditional3(String requestTxtadditional3) {
		this.requestTxtadditional3 = requestTxtadditional3;
		return this;
	}

	public void setRequestTxtadditional3(String requestTxtadditional3) {
		this.requestTxtadditional3 = requestTxtadditional3;
	}

	public String getRequestTxtadditional4() {
		return requestTxtadditional4;
	}

	public PaymentRequestResponse requestTxtadditional4(String requestTxtadditional4) {
		this.requestTxtadditional4 = requestTxtadditional4;
		return this;
	}

	public void setRequestTxtadditional4(String requestTxtadditional4) {
		this.requestTxtadditional4 = requestTxtadditional4;
	}

	public String getRequestTxtadditional5() {
		return requestTxtadditional5;
	}

	public PaymentRequestResponse requestTxtadditional5(String requestTxtadditional5) {
		this.requestTxtadditional5 = requestTxtadditional5;
		return this;
	}

	public void setRequestTxtadditional5(String requestTxtadditional5) {
		this.requestTxtadditional5 = requestTxtadditional5;
	}

	public String getRequestTxtadditional6() {
		return requestTxtadditional6;
	}

	public PaymentRequestResponse requestTxtadditional6(String requestTxtadditional6) {
		this.requestTxtadditional6 = requestTxtadditional6;
		return this;
	}

	public void setRequestTxtadditional6(String requestTxtadditional6) {
		this.requestTxtadditional6 = requestTxtadditional6;
	}

	public String getRequestTxtadditional7() {
		return requestTxtadditional7;
	}

	public PaymentRequestResponse requestTxtadditional7(String requestTxtadditional7) {
		this.requestTxtadditional7 = requestTxtadditional7;
		return this;
	}

	public void setRequestTxtadditional7(String requestTxtadditional7) {
		this.requestTxtadditional7 = requestTxtadditional7;
	}

	public String getRequestRu() {
		return requestRu;
	}

	public PaymentRequestResponse requestRu(String requestRu) {
		this.requestRu = requestRu;
		return this;
	}

	public void setRequestRu(String requestRu) {
		this.requestRu = requestRu;
	}

	public String getRequestCheckSum() {
		return requestCheckSum;
	}

	public PaymentRequestResponse requestCheckSum(String requestCheckSum) {
		this.requestCheckSum = requestCheckSum;
		return this;
	}

	public void setRequestCheckSum(String requestCheckSum) {
		this.requestCheckSum = requestCheckSum;
	}

	public String getRequestMsg() {
		return requestMsg;
	}

	public PaymentRequestResponse requestMsg(String requestMsg) {
		this.requestMsg = requestMsg;
		return this;
	}

	public void setRequestMsg(String requestMsg) {
		this.requestMsg = requestMsg;
	}

	public String getResponseMerchantID() {
		return responseMerchantID;
	}

	public PaymentRequestResponse responseMerchantID(String responseMerchantID) {
		this.responseMerchantID = responseMerchantID;
		return this;
	}

	public void setResponseMerchantID(String responseMerchantID) {
		this.responseMerchantID = responseMerchantID;
	}

	public String getResponseUniqueTransactionNo() {
		return responseUniqueTransactionNo;
	}

	public PaymentRequestResponse responseUniqueTransactionNo(
			String responseUniqueTransactionNo) {
		this.responseUniqueTransactionNo = responseUniqueTransactionNo;
		return this;
	}

	public void setResponseUniqueTransactionNo(String responseUniqueTransactionNo) {
		this.responseUniqueTransactionNo = responseUniqueTransactionNo;
	}

	public String getResponseTxnReferenceNo() {
		return responseTxnReferenceNo;
	}

	public PaymentRequestResponse responseTxnReferenceNo(String responseTxnReferenceNo) {
		this.responseTxnReferenceNo = responseTxnReferenceNo;
		return this;
	}

	public void setResponseTxnReferenceNo(String responseTxnReferenceNo) {
		this.responseTxnReferenceNo = responseTxnReferenceNo;
	}

	public String getResponseBankReferenceNo() {
		return responseBankReferenceNo;
	}

	public PaymentRequestResponse responseBankReferenceNo(
			String responseBankReferenceNo) {
		this.responseBankReferenceNo = responseBankReferenceNo;
		return this;
	}

	public void setResponseBankReferenceNo(String responseBankReferenceNo) {
		this.responseBankReferenceNo = responseBankReferenceNo;
	}

	public String getResponseTxnAmount() {
		return responseTxnAmount;
	}

	public PaymentRequestResponse responseTxnAmount(String responseTxnAmount) {
		this.responseTxnAmount = responseTxnAmount;
		return this;
	}

	public void setResponseTxnAmount(String responseTxnAmount) {
		this.responseTxnAmount = responseTxnAmount;
	}

	public String getResponseBankID() {
		return responseBankID;
	}

	public PaymentRequestResponse responseBankID(String responseBankID) {
		this.responseBankID = responseBankID;
		return this;
	}

	public void setResponseBankID(String responseBankID) {
		this.responseBankID = responseBankID;
	}

	public String getResponseBankMerchantID() {
		return responseBankMerchantID;
	}

	public PaymentRequestResponse responseBankMerchantID(String responseBankMerchantID) {
		this.responseBankMerchantID = responseBankMerchantID;
		return this;
	}

	public void setResponseBankMerchantID(String responseBankMerchantID) {
		this.responseBankMerchantID = responseBankMerchantID;
	}

	public String getResponseTxnType() {
		return responseTxnType;
	}

	public PaymentRequestResponse responseTxnType(String responseTxnType) {
		this.responseTxnType = responseTxnType;
		return this;
	}

	public void setResponseTxnType(String responseTxnType) {
		this.responseTxnType = responseTxnType;
	}

	public String getResponseCurrencyName() {
		return responseCurrencyName;
	}

	public PaymentRequestResponse responseCurrencyName(String responseCurrencyName) {
		this.responseCurrencyName = responseCurrencyName;
		return this;
	}

	public void setResponseCurrencyName(String responseCurrencyName) {
		this.responseCurrencyName = responseCurrencyName;
	}

	public String getResponseItemCode() {
		return responseItemCode;
	}

	public PaymentRequestResponse responseItemCode(String responseItemCode) {
		this.responseItemCode = responseItemCode;
		return this;
	}

	public void setResponseItemCode(String responseItemCode) {
		this.responseItemCode = responseItemCode;
	}

	public String getResponseSecurityType() {
		return responseSecurityType;
	}

	public PaymentRequestResponse responseSecurityType(String responseSecurityType) {
		this.responseSecurityType = responseSecurityType;
		return this;
	}

	public void setResponseSecurityType(String responseSecurityType) {
		this.responseSecurityType = responseSecurityType;
	}

	public String getResponseSecurityID() {
		return responseSecurityID;
	}

	public PaymentRequestResponse responseSecurityID(String responseSecurityID) {
		this.responseSecurityID = responseSecurityID;
		return this;
	}

	public void setResponseSecurityID(String responseSecurityID) {
		this.responseSecurityID = responseSecurityID;
	}

	public String getResponseSecurityPassword() {
		return responseSecurityPassword;
	}

	public PaymentRequestResponse responseSecurityPassword(
			String responseSecurityPassword) {
		this.responseSecurityPassword = responseSecurityPassword;
		return this;
	}

	public void setResponseSecurityPassword(String responseSecurityPassword) {
		this.responseSecurityPassword = responseSecurityPassword;
	}

	public String getResponseTxnDate() {
		return responseTxnDate;
	}

	public PaymentRequestResponse responseTxnDate(String responseTxnDate) {
		this.responseTxnDate = responseTxnDate;
		return this;
	}

	public void setResponseTxnDate(String responseTxnDate) {
		this.responseTxnDate = responseTxnDate;
	}

	public String getResponseAuthStatus() {
		return responseAuthStatus;
	}

	public PaymentRequestResponse responseAuthStatus(String responseAuthStatus) {
		this.responseAuthStatus = responseAuthStatus;
		return this;
	}

	public void setResponseAuthStatus(String responseAuthStatus) {
		this.responseAuthStatus = responseAuthStatus;
	}

	public String getResponseSettlementType() {
		return responseSettlementType;
	}

	public PaymentRequestResponse responseSettlementType(String responseSettlementType) {
		this.responseSettlementType = responseSettlementType;
		return this;
	}

	public void setResponseSettlementType(String responseSettlementType) {
		this.responseSettlementType = responseSettlementType;
	}

	public String getResponseAdditionalInfo1() {
		return responseAdditionalInfo1;
	}

	public PaymentRequestResponse responseAdditionalInfo1(
			String responseAdditionalInfo1) {
		this.responseAdditionalInfo1 = responseAdditionalInfo1;
		return this;
	}

	public void setResponseAdditionalInfo1(String responseAdditionalInfo1) {
		this.responseAdditionalInfo1 = responseAdditionalInfo1;
	}

	public String getResponseAdditionalInfo2() {
		return responseAdditionalInfo2;
	}

	public PaymentRequestResponse responseAdditionalInfo2(
			String responseAdditionalInfo2) {
		this.responseAdditionalInfo2 = responseAdditionalInfo2;
		return this;
	}

	public void setResponseAdditionalInfo2(String responseAdditionalInfo2) {
		this.responseAdditionalInfo2 = responseAdditionalInfo2;
	}

	public String getResponseAdditionalInfo3() {
		return responseAdditionalInfo3;
	}

	public PaymentRequestResponse responseAdditionalInfo3(
			String responseAdditionalInfo3) {
		this.responseAdditionalInfo3 = responseAdditionalInfo3;
		return this;
	}

	public void setResponseAdditionalInfo3(String responseAdditionalInfo3) {
		this.responseAdditionalInfo3 = responseAdditionalInfo3;
	}

	public String getResponseAdditionalInfo4() {
		return responseAdditionalInfo4;
	}

	public PaymentRequestResponse responseAdditionalInfo4(
			String responseAdditionalInfo4) {
		this.responseAdditionalInfo4 = responseAdditionalInfo4;
		return this;
	}

	public void setResponseAdditionalInfo4(String responseAdditionalInfo4) {
		this.responseAdditionalInfo4 = responseAdditionalInfo4;
	}

	public String getResponseAdditionalInfo5() {
		return responseAdditionalInfo5;
	}

	public PaymentRequestResponse responseAdditionalInfo5(
			String responseAdditionalInfo5) {
		this.responseAdditionalInfo5 = responseAdditionalInfo5;
		return this;
	}

	public void setResponseAdditionalInfo5(String responseAdditionalInfo5) {
		this.responseAdditionalInfo5 = responseAdditionalInfo5;
	}

	public String getResponseAdditionalInfo6() {
		return responseAdditionalInfo6;
	}

	public PaymentRequestResponse responseAdditionalInfo6(
			String responseAdditionalInfo6) {
		this.responseAdditionalInfo6 = responseAdditionalInfo6;
		return this;
	}

	public void setResponseAdditionalInfo6(String responseAdditionalInfo6) {
		this.responseAdditionalInfo6 = responseAdditionalInfo6;
	}

	public String getResponseAdditionalInfo7() {
		return responseAdditionalInfo7;
	}

	public PaymentRequestResponse responseAdditionalInfo7(
			String responseAdditionalInfo7) {
		this.responseAdditionalInfo7 = responseAdditionalInfo7;
		return this;
	}

	public void setResponseAdditionalInfo7(String responseAdditionalInfo7) {
		this.responseAdditionalInfo7 = responseAdditionalInfo7;
	}

	public String getResponseErrorStatus() {
		return responseErrorStatus;
	}

	public PaymentRequestResponse responseErrorStatus(String responseErrorStatus) {
		this.responseErrorStatus = responseErrorStatus;
		return this;
	}

	public void setResponseErrorStatus(String responseErrorStatus) {
		this.responseErrorStatus = responseErrorStatus;
	}

	public String getResponseErrorDescription() {
		return responseErrorDescription;
	}

	public PaymentRequestResponse responseErrorDescription(
			String responseErrorDescription) {
		this.responseErrorDescription = responseErrorDescription;
		return this;
	}

	public void setResponseErrorDescription(String responseErrorDescription) {
		this.responseErrorDescription = responseErrorDescription;
	}

	public String getResponseCheckSum() {
		return responseCheckSum;
	}

	public PaymentRequestResponse responseCheckSum(String responseCheckSum) {
		this.responseCheckSum = responseCheckSum;
		return this;
	}

	public void setResponseCheckSum(String responseCheckSum) {
		this.responseCheckSum = responseCheckSum;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public PaymentRequestResponse responseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
		return this;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getUser() {
		return user;
	}

	public PaymentRequestResponse user(String user) {
		this.user = user;
		return this;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public LocalDate getRequestTxnDate() {
		return requestTxnDate;
	}

	public PaymentRequestResponse requestTxnDate(LocalDate requestTxnDate) {
		this.requestTxnDate = requestTxnDate;
		return this;
	}

	public void setRequestTxnDate(LocalDate requestTxnDate) {
		this.requestTxnDate = requestTxnDate;
	}

	public void setRequestTxnDate(String date) {
		this.requestTxnDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getRequestTxnTime() {
		return requestTxnTime;
	}

	public PaymentRequestResponse requestTxnTime(String requestTxnTime) {
		this.requestTxnTime = requestTxnTime;
		return this;
	}

	public void setRequestTxnTime(String requestTxnTime) {
		this.requestTxnTime = requestTxnTime;
	}

	public Branch getBranch() {
		return branch;
	}

	public PaymentRequestResponse branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public PaymentRequestResponse academicYear(AcademicYear academicYear) {
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
		if (!(o instanceof PaymentRequestResponse)) {
			return false;
		}
		return id != null && id.equals(((PaymentRequestResponse) o).id);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return "PaymentRequestResponse{" + "id=" + getId() + ", requestMerchantID='"
				+ getRequestMerchantID() + "'" + ", requestUniqueTransactionNo='"
				+ getRequestUniqueTransactionNo() + "'" + ", requestTxnAmount='"
				+ getRequestTxnAmount() + "'" + ", requestCurrencyType='"
				+ getRequestCurrencyType() + "'" + ", requestTypeField1='"
				+ getRequestTypeField1() + "'" + ", requestSecurityID='"
				+ getRequestSecurityID() + "'" + ", requestTypeField2='"
				+ getRequestTypeField2() + "'" + ", requestTxtadditional1='"
				+ getRequestTxtadditional1() + "'" + ", requestTxtadditional2='"
				+ getRequestTxtadditional2() + "'" + ", requestTxtadditional3='"
				+ getRequestTxtadditional3() + "'" + ", requestTxtadditional4='"
				+ getRequestTxtadditional4() + "'" + ", requestTxtadditional5='"
				+ getRequestTxtadditional5() + "'" + ", requestTxtadditional6='"
				+ getRequestTxtadditional6() + "'" + ", requestTxtadditional7='"
				+ getRequestTxtadditional7() + "'" + ", requestRu='" + getRequestRu()
				+ "'" + ", requestCheckSum='" + getRequestCheckSum() + "'"
				+ ", requestMsg='" + getRequestMsg() + "'" + ", responseMerchantID='"
				+ getResponseMerchantID() + "'" + ", responseUniqueTransactionNo='"
				+ getResponseUniqueTransactionNo() + "'" + ", responseTxnReferenceNo='"
				+ getResponseTxnReferenceNo() + "'" + ", responseBankReferenceNo='"
				+ getResponseBankReferenceNo() + "'" + ", responseTxnAmount='"
				+ getResponseTxnAmount() + "'" + ", responseBankID='"
				+ getResponseBankID() + "'" + ", responseBankMerchantID='"
				+ getResponseBankMerchantID() + "'" + ", responseTxnType='"
				+ getResponseTxnType() + "'" + ", responseCurrencyName='"
				+ getResponseCurrencyName() + "'" + ", responseItemCode='"
				+ getResponseItemCode() + "'" + ", responseSecurityType='"
				+ getResponseSecurityType() + "'" + ", responseSecurityID='"
				+ getResponseSecurityID() + "'" + ", responseSecurityPassword='"
				+ getResponseSecurityPassword() + "'" + ", responseTxnDate='"
				+ getResponseTxnDate() + "'" + ", responseAuthStatus='"
				+ getResponseAuthStatus() + "'" + ", responseSettlementType='"
				+ getResponseSettlementType() + "'" + ", responseAdditionalInfo1='"
				+ getResponseAdditionalInfo1() + "'" + ", responseAdditionalInfo2='"
				+ getResponseAdditionalInfo2() + "'" + ", responseAdditionalInfo3='"
				+ getResponseAdditionalInfo3() + "'" + ", responseAdditionalInfo4='"
				+ getResponseAdditionalInfo4() + "'" + ", responseAdditionalInfo5='"
				+ getResponseAdditionalInfo5() + "'" + ", responseAdditionalInfo6='"
				+ getResponseAdditionalInfo6() + "'" + ", responseAdditionalInfo7='"
				+ getResponseAdditionalInfo7() + "'" + ", responseErrorStatus='"
				+ getResponseErrorStatus() + "'" + ", responseErrorDescription='"
				+ getResponseErrorDescription() + "'" + ", responseCheckSum='"
				+ getResponseCheckSum() + "'" + ", responseMsg='" + getResponseMsg() + "'"
				+ ", user='" + getUser() + "'" + ", requestTxnDate='"
				+ getRequestTxnDate() + "'" + ", requestTxnTime='" + getRequestTxnTime()
				+ "'" + "}";
	}
}
