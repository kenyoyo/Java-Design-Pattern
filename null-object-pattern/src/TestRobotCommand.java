
public class TestRobotCommand {
	
	public static void main(String[] args) {
		Robot robot = new Robot();
		
		ICommand moveForwardCommand = new MoveForwardCommand(robot);
		ICommand moveBackwardCommand = new MoveBackwardCommand(robot);
		ICommand noCommand = new NoCommand(robot);
		
		Invoker invoke = new Invoker(moveForwardCommand, moveBackwardCommand, noCommand);
		invoke.pressMoveForward();
		invoke.pressMoveBackward();
		invoke.pressNoCammand();
	}
	
}
