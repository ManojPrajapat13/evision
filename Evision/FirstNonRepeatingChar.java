package Evision;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void check(String s) {
//		HashMap<Character, Integer> m = new HashMap<>();
//		for(char ch : s.toCharArray()) {
//			m.put(ch,  m.getOrDefault(ch,0)+1);
//		}
//		for(Map.Entry<Character, Integer> e : m.entrySet()) {
////			if(e.getValue()<2) {
//				System.out.println(e.getKey() + "--" +e.getValue());
////				break;
////			}
//		}
		int j;
		for(int i = 0 ; i < s.length() ; i++) {
			
			for( j = 0 ; j<s.length() ;j++) {
				if(i!=j) {
					if(s.charAt(i) == s.charAt(j)) {
						break;
					}
				}
			}
			if(j==s.length()) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
	public static void main(String[] args) {
		String s = "soltionsl";  // f
		check( s) ;
	}

}
