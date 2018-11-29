
public class TestAdapterActionTarget {
	
	public static void showAction(IActionTarget action) {
		action.move();
		action.energy();
		action.rest();
		System.out.println();
	}
	
	public static void main(String[] args) {
		IActionTarget human = new Human();
		System.out.println("Human Action:");
		showAction(human);
		
		IActionTarget car = new CarAdapter(new CarAdaptee());
		System.out.println("Car Action:");
		showAction(car);
		
		IActionTarget robot = new RobotAdapter(new RobotAdaptee());
		System.out.println("Robot Action:");
		showAction(robot);
	}
	
}
