package com.kazdo.template_pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueryTemplateTest {

	@Test
	public void testInsertCorrectFormatPerson() {
		Person person = new Person("Morwind", "25");

		assertTrue(person.insert());
	}

	@Test
	public void testInsertInCorrectFormatPerson() {
		// Incorrect age format.
		Person person = new Person("Ragu", "4E");

		assertFalse(person.insert());
	}

	@Test
	public void testInsertCorrentFormatProduct() {
		Product product = new Product("Soap", "59");
		
		assertTrue(product.insert());
	}
	
	@Test
	public void testInsertInCorrectFormatProduct() {
		Product product = new Product("Pen", "14;");
		
		assertFalse(product.insert());
	}
}
