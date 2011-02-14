package com.test.spring;

import java.io.File;
import java.util.Date;

public class MyCustomEditors<T> {

	private Date myDate;
	
	private File myFile;
	
	private Product myProduct;
	

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public Date getMyDate() {
		return myDate;
	}

	public void setMyDate(Date myDate) {
		this.myDate = myDate;
	}

	public Product getMyProduct() {
		return myProduct;
	}

	public void setMyProduct(Product myProduct) {
		this.myProduct = myProduct;
	}

	
}
