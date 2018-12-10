

public class TestPersonBuilder {

	public static void main(String[] args) {
		Person p1 = new PersonBuilder().setFirstName("John").setAge("34").getPerson();
		Person p2 = new PersonBuilder().setLastName("Camby").setWeight("55").setHeight("182").getPerson();
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
