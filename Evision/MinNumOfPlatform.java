package Evision;

import java.util.Arrays;

public class MinNumOfPlatform {
	public static int min(int a[], int d[], int l) {
		Arrays.sort(a);
		Arrays.sort(d);
		int p = 0, max = 0;
		int i = 0 , j = 0;
		while(i<l && j<l) {
			if (a[i] < d[j]) {
				p++;
				i++;
				if (p > max) {
					max = p;
				}
			} else {
				p--;
				j++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 100, 140, 150, 200, 215, 400 };
		int dep[] = { 110, 300, 220, 230, 315, 600 };
		int l = arr.length;

		System.out.println(min(arr, dep, l));

//		int c = 1;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < dep[i - 1]) {
//				c++;
//			}
//		}
//		System.out.println(c);
	}

}
