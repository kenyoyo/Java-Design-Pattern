
public class Main {
	
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Lion("Lion King");
		animal[1] = new Shark("Shaqtin");
		animal[2] = new Bird("Humming");
		
		for(int i=0; i<animal.length; i++) {
			System.out.println(animal[i]);
			animal[i].live();
			animal[i].eat();
			animal[i].fly();
			System.out.println();
		}
	}
}
