package Evision;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMap {

	public static void main(String[] args) {
		HashMap<Integer , String> m =  new LinkedHashMap<>();
//		Map<Integer , String> m =  new LinkedHashMap<>();
		m.put(101, "Banana");
		m.put(110, "Mango") ;
		m.put(102, "Grapes");
		m.put(103, "Apple") ;
		System.out.println(m);
		for(int k : m.keySet()) {
			System.out.println( k + " " + m.get(k));
		}
		
		for(Map.Entry<Integer, String> e : m.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
	}
}