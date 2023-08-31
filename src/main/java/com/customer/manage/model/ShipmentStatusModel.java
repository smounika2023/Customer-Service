package com.customer.manage.model;

import jakarta.validation.constraints.NotBlank;

public class ShipmentStatusModel {

	private int shipmentStatusId;

	private int trackingId;
	 
	@NotBlank(message = "shippingAddress should not be null")
	private String shippingAddress;

	public ShipmentStatusModel() {

	}

	public ShipmentStatusModel(int shipmentStatusId, int trackingId, String shippingAddress) {
		super();
		this.shipmentStatusId = shipmentStatusId;
		this.trackingId = trackingId;
		this.shippingAddress = shippingAddress;
	}

	public int getShipmentStatusId() {
		return shipmentStatusId;
	}

	public void setShipmentStatusId(int shipmentStatusId) {
		this.shipmentStatusId = shipmentStatusId;
	}

	public int getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "ShipmentStatusModel [shipmentStatusId=" + shipmentStatusId + ", trackingId=" + trackingId
				+ ", shippingAddress=" + shippingAddress + "]";
	}

}
