
public class MozzarellaCheese extends DecoratePizzaTopping{

	public MozzarellaCheese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return getPizza().getDescription() + "Mozzarella Cheese ";
	}

	@Override
	public double getCost() {
		return getPizza().getCost() + 5;
	}
	
	

}
