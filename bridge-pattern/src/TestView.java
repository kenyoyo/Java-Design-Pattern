
public class TestView {

	public static void main(String[] args) {
		Book book = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
		BookResource bookResource = (BookResource) ResourceFactory.getResource(ResourceType.BOOK);
		bookResource.setBook(book);

		Movie movie = new Movie("Avatar", "James Cameron");
		MovieResource movieResource = (MovieResource) ResourceFactory.getResource(ResourceType.MOVIE);
		movieResource.setMovie(movie);

		View largeViewBook = ViewFactory.getView(ViewType.LARGE, bookResource);
		System.out.println("Large view showing book resource:");
		largeViewBook.showView();
		System.out.println();

		View largeViewMovie = ViewFactory.getView(ViewType.LARGE, movieResource);
		System.out.println("Large view showing movie resource:");
		largeViewMovie.showView();
		System.out.println();

		View smallViewBook = ViewFactory.getView(ViewType.SMALL, bookResource);
		System.out.println("Small view showing book resource:");
		smallViewBook.showView();
		System.out.println();

		View smallViewMovie = ViewFactory.getView(ViewType.SMALL, movieResource);
		System.out.println("Small view showing movie resource:");
		smallViewMovie.showView();
	}

}
