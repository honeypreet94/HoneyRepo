package com.online.banking.onlinebanking.spring.h2.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.transaction.annotation.Transactional;

import com.online.banking.onlinebanking.beans.PanBean;

public class PanDetailDaoImpl implements PanDetailDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional
	public PanBean getPan(String pan) {
		PanBean panDetail = (PanBean) jdbcTemplate.queryForObject("select * from PanCardValidator where pan = ?",
				new Object[] { pan }, new PanBeanRowMapper());
		return panDetail;
	}

	
	public int addPan(PanBean panBean){
		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		simpleJdbcInsert.withTableName("PanCardValidator").usingGeneratedKeyColumns("pan");
		Map<String, Object> parameters = new HashMap<String, Object>(2);
		parameters.put("pan", panBean.getPan());
		parameters.put("creditScore", panBean.getCreditScore());
		
		Number insertedId = simpleJdbcInsert.executeAndReturnKey(parameters);
		return insertedId.intValue();
	}

}
