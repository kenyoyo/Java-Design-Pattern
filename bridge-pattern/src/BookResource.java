
public class BookResource implements IResource {

	private Book book;

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String getMainResource() {
		return book.getBookName();
	}

	@Override
	public String getOtherResource() {
		return book.getAuthorName();
	}

}
