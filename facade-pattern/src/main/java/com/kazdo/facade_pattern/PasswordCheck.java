package com.kazdo.facade_pattern;

public class PasswordCheck {

	private String password;

	public String getPassword() {
		return password;
	}

	public boolean setPassword(String password) {
		if(password.matches("[0-9]+")) {
			this.password = password;
			return true;
		} else
			return false;
	}	
	
	public boolean isCorrect(String password) {
		if(this.password.equals(password))
			return true;
		else
			return false;
	}
}
