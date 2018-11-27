package com.kazdo.factory_pattern.abstract_factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MealFactoryTest {
	
	@Test
	public void testComboOneMealFactory() {
		IMealFactory mealFactory = new ComboOneMealFactory();
		MainDish mainDish = mealFactory.getMainDish();
		Dessert dessert = mealFactory.getDessert();
		Drink drink = mealFactory.getDrink();
		
		assertEquals(Bread.class, mainDish.getClass());
		assertEquals(Cake.class, dessert.getClass());
		assertEquals(Juice.class, drink.getClass());
	}
	
	@Test
	public void testComboTeoMealFactory() {
		IMealFactory mealFactory = new ComboTwoMealFactory();
		MainDish mainDish = mealFactory.getMainDish();
		Dessert dessert = mealFactory.getDessert();
		Drink drink = mealFactory.getDrink();
		
		assertEquals(Rice.class, mainDish.getClass());
		assertEquals(IceCream.class, dessert.getClass());
		assertEquals(SoftDrink.class, drink.getClass());
	}
	
}
