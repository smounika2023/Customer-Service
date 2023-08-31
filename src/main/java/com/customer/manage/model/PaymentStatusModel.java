package com.customer.manage.model;

import jakarta.validation.constraints.NotBlank;

public class PaymentStatusModel {

	private int paymentStatusId;
	
	@NotBlank(message = "PaymentType should not be null")
	private String paymentType;

	public PaymentStatusModel() {

	}

	public PaymentStatusModel(int paymentStatusId, String paymentType) {
		super();
		this.paymentStatusId = paymentStatusId;
		this.paymentType = paymentType;
	}

	public int getPaymentStatusId() {
		return paymentStatusId;
	}

	public void setPaymentStatusId(int paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "PaymentStatusModel [paymentStatusId=" + paymentStatusId + ", paymentType=" + paymentType + "]";
	}

}
