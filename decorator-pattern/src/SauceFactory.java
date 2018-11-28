
public class SauceFactory {
	public static Pizza getSauce(SauceType sauceType, Pizza pizza) {
		if(sauceType.equals(SauceType.TOMATO))
			return new TomatoSauce(pizza);
		else if(sauceType.equals(SauceType.THOUSANDISLAND))
			return new ThousandIslandSauce(pizza);
		else
			return null;
	}
}
