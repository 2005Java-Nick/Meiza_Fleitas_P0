package com.revature.bank.main;


import com.revature.bank.bank.Bank;



public class BankDriver {


//	
//	Customer newCustomer = new Customer(firstName, lastName, password, email, customerBalance)
	
	public static void main (String[] args) {
//		static Scanner scan = new Scanner(System.in);
		
		Bank thisBank = new Bank();
		
		thisBank.mainMenu();
		
		if(Bank.getChoice() == "2") {
		
			thisBank.inputNewUserAccount();
			
		} else {

			thisBank.login();

		}
		
	}

}
