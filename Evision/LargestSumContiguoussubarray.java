package Evision;

public class LargestSumContiguoussubarray {
	
	public static int sum(int a[] , int l) {
		int s = 0;
		int max = a[0];
		for(int i = 0 ; i <l ; i++) {
			s += a[i];
			if(s<0) {
				s =0;
			}
			if( s > max) {
				max = s;
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 8, -3, -7, 2, 7, -1, -9 };
		int l = arr.length;
		System.out.println(sum(arr , l));
	}

}
