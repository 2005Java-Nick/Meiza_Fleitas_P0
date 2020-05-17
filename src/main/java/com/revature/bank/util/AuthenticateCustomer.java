package com.revature.bank.util;


public class AuthenticateCustomer {

	
	
	public static boolean isAuthorized(String email, String password){

		
		if( (DataSource.queryCustomerLoginInfo().get("customer_email")).equals(email) && (DataSource.queryCustomerLoginInfo().get("customer_password")).equals(password)) {
			return true;
		}
		System.out.println("Wrong name or password, please try again.");
		return false;
	}
	

}
