
public class CarAdapter implements IActionTarget {
	
	private CarAdaptee car;
	
	public CarAdapter(CarAdaptee car) {
		this.car = car;
	}
	
	@Override
	public void move() {
		System.out.print("Move by ");
		car.drive();
	}

	@Override
	public void energy() {
		System.out.print("Get energy by ");
		car.addFuel();
	}

	@Override
	public void rest() {
		System.out.print("Take a rest by ");
		car.stop();
	}

}
