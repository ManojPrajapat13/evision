package lambda;

public class Main {

	public static void main(String[] args) {
		System.out.println("start...");
// 1. create sparate class and impl MyInterface
//		MyInterface m = new Lambda();
//		m.display();

// 2. Anonymous class for impl inteface

//		MyInterface n = new MyInterface() { // anonymous class
//
//			@Override
//			public void display() {
//				System.out.println("this is first anonymous class..");
//
//			}
//		};
//		n.display();
//
//		MyInterface v = new MyInterface() {
//			@Override
//			public void display() {
//				System.out.println("this is second anonymous class..");
//
//			}
//		};
//		v.display();

// 3. use our functional interface with the help of Lambda Expression

		MyInterface e = () -> System.out.println("using first time lambda expression...");

		e.display();
		
		MyInterface ee = ()->System.out.println("using second time lambda expression...");
		ee.display();
	}

}
