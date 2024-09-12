package Evision;

public class LocalMinimaInAr {

	public static int localMin(int a[] , int n) {
		if(a.length == 1) {
			return a[0];
		}
		if(a.length == 2) {
			if(a[0]< a[1]) {
				return a[0];
			}else {
				return a[1];
			}
		}
		int ans = -1;
		for(int i = 0 ; i<n-1 ; i++) {
			if(a[i+1]>a[i]) {
				return a[i];
			}
			if(i == n-1) {
				ans = a[n-1];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int a[] = {10, 5, 3, 6, 13, 16, 7};  //{23, 8, 15, 2, 3} - 1
		int n = a.length;
		System.out.println(localMin(a,n));
	}

}
