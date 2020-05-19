package com.revature.bank.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.bank.dao.CustomerDao;
import com.revature.bank.domain.CustomerDomain;

public class CustomerDaoImpl implements CustomerDao {
	
	private JdbcTemplate jdbcTemplate;
	
//	factory for db connection
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate =new JdbcTemplate(dataSource);

	}

	@Override
	public boolean create(CustomerDomain customerDomain) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CustomerDomain getCustomer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDomain> getAllCustomers() {
		String sqlQuery = "SELECT * FROM customer";
		List<CustomerDomain> customerList = jdbcTemplate.query(sqlQuery, new BankRowMapper());
		return customerList;
	}

	@Override
	public boolean update(CustomerDomain customerDomain) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
