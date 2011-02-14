package com.test.spring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReadMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("C:\\CODEBASE\\workspacejsf\\SpringMap\\src\\ContextBean.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\test\\spring\\map\\ContextBean.xml");
		//Test test = (Test) context.getBean("test");
		//test.printMap();
		
		Test test1 = (Test) context.getBean("test1");
		test1.printMap();
		
		 test1 = (Test) context.getBean("test2");
		test1.printMap();
		
		 test1 = (Test) context.getBean("test3");
		test1.printMap();
		
		
		
	}

}