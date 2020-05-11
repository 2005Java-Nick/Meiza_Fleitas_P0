package com.revature.bank.main;

import com.revature.bank.bank.Bank;
import com.revature.bank.util.Menus;

public class BankDriver {
	public static void main (String[] args) {
		
		
		Menus.mainMenu();
		
		if(Menus.getChoice() == 2) {
		
			Bank.inputNewUserAccount();
			
		} else {

			Bank.login();
			Bank bank = new Bank();
			bank.isAuthorized();


		}
	}

}
