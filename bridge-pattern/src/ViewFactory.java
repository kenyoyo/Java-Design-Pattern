
public class ViewFactory {

	public static View getView(ViewType viewType , IResource resource) {
		if(viewType.equals(ViewType.LARGE))
			return new LargeView(resource);
		else if(viewType.equals(ViewType.SMALL))
			return new SmallView(resource);
		else 
			return null;
	}
	
}
