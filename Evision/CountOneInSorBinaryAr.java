package Evision;

public class CountOneInSorBinaryAr {

	public static int countOne(int a[], int l) {
		int c = 0;
		int i = 0;
		for (i = 0; i < l; i++) {
			if (a[i] == 1) {
				break;
			}
		}
		return l - i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 };
		int l = a.length;
		System.out.println(countOne(a, l));
	}

}
