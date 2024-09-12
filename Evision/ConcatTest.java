package Evision;

public class ConcatTest {

	public static String concatWithString() {
		String s = "java";
		for (int i = 0; i < 10000; i++) {
			s = s + "Tpoint";
		}
		return s;
	}

	public static String concatWithStringBuilder() {
		StringBuilder t = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			t.append("Tpoint");
		}
		return t.toString();
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println("Time taken by Concating with StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
