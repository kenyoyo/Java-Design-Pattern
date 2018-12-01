
public class SmallView extends View {

	public SmallView(IResource resource) {
		super(resource);
	}

	@Override
	public void showView() {
		System.out.println("Name: " + getResource().getMainResource());
	}

}
