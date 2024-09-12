package Evision;

import java.util.HashMap;
import java.util.Map;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is pawan hello manoj hello My name";
		
		String[] ss = str.split(" ");
		
		Map<String , Integer> m = new HashMap<>();
		for(String s : ss) {
			m.put(s , m.getOrDefault(s, 0)+1);
		}
		
		for(Map.Entry<String , Integer> e : m.entrySet()) {
			if(e.getValue() == 2) {
				System.out.println(e.getKey());
			}
		}
		
		for (int i = ss.length - 1; i >= 0; i--) {
			System.out.print(ss[i] + " ");
		}
	}

}
