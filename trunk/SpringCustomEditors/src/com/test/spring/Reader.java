package com.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Reader {
	
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/test/spring/ContextBeans.xml");
		MyCustomEditors editors=  context.getBean(MyCustomEditors.class);
		System.out.println(editors.getMyDate());
		System.out.println(editors.getMyFile().canRead());
		System.out.println(editors.getMyProduct().getName());
		
	}
}
