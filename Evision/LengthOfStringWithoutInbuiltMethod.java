package Evision;

import java.util.Scanner;

public class LengthOfStringWithoutInbuiltMethod {
	public static int length(String s) {
//		int l = 0;
//		while(true) {
//			try {
//				s.charAt(l);
//				l++;
//			}catch(Exception e) {
//				break;
//			}
//		}
//		return l;
		
		int l = 0;
		for(char ch : s.toCharArray()) {
			l++;
		}
		return l;
	}

	public static void main(String[] args) {
		String s = "rjrjvision";
		System.out.println(length(s));

	}

}
