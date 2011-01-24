package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.service.SequenceService;

public class TestSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ContextBeans.xml");
		
		SequenceService service=(SequenceService) context.getBean("SequenceService");
		System.out.println(service.getSequence());
		System.out.println(service.getSequence());
		

	}

}
