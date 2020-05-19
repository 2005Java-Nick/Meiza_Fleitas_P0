package com.revature.bank.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.bank.user.Customer;

public class CustomerTest {

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
	public void testDeposit() {
		Customer customer = new Customer("Jack", "Smith", "email", "pass", 1000.00);
		customer.deposit(300.00);
		assertEquals(1300.00, customer.getCustomerBalance(), 0);
	}
	
	@Test
	public void testWithdraw() {
		Customer customer = new Customer("Jack", "Smith", "email", "pass", 1000.00);
		customer.withdraw(300.00);
		assertEquals(700.00, customer.getCustomerBalance(), 0);
	}
}
