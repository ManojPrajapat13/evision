package Evision;

public class FindLeaderInAr {
	public static void leader(int a[], int l) {
		for(int i = l-1 ; i >= 0; i--) {
			int j = i;
			for(j = i ; j <l ; j++) {
				if(a[j] > a[i]) {
					break;
					
				}
			}
			if(j==l) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 70, 15, 99, 65, 21, 95,90 };
		int l = arr.length;
		leader(arr, l);

	}

}
