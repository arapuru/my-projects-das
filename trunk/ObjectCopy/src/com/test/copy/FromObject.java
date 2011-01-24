package com.test.copy;

import java.sql.Date;

public class FromObject {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	private String name;
	
	private Integer age;
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDatePass() {
		return datePass;
	}

	public void setDatePass(String datePass) {
		this.datePass = datePass;
	}

	private Date dob;
	
	private String datePass;
	
	private String v1;

	public String getV1() {
		return v1;
	}

	public void setV1(String v1) {
		this.v1 = v1;
	}
	
	
}
