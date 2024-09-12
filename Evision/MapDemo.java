package Evision;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<>();
//		    Map<String, Integer> m = new HashMap<>();
		m.put("manoj", 1);
		m.put("Raj", 2);
		m.put("darshan", 3);
		m.put("gita", 4);
		m.put("kamal", 5);
		m.put("kamal", 6);
		m.put(null, 7);
		System.out.println(m);
		m.remove("gita");  // remove
		System.out.println(m);
		System.out.println("m.entrySet() -- "+m.entrySet());
		System.out.println( "m.keySet()-->"+m.keySet());
		for(String key : m.keySet()) {
			System.out.println(key + " - " + m.get(key));
		}
	}

}
