package com.kazdo.template_pattern;

public class Person extends QueryTemplate {

	private String name;
	private String age;

	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean checkFormat() {
		if (CheckingFormatService.isAlphabetic(name) && CheckingFormatService.isNumeric(age))
			return true;
		else
			return false;
	}

	@Override
	public void printSucess() {
		System.out.println("Sucess insert person data.");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}

	@Override
	public void printFailed() {
		System.out.println("Failed insert person data.");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}

}
