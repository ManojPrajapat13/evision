package Evision;

public class YoungerAgeException extends RuntimeException {
	
	YoungerAgeException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		int age = 56;
		try {
			if (age < 18) {
				throw new YoungerAgeException("u r not eligible for vote");  // programmer manualy ek 
																	//   exception obj ko print karva raha h
			} else {
				System.out.println("u r eligible for vote");
			}
		}
		catch(YoungerAgeException e){
			e.printStackTrace();
		}
		System.out.println("hello");
	}
	
}
