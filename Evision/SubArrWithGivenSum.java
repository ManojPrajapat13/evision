package Evision;

public class SubArrWithGivenSum {
	public static void subarr(int a[], int sum) {
		for (int i = 0; i < a.length; i++) {
			int s = 0;
			for (int j = i; j < a.length ; j++) {
				s = s + a[j];
				if (s == sum) {
					System.out.println("subarray idx are ("+i + "," + j+")");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 4, 9, 0, 11 };
		int sum = 9;
		subarr(arr, sum);
	}
}
