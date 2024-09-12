package Evision;

import java.util.Scanner;

public class ReverseString {
	public static void reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		for (int i = 0; i < sb.length(); i++) {
			System.out.print(sb.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		reverse(s);
	}

}
