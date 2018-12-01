
public abstract class View {
	
	private IResource resource;
	
	public View(IResource resource) {
		this.resource = resource;
	}
	
	public IResource getResource() {
		return resource;
	}
	
	public abstract void showView();
	
}
