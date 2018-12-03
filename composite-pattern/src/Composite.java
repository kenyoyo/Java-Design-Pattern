import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	private String name;
	List<Component> composites = new ArrayList<Component>();

	Composite(String name) {
		this.name = name;
	}

	public void addComponent(Component c) {
		composites.add(c);
	}

	@Override
	public void showName() {
		System.out.println(name + " have:");
		for (Component c : composites) {
			c.showName();
		}
	}

}