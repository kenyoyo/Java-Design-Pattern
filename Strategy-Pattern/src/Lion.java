
public class Lion extends Animal{

	public Lion(String name) {
		super(new MeatEating(), new NoFlying(), new LandLiving(), name);
	}

}
