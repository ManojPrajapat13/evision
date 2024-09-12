package Evision;

import java.util.Arrays;

public class SecLargestInAr {
	public static int secLarge(int a[] , int n) {
		Arrays.sort(a);
		for(int i = n-1 ; i>0 ; i--) {
			if(a[i]!=a[i-1]) {
				return a[i-1];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {2,8,9,88,22,102,6,3,1,4,7,5,101};
		int n = a.length;
		System.out.println(secLarge(a,n));
	}

}
