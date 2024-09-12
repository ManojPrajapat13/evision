package Evision;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInStr {

	public static void duplicate(String s) {
		Map<Character , Integer> m = new HashMap<>();
		for(char ch : s.toCharArray()) {
			m.put(ch, m.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character, Integer> e : m.entrySet()) {
			if(e.getValue() > 1) {
				System.out.println(e.getKey() + " " + e.getValue() );
			}
		}
	}
	public static void main(String[] args) {
		String s = "softwaresolution";
		String ss = "mmanoj";
		duplicate( s );

	}

}
