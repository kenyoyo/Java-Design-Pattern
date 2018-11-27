package com.kazdo.singleton_pattern;

public class Singleton {

	private static Singleton mySingleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(mySingleton == null) {
			mySingleton = new Singleton();
			return mySingleton;
		} else 
			return mySingleton;
	}
    
}
