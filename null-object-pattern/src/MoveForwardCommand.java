
public class MoveForwardCommand extends RobotCommand {

	public MoveForwardCommand(Robot robot) {
		super(robot);
	}

	@Override
	public void execution() {
		getRobot().moveForward();
	}

	@Override
	public void unexecution() {

	}

}
