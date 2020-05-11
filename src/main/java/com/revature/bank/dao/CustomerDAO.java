package com.revature.bank.dao;

import com.revature.bank.user.Customer;

public interface CustomerDAO {
	
	public void saveCustomer(Customer c);
	
	public Customer getCustomer(String customer);
}