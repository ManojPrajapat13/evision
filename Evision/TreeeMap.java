package Evision;

import java.util.Map;
import java.util.TreeMap;

public class TreeeMap {

	public static void main(String[] args) {
		TreeMap<String , Integer> m = new TreeMap<>();
		m.put("Manoj", 13);
		m.put("Raj" , 45);
		m.put("Kamal", 12);
		m.put("Om", 20);
		System.out.println(m);
		m.remove("Om");
		m.put("Aman", 70);
		m.put("Naren", 26);
		m.put("Balram" , 55);
		System.out.println(m);
		for(String k : m.keySet()) {
			System.out.println("key : "+ k + " value : " + m.get(k));
		}
	}
}
