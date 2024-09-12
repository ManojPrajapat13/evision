package Evision;

class YoungEx extends RuntimeException {
	public YoungEx(String s) {
		super(s);
	}
}

class OldEx extends RuntimeException {
	public OldEx(String s) {
		super(s);
	}
}

public class CustomExceptionOldYoung {

	public static void main(String[] args) {
		int age = 82;
		try {
			if (age > 60) {
				throw new YoungEx("young exception is occur....");
			}
		} catch (YoungEx e) {
			System.out.println(e.getMessage());
		}

		try {
			if (age < 18) {
				throw new OldEx("old exception is ocur....");
			}
		} catch (OldEx e) {
			System.out.println(e.getMessage());
		}
		if (age >= 18 && age <= 60) {
			System.out.println("u can marry now .... ");
		}
	}
}
