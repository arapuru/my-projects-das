package com.test.spring;

public class Product  {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriceIndicator() {
		return priceIndicator;
	}

	public void setPriceIndicator(String priceIndicator) {
		this.priceIndicator = priceIndicator;
	}

	public String getPriceCategory() {
		return priceCategory;
	}

	public void setPriceCategory(String priceCategory) {
		this.priceCategory = priceCategory;
	}

	private String name;
	
	private String priceIndicator;
	
	private String priceCategory;
}
