package Evision;

public class FinallyBlock {

	public static void main(String[] args) {
		// 1==> When an exception does not occur
		try {
			int n = 25 / 5;
			System.out.println(n);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} finally {
			System.out.println("finally block is always executed 1");
		}
		// 2==> When an exception occurr but not handled by the catch block
//		try {
//			int m[] = new int[5];
//			System.out.println(m[5]);
//		} catch (NumberFormatException e) {
//			System.out.println("Number Format Exception....");
//		} finally {
//			System.out.println("finally block is executed 2");
//		}

		// 3==> When an exception occurs and is handled by the catch block
		try {
			String s =null;
			System.out.println(s);
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception....");
		} finally {
			System.out.println("finally block is executed 3");
		}
	}

}
