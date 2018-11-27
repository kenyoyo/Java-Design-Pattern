package com.kazdo.factory_pattern.factory_method;

public class AnimalFactory {
	
	public Animal getAnimal(AnimalType animalType) {
		if(animalType.equals(AnimalType.DOG))
			return new Dog();
		else if(animalType.equals(AnimalType.CAT))
			return new Cat();
		else if(animalType.equals(AnimalType.BIRD))
			return new Bird();
		
		return null;
	}
	
}

