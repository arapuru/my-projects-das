package com.test.spring.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

@Repository("sequenceDaoImpl")
public class SequenceDaoImpl implements SequenceDao {

	private BigDecimal  seq=new BigDecimal(0);
	private BigDecimal  increment=new BigDecimal(1);
	
	@Override
	public String getSequence() {
		
		seq= seq.add(increment);
		return seq.toString();
		
	}

}
