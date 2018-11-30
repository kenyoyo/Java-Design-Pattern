package com.kazdo.facade_pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccountFacade bankAccount;
	
	@Before
	public void createAccount() {
		bankAccount = new BankAccountFacade();
		bankAccount.createAccount("55555", "999");
	}
	
	@Test
	public void testLogin() {
		assertTrue(bankAccount.login("55555", "999"));
	}
	
	@Test
	public void testLogout() {
		assertTrue(bankAccount.logout());
	}
	
	@Test
	public void testDeposit() {
		bankAccount.login("55555", "999");
		bankAccount.deposit(1000.00);
		assertEquals(1000.00, bankAccount.viewBalance());
	}
	
	@Test
	public void testWithdraw() {
		bankAccount.login("55555", "999");
		bankAccount.deposit(1000.00);
		bankAccount.withdraw(500.00);
		assertEquals(500.00, bankAccount.viewBalance());
	}
	
}
