package com.revature.bank.bank;
import com.revature.bank.util.AuthenticateCustomer;
import com.revature.bank.util.DataSource;


import java.util.Scanner;

import com.revature.bank.user.Customer;



public class Bank {

	
	private String password;
	private String email;	
	static String choice;
	private static double amount;


	static Scanner scan = new Scanner(System.in);
	DataSource datasource = new DataSource();
	
	public Bank() {
		
	}
	
	public Bank(String email, String password) {
		this.email = email;
		this.password = password;
	}


	public void setchoice(String choice) {
		Bank.choice = choice;
	}
	
	public static String getChoice() {
		return choice;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public static String getAuthCustomer() {
		return choice;
	}
	
	static Customer thisCustomer = new Customer();
	
	
	public String mainMenu() {

		System.out.println("Welcome to TheBank!");
		System.out.println("What would you like to do?");
		System.out.println("1 - Login");
		System.out.println("2 - Open an Account");
		System.out.print("Enter your choice: ");
		
		choice = scan.nextLine();
		
		return choice;
	}

	
	public Customer inputNewUserAccount() {
				
		System.out.print("Enter First Name: ");
		String firstName = scan.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = scan.nextLine();
		System.out.print("Enter email: ");
		String email = scan.nextLine();
		System.out.print("Create password: ");
		String password= scan.nextLine();
		
		
		Customer customer = new Customer(firstName, lastName, password, email, 30.00);
		return customer;
	}
	
		

	public void login() {
		
		System.out.println("Enter Email(User name): ");
		email = scan.nextLine();
		System.out.println("Enter Password: ");
		password = scan.nextLine();
		
		//Check for authentication between database and customer login info
		
		while ((AuthenticateCustomer.isAuthorized(email, password) == true) && (choice != "0")) {

			signedMenu();
				switch (choice) {
				case "0":
					System.out.println("Good Bye");
					login();
				case "1": 
					System.out.println("Enter the amount to deposit");
					amount = scan.nextDouble();
					thisCustomer.deposit(amount);
					break;
				case "2":
					System.out.println("Enter the amount to withdraw");
					amount = scan.nextDouble();
					thisCustomer.withdraw(amount);
					break;
				default:
					System.out.println("Wrong choice, please try again");
					break;
				}
//				scan.hasNextLine();
				scan.nextLine();
				
			}
		scan.close();
		}

	
//	Needs to get name from file to show in menu
	public static String signedMenu() {
		System.out.println("Welcome");
		System.out.println("What would you like to do?");
		System.out.println("1 - Deposit into account");
		System.out.println("2 - Withdraw from account");
		System.out.println("3 - Print account balance");
		System.out.println("0 - to Quit");
		System.out.print("Enter your choice: ");
		
		choice = scan.nextLine();
//		scan.nextLine();

		return choice;
	}
}
