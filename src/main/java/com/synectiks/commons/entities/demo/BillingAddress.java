package com.synectiks.commons.entities.demo;

import org.springframework.data.elasticsearch.annotations.Document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.synectiks.commons.constants.IDBConsts;
import com.synectiks.commons.entities.dynamodb.Entity;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * @author Rajesh
 */
@DynamoDBTable(tableName = BillingAddress.Tbl_BILLING)
@Document(indexName = BillingAddress.INDX_BILLING,
		type = BillingAddress.INDX_TYPE_BILLING)
public class BillingAddress extends Entity implements IESEntity {

	private static final long serialVersionUID = 1168499300185520264L;

	public static final String Tbl_BILLING = "billing";
	public static final String INDX_BILLING = "indx_billing";
	public static final String INDX_TYPE_BILLING = "indx_type_billing";

	private String cardHolder;
	private String cardNumber;
	private String expiryDate;
	private String securityCode;

	private String customerId;

	@Override
	@DynamoDBAutoGeneratedKey
	@DynamoDBHashKey(attributeName = IDBConsts.Col_ID)
	public String getId() {
		return id;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
