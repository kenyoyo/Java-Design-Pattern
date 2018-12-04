
public class QueueIterator implements Iterator {

	private QueueIterable queueIterate;
	private int index;
	
	public QueueIterator(QueueIterable queueIterable) {
		queueIterate = queueIterable;
		index = -1;
	}
	
	@Override
	public boolean hasNext() {
		return index < queueIterate.getSize()-1;
	}

	@Override
	public void next() {
		index++;
	}

	@Override
	public String getCurrent() {
		return queueIterate.getData(index);
	}

}
