
public class QueueIterable extends DataIterable {

	QueueIterable(String[] data) {
		super(data);
	}

	@Override
	public Iterator getIterator() {
		return new QueueIterator(this);
	}

}
