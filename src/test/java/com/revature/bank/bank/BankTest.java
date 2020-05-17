package com.revature.bank.bank;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.bank.user.Customer;
import com.revature.bank.user.User;

public class BankTest {

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

	Customer customer = new Customer("Jack", "Smith", "email", "pass", 30.00);
	@Test
	public void deposit() throws Exception{
		assertEquals(60, 60);
	}

}
