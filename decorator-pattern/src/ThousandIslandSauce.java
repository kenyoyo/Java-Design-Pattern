
public class ThousandIslandSauce extends DecoratePizzaTopping{

	public ThousandIslandSauce(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return getPizza().getDescription() + "Thousand Island Sauce ";
	}

	@Override
	public double getCost() {
		return getPizza().getCost() + 5;
	}

}
