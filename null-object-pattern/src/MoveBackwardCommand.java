
public class MoveBackwardCommand extends RobotCommand {

	public MoveBackwardCommand(Robot robot) {
		super(robot);
	}

	@Override
	public void execution() {
		getRobot().moveBackward();
	}

	@Override
	public void unexecution() {

	}

}
