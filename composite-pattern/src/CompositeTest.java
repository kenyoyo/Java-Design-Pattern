
public class CompositeTest {

	public static void main(String[] args) {
		Leaf toilet = new Leaf("Toilet");
		Leaf bed = new Leaf("Bed");
		Leaf pillow = new Leaf("Pillow");
		Leaf oven = new Leaf("Oven");
		Leaf food = new Leaf("Food");

		Composite bathroom = new Composite("Bathroom");
		Composite bedroom = new Composite("Bedroom");
		Composite kitchen = new Composite("Kitchen");
		Composite home = new Composite("Home");

		bathroom.addComponent(toilet);
		bedroom.addComponent(bed);
		bedroom.addComponent(pillow);
		kitchen.addComponent(oven);
		kitchen.addComponent(food);
		home.addComponent(bathroom);
		home.addComponent(bedroom);
		home.addComponent(kitchen);
			
		//bedroom.showName();
		//kitchen.showName();
		home.showName();
	}

}