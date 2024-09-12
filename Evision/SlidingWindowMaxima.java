package Evision;

public class SlidingWindowMaxima {

	public static void main(String[] args) {
		int[] arr = { 2, 6, -1, 2, 4, 1, -6, 5 };
		int k = 3;
		int m = 0;
		for (int i = 0; i < arr.length - k + 1; i++) {
			if ((arr[i] >= arr[i + 1]) && arr[i] >= arr[i + 2]) {
				arr[m] = arr[i];
				m++;
			}
			if ((arr[i + 1] >= arr[i]) && arr[i + 1] >= arr[i + 2]) {
				arr[m] = arr[i + 1];
				m++;
			}
			if ((arr[i + 2] >= arr[i + 1]) && arr[i + 2] >= arr[i]) {
				arr[m] = arr[i + 2];
				m++;
			}
		}
		for (int i = 0; i < arr.length - k + 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
