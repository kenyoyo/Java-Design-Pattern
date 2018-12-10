
public class PersonBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String height;
	private String weight;
	
	public PersonBuilder() {
		firstName = "undefined";
		lastName = "undefined";
		age = "undefined";
		height = "undefined";
		weight = "undefined";
	}

	public PersonBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public PersonBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public PersonBuilder setAge(String age) {
		this.age = age;
		return this;
	}

	public PersonBuilder setHeight(String height) {
		this.height = height;
		return this;
	}

	public PersonBuilder setWeight(String weight) {
		this.weight = weight;
		return this;
	}

	public Person getPerson() {
		return new Person(firstName, lastName, age, height, weight);
	}

}