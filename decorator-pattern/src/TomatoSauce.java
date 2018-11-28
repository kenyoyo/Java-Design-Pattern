
public class TomatoSauce extends DecoratePizzaTopping{

	public TomatoSauce(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return getPizza().getDescription() + "Tomato Sauce ";
	}

	@Override
	public double getCost() {
		return getPizza().getCost() + 5;
	}

}
