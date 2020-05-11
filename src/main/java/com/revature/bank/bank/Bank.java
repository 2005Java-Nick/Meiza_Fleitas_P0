package com.revature.bank.bank;

import static org.mockito.Matchers.intThat;

import java.util.Scanner;

import com.revature.bank.user.Customer;



public class Bank {
//	Can't get it to work yet
//	private static CustomerDAO customerDao = new CustomerDAOSerialization();
	
	private String accountType;
	
	public Bank() {
		
	}
	

	
	public Bank(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public static void inputNewUserAccount() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Name: ");
		String firstName = scan.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = scan.nextLine();
		System.out.print("Enter email: ");
		String email = scan.nextLine();
		System.out.print("Create password: ");
		String password= scan.nextLine();
		
		String inputUser = firstName + "," + lastName + "," + email + "," + password;

		System.out.println(inputUser);

		scan.close();
//		Customer customer = customerDao.getCustomer(inputUser);
		
//		checking if works without finding the text inside file
//		if (customer == null) {
//			customer = new Customer(); 
//			customer.setCustomer(inputUser);
//		} else {
//
//			System.out.println("This Customer has already an account.");
//			inputNewUserAccount();
//		}


	}
	

	public static void login() {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Enter Email(User name): ");
		String email = scan.nextLine();
		System.out.println("Enter Password: ");
		String password = scan.nextLine();

	
		System.out.println(email + password);
		
		System.out.println("You are logged in!");

		scan.close();

	}

	
	public void isAuthorized(){
		Customer newPasswordCustomer = new Customer();
		String savedPasswordString = "testpassword";
		String inputPasswordString = newPasswordCustomer.getPassword();
//		System.out.println(inputPasswordString);
		System.out.println(inputPasswordString);
		System.out.println(savedPasswordString);
	}
	
	
}
