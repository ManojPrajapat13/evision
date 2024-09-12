package Evision;

public class PrintAllSubString {
	public static void subString(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int k = 0; k < s.length()-i; k++) {
				for (int j = k; j < s.length()-i; j++) {
					System.out.print(c[j]);
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		String s = "abcd";
		subString(s);
	}

}
