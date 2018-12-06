
public class NoCommand extends RobotCommand {

	public NoCommand(Robot robot) {
		super(robot);
	}

	@Override
	public void execution() {
		getRobot().noCommand();
	}

	@Override
	public void unexecution() {

	}

}
