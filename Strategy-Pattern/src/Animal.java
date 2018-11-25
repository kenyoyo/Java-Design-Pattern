
public abstract class Animal{
	private IEatBehavior ieb;
	private IFlyBehavior ifb;
	private ILiveBehavior ilb;
	private String name;
	
	
	
	public Animal(IEatBehavior ieb, IFlyBehavior ifb, ILiveBehavior ilb, String name) {
		super();
		this.ieb = ieb;
		this.ifb = ifb;
		this.ilb = ilb;
		this.name = name;
	}
	
	public  void eat() {
		ieb.eat();
	}
	
	public  void live() {
		ilb.live();
	}
	
	public  void fly() {
		ifb.fly();
	}
	
	public String toString() {
		return "My name is " + name + ".";
	}
}
