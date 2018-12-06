
public class Invoker {

	private ICommand moveForward;
	private ICommand moveBackward;
	private ICommand noCommand;

	public Invoker(ICommand moveForward, ICommand moveBackward, ICommand noCommand) {
		super();
		this.moveForward = moveForward;
		this.moveBackward = moveBackward;
		this.noCommand = noCommand;
	}

	public void pressMoveForward() {
		moveForward.execution();
	}

	public void pressMoveBackward() {
		moveBackward.execution();
	}

	public void pressNoCammand() {
		noCommand.execution();
	}

}
