package com.revature.bank.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.revature.bank.domain.CustomerDomain;

public class BankRowMapper implements RowMapper<CustomerDomain> {
	
	public CustomerDomain mapRow(ResultSet rs, int rownum) throws SQLException {
		CustomerDomain customerDB = new CustomerDomain();
		customerDB.setId(rs.getInt("customer_id"));
		customerDB.setCustomerFirstName("customer_first_name");
		customerDB.setCustomerLastName("customer_last_name");
		customerDB.setCustomerEmail("customer_email");
		
	
		return customerDB;
	}

}
