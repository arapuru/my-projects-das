package com.test.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.test.spring.dao.SequenceDao;

@Service("SequenceService")
public class SequenceServiceImpl implements SequenceService 
{
	@Autowired
	@Qualifier("sequenceDaoImpl")
	private SequenceDao sequenceDao;

	public void setSequenceDao(SequenceDao sequenceDao) {
		this.sequenceDao = sequenceDao;
	}
	
	public String getSequence()
	{
		return sequenceDao.getSequence();
	}
	
}
