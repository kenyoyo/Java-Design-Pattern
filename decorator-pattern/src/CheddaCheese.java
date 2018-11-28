
public class CheddaCheese extends DecoratePizzaTopping{

	public CheddaCheese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return getPizza().getDescription() + "Chedda Cheese ";
	}

	@Override
	public double getCost() {
		return getPizza().getCost() + 5;
	}

}
