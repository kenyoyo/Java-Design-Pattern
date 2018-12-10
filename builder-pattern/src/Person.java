
public class Person {

	private String firstName;
	private String lastName;
	private String age;
	private String height;
	private String weight;

	public Person(String firstName, String lastName, String age, String height, String weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [firstName= " + firstName + ", lastName= " + lastName + 
				", age= " + age + ", height= " + height
				+ ", weight= " + weight + "]";
	}

}
