package com.revature.bank.dao;

import java.util.List;

import javax.sql.DataSource;

import com.revature.bank.domain.CustomerDomain;

public interface CustomerDao {
	
	// Set the data-source that will be required to create a connection to the database.
	public void setDataSource(DataSource ds);
	
	// Create a record in the customer table
	public boolean create(CustomerDomain customerDomain);
	
	// Retrieve a single customer
	public CustomerDomain getCustomer(Integer id);
	
	// Retrieve all customers from the table.
	public List<CustomerDomain> getAllCustomers();

//	// Delete a specific customer from the table.
//	public boolean delete(Customer customer);
	
	// Update an existing customer
	public boolean update(CustomerDomain customerDomain);
	
	public void cleanup();


}
