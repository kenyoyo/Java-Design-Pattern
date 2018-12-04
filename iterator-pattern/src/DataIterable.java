
public abstract class DataIterable implements Iterable {

	private String[] data;

	DataIterable(String[] data) {
		this.data = data;
	}

	public abstract Iterator getIterator();

	public String getData(int index) {
		return data[index];
	}

	public int getSize() {
		return data.length;
	}

}
