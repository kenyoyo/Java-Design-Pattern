package com.kazdo.template_pattern;

public abstract class QueryTemplate {

	public boolean insert() {
		if(checkFormat()) {
			printSucess();
			return true;
		} else {
			printFailed();
			return false;
		}
	}
	
	public abstract boolean checkFormat();
	
	public abstract void printSucess();
	
	public abstract void printFailed();
	
}
