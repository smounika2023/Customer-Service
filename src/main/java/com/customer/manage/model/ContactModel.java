package com.customer.manage.model;

import jakarta.validation.constraints.NotBlank;

public class ContactModel {
	private int contactId;
	
	@NotBlank(message = "contacttype should not be null")
	private String contactType;
	
	@NotBlank(message = "value should not be null")
	private String value;

	private CustomerModel customerModel;

	public ContactModel() {

	}

	public ContactModel(int contactId, String contactType, String value, CustomerModel customerModel) {
		super();
		this.contactId = contactId;
		this.contactType = contactType;
		this.value = value;
		this.customerModel = customerModel;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public CustomerModel getCustomerModel() {
		return customerModel;
	}

	public void setCustomerModel(CustomerModel customerModel) {
		this.customerModel = customerModel;
	}

	@Override
	public String toString() {
		return "ContactModel [contactId=" + contactId + ", contactType=" + contactType + ", value=" + value
				+ ", customerModel=" + customerModel + "]";
	}

}
