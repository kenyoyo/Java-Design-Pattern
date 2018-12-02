package com.kazdo.template_pattern;

public class CheckingFormatService {
	
	private CheckingFormatService() {
		
	}
	
	public static boolean isAlphabetic(String str) {
		return str.matches("[a-zA-Z]+");
	}
	
	public static boolean isNumeric(String str) {
		return str.matches("[0-9]+");
	}
	
}
