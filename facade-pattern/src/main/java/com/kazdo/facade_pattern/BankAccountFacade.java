package com.kazdo.facade_pattern;

public class BankAccountFacade {
	
	private CodeCheck codeCheck;
	private PasswordCheck passwordCheck;
	private CashCheck cashCheck;
	private LoginCheck loginCheck;
	
	public BankAccountFacade() {
		codeCheck = new CodeCheck();
		passwordCheck = new PasswordCheck();
		cashCheck = new CashCheck();
		loginCheck = new LoginCheck();
	}
	
	public boolean createAccount(String code, String password) {
		if(codeCheck.setCodeNumber(code) && passwordCheck.setPassword(password))
			return true;
		else
			return false;
	}
	
	public boolean login(String code, String password) {
		if(codeCheck.isCorrect(code) && passwordCheck.isCorrect(password)) {
			loginCheck.setSignIn(true);
			return true;
		} else
			return false;		
	}
	
	public boolean logout() {
		loginCheck.setSignIn(false);
		return true;
	}
	
	public boolean deposit(double cash) {
		if(loginCheck.isSignIn())
			return cashCheck.deposit(cash);
		else
			return false;
	}
	
	public boolean withdraw(double cash) {
		if(loginCheck.isSignIn())
			return cashCheck.withdraw(cash);
		else
			return false;
	}
	
	public double viewBalance() {
		if(loginCheck.isSignIn())
			return cashCheck.getCash();
		else 
			return -1;
	}
	
}
