package com.test.spring.map;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;

public class Test {
	
	private Map map;
	private Set set;
	private String string; 
	private String mandatedString;
	
	
	public String getString() {
		return string;
	}

	@Required
	public void setString(String string) {
		this.string = string;
	}

	public String getMandatedString() {
		return mandatedString;
	}

	@Mandate
	public void setMandatedString(String mandatedString) {
		this.mandatedString = mandatedString;
	}

	public Test()
	{
		
	}
	
	public Test(Map map)
	{
		System.out.println("map constructor");
		this.map = map;
	}
	
	
	
	public Test(Map map, Set set)
	{
		System.out.println("map set constructor");
		this.map = map;
		this.set  =set;

	}
	
	public void printMap(){
		if (map == null) System.out.println("map is null");
		if (map.isEmpty()) System.out.println("map is empty");
		System.out.println(map);
		System.out.println(set);
	}

}
