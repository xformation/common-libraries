package com.synectiks.commons.entities.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.synectiks.commons.constants.IDBConsts;
import com.synectiks.commons.entities.dynamodb.Entity;
import com.synectiks.commons.interfaces.IESEntity;
import com.synectiks.commons.utils.IUtils;

/**
 * @author Rajesh
 */
@DynamoDBTable(tableName = Cart.Tbl_CART)
@Document(indexName = Cart.INDX_CART, type = Cart.INDX_TYPE_CART)
public class Cart extends Entity implements IESEntity {

	private static final long serialVersionUID = -181789378355886642L;

	public static final String Tbl_CART = "cart";
	public static final String INDX_CART = "indx_cart";
	public static final String INDX_TYPE_CART = "indx_type_cart";

	private List<String> cartItems;
	private String customerId;
	private double grandTotal;

	@Override
	@DynamoDBAutoGeneratedKey
	@DynamoDBHashKey(attributeName = IDBConsts.Col_ID)
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return customerId;
	}

	public List<String> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<String> cartItems) {
		this.cartItems = cartItems;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public void addAnItem(CartItem item) {
		if (IUtils.isNull(this.cartItems)) {
			this.cartItems = new ArrayList<>();
		}
		if (!cartItems.contains(item.getId())) {
			this.cartItems.add(item.getId());
			this.grandTotal += item.getTotalPrice();
		}
	}
}
