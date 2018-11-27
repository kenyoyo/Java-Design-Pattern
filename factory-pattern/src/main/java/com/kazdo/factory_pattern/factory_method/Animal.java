package com.kazdo.factory_pattern.factory_method;

public abstract class Animal {
	
	public abstract void makeNoise();

}

class Dog extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Ruff Ruff!");
	}
	
}

class Cat extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Meow Meow...");
	}
	
}

class Bird extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Jib Jib");
	}
	
}
