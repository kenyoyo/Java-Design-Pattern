
public class StackIterable extends DataIterable {

	StackIterable(String[] data) {
		super(data);
	}

	@Override
	public Iterator getIterator() {
		return new StackIterator(this);
	}

}
