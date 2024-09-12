package Evision;

public class RotateArrByKPosition {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 2;
		int b[] = new int[k];
		for (int i = 0; i < k; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < a.length - k; i++) {
			a[i] = a[i + k];
		}
		int j = 0;
		for (int i = a.length - k; i < a.length; i++) {
			a[i] = b[j];
			j++;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
