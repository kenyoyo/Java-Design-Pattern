
public class Bird extends Animal{

	public Bird(String name) {
		super(new MixedEating(), new DefaultFlying(), new LandLiving(), name);
	}
	
}
