
public class ResourceFactory {

	public static IResource getResource(ResourceType resourceType) {
		if (resourceType.equals(ResourceType.BOOK))
			return new BookResource();
		else if (resourceType.equals(ResourceType.MOVIE))
			return new MovieResource();
		else
			return null;
	}
}
