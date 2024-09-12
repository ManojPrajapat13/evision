package lambda;

public class LengthOfStringgg {

	public static void main(String[] args) {
		String s = "asdfghjkl";

		LengthOfString l = str -> str.length();

		System.out.println(l.length("sdfghjksdfghjasdfghj"));
	}
}
