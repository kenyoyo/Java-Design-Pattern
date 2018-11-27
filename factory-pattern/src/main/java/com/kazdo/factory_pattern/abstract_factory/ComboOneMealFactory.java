package com.kazdo.factory_pattern.abstract_factory;

public class ComboOneMealFactory implements IMealFactory {

	public MainDish getMainDish() {
		return new Bread();
	}

	public Dessert getDessert() {
		return new Cake();
	}

	public Drink getDrink() {
		return new Juice();
	}
	
}
