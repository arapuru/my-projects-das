package com.test.spring;

import java.beans.PropertyEditorSupport;

public class ProductEditor extends PropertyEditorSupport{

@Override
	public String getAsText() {
		Product prd= (Product) getValue();
		return prd.getName()+","+prd.getPriceCategory()+","+prd.getPriceIndicator();
	}

@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Product product=new Product();
		String arr[]=text.split(",");
		product.setName(arr[0]);
		product.setPriceCategory(arr[1]);
		product.setPriceIndicator(arr[2]);
		super.setValue(product);
	}
	
}
