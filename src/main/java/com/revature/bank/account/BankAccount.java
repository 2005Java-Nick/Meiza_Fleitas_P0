package com.revature.bank.account;

public class BankAccount {
	private int id;
	private int accountNumber;
	private String branchName;
	private String accountType;
	
	public BankAccount(int id, int accountNumber, String branchName, String accountType) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.branchName = branchName;
		this.accountType = accountType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
}
