
public class Human implements IActionTarget {

	@Override
	public void move() {
		System.out.println("Move by walking.");
	}

	@Override
	public void energy() {
		System.out.println("Get energy by eating food.");
	}

	@Override
	public void rest() {
		System.out.println("Take a rest by sleeping.");
	}

}
