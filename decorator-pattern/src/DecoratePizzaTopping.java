
public abstract class DecoratePizzaTopping extends Pizza{

	private Pizza pizza;
	
	public DecoratePizzaTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public abstract String getDescription();

	public abstract double getCost();

}
