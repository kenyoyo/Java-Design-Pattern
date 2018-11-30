package com.kazdo.facade_pattern;

public class CashCheck {
	private double cash;
	
	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public boolean deposit(double depositCash) {
		if(depositCash > 0) {
			cash += depositCash;
			return true;
		} else
			return false;
	}
	
	public boolean withdraw(double withdrawCash) {
		if(cash >= withdrawCash) {
			cash -= withdrawCash;
			return true;
		} else
			return false;
	}
}
