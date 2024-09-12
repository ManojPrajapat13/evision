package Evision;

class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String str) {  // 1 parameter constructor
		// calling he constructor of parent calss..
		super(str);
	}
	public InvalidAgeException() {  // 0 parameter constructor
		// calling he constructor of parent calss..
		super();
	}
}

public class CustomExceptionExa {

//	static void valideAge(int )
	public static void main(String[] args) {
		int age = 15;
		try {
			valide(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			System.out.println("found exception");
			System.out.println("exception : " + e.getMessage());
		}
		System.out.println("ended.......");
	}

	static void valide(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("age is note valide...");
		} else {
			System.out.println("aaao vote karo...");
		}
	}
}