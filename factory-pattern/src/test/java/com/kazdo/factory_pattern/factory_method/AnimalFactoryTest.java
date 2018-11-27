package com.kazdo.factory_pattern.factory_method;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AnimalFactoryTest {
	
	AnimalFactory animalFactory;
	
	@Before
	public void setup() {
		animalFactory = new AnimalFactory();
	}
	
	@Test
	public void testCreateDog() {
		Animal dog = animalFactory.getAnimal(AnimalType.DOG);
		
		assertEquals(Dog.class, dog.getClass());
	}
	
	@Test
	public void testCreateCat() {
		Animal cat = animalFactory.getAnimal(AnimalType.CAT);
		
		assertEquals(Cat.class, cat.getClass());
	}
	
	@Test
	public void testCreateBird() {
		Animal bird = animalFactory.getAnimal(AnimalType.BIRD);
		
		assertEquals(Bird.class, bird.getClass());
	}
}
