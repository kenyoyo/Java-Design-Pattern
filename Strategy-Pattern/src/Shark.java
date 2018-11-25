
public class Shark extends Animal{

	public Shark(String name) {
		super(new MeatEating(), new NoFlying(), new AquaticLiving(), name);
	}
	
}
