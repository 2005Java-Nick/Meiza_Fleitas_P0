package com.revature.bank.user;


import java.io.Serializable;

import com.revature.bank.dao.CustomerDAO;
import com.revature.bank.dao.CustomerDAOSerialization;

public class User implements Serializable{
	
	private String firstName;
	private String lastName;
	private String password;
	
	public User(String firstName, String lastName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
