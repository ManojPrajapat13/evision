package Evision;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.addFirst("a");
		l.addLast("is");
		System.out.println(l);
		l.addFirst("this");
		l.addLast("list");
		System.out.println(l);
		System.out.println(l.size());
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " -> ");
		}
		System.out.println("null");
		l.addLast("kjk");
		System.out.println(l);
		l.addFirst("mcncn");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.remove();
		System.out.println(l);
		System.out.println(l.size());
	}

}
