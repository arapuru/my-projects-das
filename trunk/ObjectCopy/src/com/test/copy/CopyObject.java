package com.test.copy;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.LogFactory;

public class CopyObject {
	
	static Logger logger = Logger.getLogger(org.apache.commons.beanutils.converters.AbstractConverter.class.getName());



	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws Exception {
		//factory.setLevel(Level.ALL);
		logger.info("testing");
		FromObject f=new FromObject();
		ToObject t=new ToObject();
		f.setName("names");
		f.setAge(123);
		f.setV1("");
		f.setDatePass("");
		BeanUtils.copyProperties(t, f);
		System.out.println(t.getName()+","+t.getAge()+","+t.getDatePass()+","+t.getDob()+t.getV1());

	}

}
