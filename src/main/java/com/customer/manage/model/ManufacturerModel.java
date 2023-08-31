package com.customer.manage.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class ManufacturerModel {
	private int manufacturerId;
	
	@NotBlank(message = "companyname should not be null")
	private String companyName;
	
	@NotBlank(message = "registrationNumber should not be null")
	private String registrationNumber;
	private LocalDate dateOfRegistration;
	private String description;

	public ManufacturerModel() {

	}

	public ManufacturerModel(int manufacturerId, String companyName, String registrationNumber,
			LocalDate dateOfRegistration, String description) {
		super();
		this.manufacturerId = manufacturerId;
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
		this.dateOfRegistration = dateOfRegistration;
		this.description = description;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ManufacturerModel [manufacturerId=" + manufacturerId + ", companyName=" + companyName
				+ ", registrationNumber=" + registrationNumber + ", dateOfRegistration=" + dateOfRegistration
				+ ", description=" + description + "]";
	}

}
