package Evision;

import java.util.HashMap;
import java.util.Map;

public class CountNumOfFreqEachEleInSortArr {
	public static void freq(int a[] , int l) {
		HashMap<Integer , Integer> m = new HashMap<>();
		for(int i : a) {
			m.put(i, m.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> e : m.entrySet()) {
			System.out.println("frequency of " +e.getKey() +" is : " + e.getValue() );
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 3, 3, 4, 5, 5, 6, 6};
		int l = arr.length;
		
		freq(arr , l); 
	}

}
