
public class PizzaMaker {

	public static void main(String[] args) {
		Pizza newPizza = SauceFactory.getSauce(SauceType.TOMATO,
						 SauceFactory.getSauce(SauceType.THOUSANDISLAND, 
						 CheeseFactory.getCheese(CheeseType.Mozzarella, 
						 CheeseFactory.getCheese(CheeseType.Chedda, 
						 CrustFactory.getCrust(CrustType.PAN)))));
		
		System.out.println(newPizza.getDescription());
		System.out.println("Total Cost: " + newPizza.getCost());
	}

}
