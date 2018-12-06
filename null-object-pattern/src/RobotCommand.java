
public abstract class RobotCommand implements ICommand {

	private Robot robot;

	public RobotCommand(Robot robot) {
		super();
		this.robot = robot;
	}

	public abstract void execution();

	public abstract void unexecution();

	public Robot getRobot() {
		return robot;
	}

}
