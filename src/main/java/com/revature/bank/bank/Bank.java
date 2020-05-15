package com.revature.bank.bank;

import java.util.Scanner;

import com.revature.bank.user.Customer;



public class Bank {
//	Can't get it to work yet
//	private static CustomerDAO customerDao = new CustomerDAOSerialization();
	
	private String accountType;
	private static String password;
	private static String email;	
	static String choice;
	private static double amount;

	static Scanner scan = new Scanner(System.in);
	
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
	
	public void setchoice(String choice) {
		Bank.choice = choice;
	}
	public static String getChoice() {
		return choice;
	}
	
	public static String mainMenu() {

		System.out.println("Welcome to TheBank!");
		System.out.println("What would you like to do?");
		System.out.println("1 - Login");
		System.out.println("2 - Open an Account");
		System.out.print("Enter your choice: ");
		
		choice = scan.nextLine();
		
		return choice;
	}
	
	
	public static void inputNewUserAccount() {
	
		
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

	}
	

	public static void login() {
		
		
		System.out.println("Enter Email(User name): ");
		email = scan.nextLine();
		Customer inputEmail = new Customer();
		inputEmail.setEmail(email);
		System.out.println("Enter Password: ");
		password = scan.nextLine();
		Customer inputPassword = new Customer();
		inputPassword.setPassword(password);

		

		while ((isAuthorized() == true) && (choice != "0")) {
//			System.out.println((isAuthorized()));
			signedMenu();
				switch (choice) {
				case "0":
					System.out.println("Good Bye");
					login();
				case "1": 
					System.out.println("Enter the amount to deposit");
					deposit(amount);
					break;
				case "2":
					System.out.println("Enter the amount to withdraw");
					withraw(amount);
					break;
				default:
					System.out.println("Wrong choice, please try again");
					break;
				}
//				scan.hasNextLine();
//				choice = scan.nextLine();
				
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

	public static boolean isAuthorized(){
		String filePassword = "pass";
		String fileEmail = "email";
		
		if(filePassword.equals(password) && fileEmail.equals(email)) {
			System.out.println("you are logged in");
			return true;
		}
		System.out.println("Wrong name or password, please try again.");
		login();
		return false;
	}
	
	public static double deposit(double amount) {
		double balance = 30.00;
		amount = scan.nextDouble();
		balance =+ amount;
		scan.nextLine();
		System.out.println("You have deposited " + balance);
		signedMenu();
		return balance;
	}
	
	public static double withraw(double amount) {

		String scannedBalance = scan.nextLine();
		amount = Double.parseDouble(scannedBalance);
		double balance = 30.00;
		if (balance > amount) {
		balance =- amount;
		signedMenu();
		return balance;
		}
		System.out.println("You don't have sufficient funds for this withdraw amount.");
		return 0;
	} 
	
	
	
}
