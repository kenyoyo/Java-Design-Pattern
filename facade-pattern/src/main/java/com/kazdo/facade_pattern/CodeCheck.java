package com.kazdo.facade_pattern;

public class CodeCheck {

	private String codeNumber;
	
	public boolean isCorrect(String codeNumber) {
		if(this.codeNumber.equals(codeNumber))
			return true;
		else
			return false;
	}

	public String getCodeNumber() {
		return codeNumber;
	}

	public boolean setCodeNumber(String codeNumber) {
		if(codeNumber.matches("[0-9]+")) {
			this.codeNumber = codeNumber;
			return true;
		} else
			return false;	
	}
	
}
