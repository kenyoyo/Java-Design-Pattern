package com.kazdo.template_pattern;

public class Product extends QueryTemplate {

	private String name;
	private String price;

	public Product(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean checkFormat() {
		if (CheckingFormatService.isAlphabetic(name) && CheckingFormatService.isNumeric(price))
			return true;
		else
			return false;
	}

	@Override
	public void printSucess() {
		System.out.println("Sucess insert product data.");
		System.out.println("name: " + name);
		System.out.println("price: " + price);
	}

	@Override
	public void printFailed() {
		System.out.println("Failed insert product data.");
		System.out.println("name: " + name);
		System.out.println("price: " + price);
	}

}
