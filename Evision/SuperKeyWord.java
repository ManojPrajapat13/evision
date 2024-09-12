package Evision;

class Animal {
	Animal(){
		System.out.println("animal is created...."); // constructor
	}
	String color = "Black";
	public void eat() {
		System.out.println("eating grass..");
	}
}

class Horse extends Animal {
	Horse(){
		super();  				// invoke immediate parent class constructor... 
		System.out.println("horse is created...");
	}
	String color = "Brown";
	public void eat() {
		System.out.println("eating bread... ");
	}

	public void color() {
		System.out.println(color);
		System.out.println(super.color);   //refer to immediate parent cladd instance var.
	}
	public void work() {
		super.eat();      				// invoke immediate parent class method..
	}
}

public class SuperKeyWord {

	public static void main(String[] args) {

		Horse h = new Horse();
		h.color();
		h.work();
	}
}
