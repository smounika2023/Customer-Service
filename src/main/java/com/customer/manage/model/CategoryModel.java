package com.customer.manage.model;

import jakarta.validation.constraints.NotBlank;

public class CategoryModel {

	private int categoryId;
	@NotBlank(message = "categoryname should not be null")
	private String categoryName;

	public CategoryModel() {
	}

	public CategoryModel(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryModel [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

}
