package com.kazdo.factory_pattern.abstract_factory;

public interface IMealFactory {
	
	public MainDish getMainDish();
	public Dessert getDessert();
	public Drink getDrink();
	
}
