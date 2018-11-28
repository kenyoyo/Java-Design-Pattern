
public class CheeseFactory {

	public static Pizza getCheese(CheeseType cheeseType, Pizza pizza) {
		if(cheeseType.equals(CheeseType.Chedda))
			return new CheddaCheese(pizza);
		else if(cheeseType.equals(CheeseType.Mozzarella))
			return new MozzarellaCheese(pizza);
		else
			return null;
	}
	
}
