
public class TestIterator {
	
	public static void main(String[] args) {
		String[] data = {"first", "second", "last"};
		System.out.println("Data list: " + data[0] + ", " + data[1] + ", " + data[2]);
		System.out.println();
		
		Iterable queueIterable = new QueueIterable(data);
		Iterator queueIterator = queueIterable.getIterator();
		
		System.out.println("Iterate data by Queue Iterator.");
		while(queueIterator.hasNext()) {
			queueIterator.next();
			System.out.print(queueIterator.getCurrent() + " ");
		}
		System.out.println("\n");
		
		Iterable stackIterable = new StackIterable(data);
		Iterator stackIterator = stackIterable.getIterator();
		
		System.out.println("Iterate data by Stack Iterator.");
		while(stackIterator.hasNext()) {
			stackIterator.next();
			System.out.print(stackIterator.getCurrent() + " ");
		}
	}
	
}
