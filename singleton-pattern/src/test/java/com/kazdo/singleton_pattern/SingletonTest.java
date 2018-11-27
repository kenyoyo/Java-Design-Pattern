package com.kazdo.singleton_pattern;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testSingletonSameInstance() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		
		
		assertTrue(instance1.equals(instance2));
	}
	
}
