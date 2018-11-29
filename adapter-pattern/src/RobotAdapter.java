
public class RobotAdapter implements IActionTarget {
	
	RobotAdaptee robot;
	
	public RobotAdapter(RobotAdaptee robot) {
		this.robot = robot;
	}

	@Override
	public void move() {
		System.out.print("Move by ");
		robot.command();
	}

	@Override
	public void energy() {
		System.out.print("Get energy by ");
		robot.charge();
	}

	@Override
	public void rest() {
		System.out.print("Take a rest by ");
		robot.shutdown();

	}
	
	
	
}
