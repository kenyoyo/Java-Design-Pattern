
public class Leaf implements Component {

	private String name;

	Leaf(String name) {
		this.name = name;
	}

	@Override
	public void showName() {
		System.out.println(" " + name);
	}
	
}