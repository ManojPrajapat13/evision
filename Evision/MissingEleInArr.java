package Evision;

public class MissingEleInArr {
	public static int missing(int a[], int n) {
		int s = n * (n + 1) / 2;
		int c = 0;
		for (int i = 0; i < n-1; i++) {
			c = c + a[i];
		}
		return s - c;
	}

	public static void main(String[] args) {
		int a[] = { 3,12,10,6, 5, 7, 8, 9, 4, 2, 1 };
		int n = a.length + 1;

		System.out.println(missing(a, n));
	}

}
