package Evision;

public class NestedTryCatchExc {

	public static void main(String[] args) {
		try {
			try {
				try {
					int a[] = { 1, 2, 3, 4 };
					System.out.println(a[10]);
				} catch (ArithmeticException e) {
					System.out.println("block 3");
				}
			} catch (ArithmeticException e) {
				System.out.println("block 2");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("block 1 ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("eeeeeeeee");
		}
	}

}
