package com.revature.bank.user;

import java.io.Serializable;

public class Customer extends User implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String customer;
	
	public Customer() {
		super();
	}
	
	
	public Customer(String firstName, String lastName, String password, String email, String customer) {
		super(firstName, lastName, password);
		this.email = email;
		this.customer = customer;
	}


	public Customer(String firstName, String lastName, String password) {
		super(firstName, lastName, password);
		
	}
	
	public Customer(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public String setCustomer(String c) {
		String customer = getFirstName() + "," + getLastName() + "," + getEmail() + "," + getPassword();
		return customer;
	}
	
//	public String setCustomer(Customer c) {
//		String customer = getFirstName() + "," + getLastName() + "," + getEmail() + "," + getPassword();
//		return customer;
//	}
	
}
