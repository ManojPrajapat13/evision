package Evision;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckAllUniqueChar {

	public static boolean check(String s) {
//		Map<Character, Integer> m = new HashMap<>();
		Set<Character> set = new HashSet<>();
		for(int i =0 ; i<s.length() ; i ++) {
			set.add(s.charAt(i));
		}
		if(set.size()!=s.length()) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
	    if(check(s)) {
	    	System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }
	}

}
