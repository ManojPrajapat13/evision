package Evision;

public class ExceptionPropagation {
	public static void a() {
		int d = 50/0;
	}
	public static void b() {
		a();
	}
	public static void c() {
		try {
			b();
		}catch(ArithmeticException e){
			System.out.println("exception is handled....");
		}
	}
	public static void main(String[] args) {
		ExceptionPropagation p = new ExceptionPropagation();
		p.c();
		System.out.println("ending...");
	}

}
