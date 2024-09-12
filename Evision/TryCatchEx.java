package Evision;

public class TryCatchEx {

	public static void main(String[] args) {
		
		int a = 50;
		int b = 0;
		int d ;
		try {
			d = a / b;
			System.out.println("in try block...");
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(80/0);
			System.out.println("can not divided by 0..");
		}
		System.out.println("ended...");
	}

}
