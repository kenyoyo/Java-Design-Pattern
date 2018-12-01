
public class LargeView extends View {

	public LargeView(IResource resource) {
		super(resource);
	}

	@Override
	public void showView() {
		System.out.println("Name: " + getResource().getMainResource());
		System.out.println("Created by: " + getResource().getOtherResource());
	}

}
