package com.revature.bank.util;

import java.util.HashMap;


public class DataSource {
	
	private static HashMap<String, String> databaseCustomer = new HashMap<String, String>();;
	
	

	public static HashMap<String, String> getDatabaseCustomer() {
		return databaseCustomer;
	}
	
	//Query customer email and password from DB
	public static HashMap<String, String> queryCustomerLoginInfo(){
		
	      DataSource.databaseCustomer.put("customer_email", "email");
	      DataSource.databaseCustomer.put("customer_password", "pass");

		return databaseCustomer;
	}
	
	public void setDatabaseCustomer(HashMap<String, String> databaseCustomer) {
	      
		DataSource.databaseCustomer = databaseCustomer;
	}
	
	public static double queryCustomerBalance(){
		double databaseCustomerBalance = 30.00;
		
		return databaseCustomerBalance;
	}
	

}
