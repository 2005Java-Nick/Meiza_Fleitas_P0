package com.revature.bank.bank;

import static org.junit.Assert.*;
import static org.mockito.Matchers.doubleThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.bank.user.Customer;
import com.revature.bank.user.User;

public class BankTest {
	Customer customer = new Customer("Jack", "Smith", "email", "pass", 1000.00);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

		@Test
	public void deposit() throws Exception{

	}

}
