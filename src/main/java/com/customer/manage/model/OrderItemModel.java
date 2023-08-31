package com.customer.manage.model;

import jakarta.validation.constraints.NotBlank;

public class OrderItemModel {

	private int orderItemId;
	
	private int productId;
	
	@NotBlank(message = "price should not be null")
	private double price;

	@NotBlank(message = "Quantity should not be null")
	private int quantity;

	private double subTotalAmount;

	private OrdersModel ordersModel;

	public OrderItemModel() {

	}

	public OrderItemModel(int orderItemId, int productId, double price, int quantity, double subTotalAmount,
			OrdersModel ordersModel) {
		super();
		this.orderItemId = orderItemId;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.subTotalAmount = subTotalAmount;
		this.ordersModel = ordersModel;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotalAmount() {
		return subTotalAmount;
	}

	public void setSubTotalAmount(double subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}

	public OrdersModel getOrdersModel() {
		return ordersModel;
	}

	public void setOrdersModel(OrdersModel ordersModel) {
		this.ordersModel = ordersModel;
	}

	@Override
	public String toString() {
		return "OrderItemModel [orderItemId=" + orderItemId + ", productId=" + productId + ", price=" + price
				+ ", quantity=" + quantity + ", subTotalAmount=" + subTotalAmount + ", ordersModel=" + ordersModel
				+ "]";
	}

}
