package Evision;

class YoungException extends RuntimeException {
	public YoungException(String s) {
		super(s);
	}
}

class MiddleException extends RuntimeException {
	public MiddleException(String s) {
		super(s);
	}
}

class ElderException extends RuntimeException {
	public ElderException(String s) {
		super(s);
	}
}

public class CustomExceForVote {

	public static void main(String[] args) {
		System.out.println("started....");
		int age = 26;
		try {
			if (age >= 18 && age < 25) {
				throw new YoungException("you can 2 vote");
			}
		} catch (YoungException e) {
			System.out.println(e.getMessage());
		}
		try {
			if (age >= 25 && age < 50) {
				throw new MiddleException("you can 3 vote");
			}
		} catch (MiddleException e) {
			System.out.println(e.getMessage());
		}
		try {
			if (age >= 50 && age < 60) {
				throw new ElderException("you can 4 vote");
			}
		} catch (ElderException e) {
			System.out.println(e.getMessage());
		}
		if (age > 60 || age < 18) {
			System.out.println("you are not eligible for vote.");
		}

	}

}
