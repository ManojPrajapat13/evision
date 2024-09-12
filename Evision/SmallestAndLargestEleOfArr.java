package Evision;

public class SmallestAndLargestEleOfArr {

	public static void main(String[] args) {
		int ar[] = { 5, 8, 3, 9, 7, 4, 55, 6, 3, 1, 5, 6 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length ; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println("smallest element---> " + ar[0]);
		System.out.println("largest element---> " + ar[ar.length-1]);
	}
}
