package com.revature.bank.main;


import com.revature.bank.bank.Bank;
import com.revature.bank.user.Customer;


public class BankDriver {
	Customer customer = new Customer();
	public static void main (String[] args) {
//		static Scanner scan = new Scanner(System.in);
		
		Bank.mainMenu();
		
		if(Bank.getChoice() == "2") {
		
			Bank.inputNewUserAccount();
			
		} else {

			Bank.login();

		}
		
	}

}
