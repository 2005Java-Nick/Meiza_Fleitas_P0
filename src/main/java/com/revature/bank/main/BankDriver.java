package com.revature.bank.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.bank.dao.CustomerDao;
import com.revature.bank.domain.CustomerDomain;

public class BankDriver {
	
	public static void main (String[] args) {
		
//		create the application contexrt
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		

//		Create the Bean
		CustomerDao dao = (CustomerDao) ctx.getBean("customerDao");
		List<CustomerDomain> customerList = dao.getAllCustomers();
		for(CustomerDomain cust: customerList) {
			System.out.println(cust);
		}
		
		
		// close the app context
		((ClassPathXmlApplicationContext) ctx ).close();
		
		
//		Bank thisBank = new Bank();
//		
//		thisBank.mainMenu();
//		
//		if(Bank.getChoice() == "2") {
//		
//			thisBank.inputNewUserAccount();
//			
//		} else {
//
//			thisBank.login();
//
//		}
//		
	}

}
