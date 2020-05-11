package com.revature.bank.util;

import static org.mockito.Matchers.intThat;

import java.util.Scanner;

public class Menus {

	static int choice;
	
	public static int mainMenu() {
		Scanner scan = new Scanner(System.in);


		System.out.println("Welcome to your Bank!");
		System.out.println("What would you like to do?");
		System.out.println("1 - Login");
		System.out.println("2 - Open an Account");
		System.out.print("Enter your choice: ");

		choice = scan.nextInt();
//		scan.close();
		return choice;
	}

	
	public void setchoice(int choice) {
		Menus.choice = choice;
	}
	public static int getChoice() {
		return choice;
	}
}
