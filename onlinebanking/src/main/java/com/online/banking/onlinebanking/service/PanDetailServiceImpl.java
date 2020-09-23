package com.online.banking.onlinebanking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.online.banking.onlinebanking.beans.PanBean;
import com.online.banking.onlinebanking.spring.h2.jdbc.PanBeanRowMapper;
import com.online.banking.onlinebanking.spring.h2.jdbc.PanDetailDao;

public class PanDetailServiceImpl implements PanDetailService {

	@Autowired
	private PanDetailDao panDetailDao;
	
	@Override
	public PanBean getPan(String pan) {
		return panDetailDao.getPan(pan);
	}
	
	
	@Override
	public int addPan(PanBean panBean)
	{
		return panDetailDao.addPan(panBean);
	}
}
