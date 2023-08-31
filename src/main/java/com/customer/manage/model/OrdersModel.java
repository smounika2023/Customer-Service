package com.customer.manage.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class OrdersModel {
	
	private int orderId;

	@NotBlank(message = "Description should not be null")
	private String description;

	private LocalDate orderDate;

	private double orderTotalAmount;

	private int totalItems;

	private List<OrderItemModel> orderItemList;

	private OrderStatusModel orderStatusModel;

	private PaymentStatusModel paymentStatusModel;

	private ShipmentStatusModel shipmentStatusModel;

}
