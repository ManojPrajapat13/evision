package Evision;

public class SubString {

	public static void main(String[] args) {
		String s = "abcd";
//		System.out.println(s.substring(0, 1));
//		System.out.println(s.substring(0, 2));
//		System.out.println(s.substring(0, 3));
//		System.out.println(s.substring(0, 4));
//		System.out.println(s.substring(1, 2));
//		System.out.println(s.substring(1, 3));
//		System.out.println(s.substring(1, 4));
//		System.out.println(s.substring(2, 3));
//		System.out.println(s.substring(2, 4));
//		System.out.println(s.substring(3, 4));

		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.print(s.substring(i , j) + " - ");
			}
		}

	}

}
