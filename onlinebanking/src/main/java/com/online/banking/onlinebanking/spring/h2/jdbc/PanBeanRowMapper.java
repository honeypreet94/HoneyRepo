package com.online.banking.onlinebanking.spring.h2.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.online.banking.onlinebanking.beans.PanBean;

public class PanBeanRowMapper implements RowMapper<PanBean>  {

	public PanBean mapRow(ResultSet rs, int row) throws SQLException {
		PanBean panBean = new PanBean();
		panBean.setPan(rs.getString("pan"));
		panBean.setCreditScore(rs.getFloat("creditScore"));
		
		return panBean;
	}
}
