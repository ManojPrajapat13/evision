package Evision;

public class MinEleInRotateSortAr {

	public static int min(int a[] , int n) {
		int small = 0 ;
		for(int i = 0 ; i<n-1 ; i++) {
			if(a[i]>a[i+1]) {
				small= a[i+1];
				break;
			}else {
				small = a[0];
				break;
			}
		}
		return small;
	}
	public static void main(String[] args) {
		int a[] = {3610,2,10,11,12,20,25};
		int n = a.length;
		System.out.println(min(a,n));
	}
}
