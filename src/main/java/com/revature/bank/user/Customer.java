package com.revature.bank.user;

import com.revature.bank.util.DataSource;

public class Customer{
	
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private String customerPassword;
	private double customerBalance;
	
	public Customer() {
		
	}
	
	public Customer(String customerFirstName, String customerLastName, String customerEmail, String customerPassword,
			double customerBalance) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerBalance = customerBalance;
	}

	public Customer(String customerEmail, String customerPassword) {
		super();
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;

	}
	
	static DataSource customerData = new DataSource();
	
	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public double getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(double customerBalance) {
		this.customerBalance = customerBalance;
	}
	
	public void deposit(double amount) {
		this.customerBalance = DataSource.queryCustomerBalance();
		this.customerBalance += amount;
		System.out.println("Deposit of " + amount + " made. New balance is " + this.customerBalance);
	}
	
    public void withdraw(double amount) {
    	this.customerBalance = DataSource.queryCustomerBalance();
        if(this.customerBalance - amount <= 0) {
            System.out.println("Only " + customerBalance + " is available. Withdrawal not processed");
        } else {
            this.customerBalance -= amount;
            System.out.println("Withdrawal of " + amount + " processed, Remaining balance = " + this.customerBalance);
        }
    }
	

}
