package com.kazdo.factory_pattern.abstract_factory;

public class ComboTwoMealFactory implements IMealFactory {

	public MainDish getMainDish() {
		return new Rice();
	}

	public Dessert getDessert() {
		return new IceCream();
	}

	public Drink getDrink() {
		return new SoftDrink();
	}

}
