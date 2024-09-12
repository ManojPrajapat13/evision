package Evision;

public class SepOddEvenInAr {
	public static void sep(int a[], int l) {
		int t[] = new int[l];
		int f = 0;
		int s = l-1;
		for(int i = 0 ; i<l ; i++) {
			if(a[i] % 2 != 0) {
				t[f] = a[i];
				f++;
			}else {
				t[s] = a[i];
				s--;
			}
		}
		for(int i = 0 ; i < l ; i++) {
			System.out.print(t[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 17, 70, 15, 22, 65, 21, 90 };
		int l = arr.length;
		sep(arr,  l); 
	}

}
