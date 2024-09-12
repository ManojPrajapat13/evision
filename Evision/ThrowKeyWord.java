package Evision;

public class ThrowKeyWord {

	public static void valide(int age) {
		if (age < 18) {
			throw new ArithmeticException("not eligible");
		} else {
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		int age = 2;
		valide(age);

		System.out.println("ending......");
	}

}
