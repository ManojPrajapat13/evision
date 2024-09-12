package Evision;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			try {
				int n = 9330 / 0;
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				int a[] = new int [5];
				a[6] = 40;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("other statements....");
		}catch(Exception e ) {
			System.out.println(e.getMessage());
			System.out.println("outer catch......");
		}
		System.out.println("ending..");
	}
}
