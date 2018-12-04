
public class StackIterator implements Iterator {

	private StackIterable stackIterate;
	private int index;

	public StackIterator(StackIterable stackIterable) {
		stackIterate = stackIterable;
		index = stackIterate.getSize();
	}

	@Override
	public boolean hasNext() {
		return index > 0;
	}

	@Override
	public void next() {
		index--;
	}

	@Override
	public String getCurrent() {
		return stackIterate.getData(index);
	}

}
