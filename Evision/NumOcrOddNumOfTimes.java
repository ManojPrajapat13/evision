package Evision;

import java.util.HashMap;
import java.util.Map;

public class NumOcrOddNumOfTimes {

	public static void ocr(int a[] , int m) {
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i : a) {
			map.put(i ,map.getOrDefault(i, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			if(e.getValue() % 2 == 1) {
				System.out.println(e.getKey());
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
		int m = a.length;
				
		ocr(a,  m);
	}

}
