package Evision;

public class ZeroOneSaperate {

	public static void sep(int a[] , int l) {
		int c = 0;
		for(int i = 0 ; i < l ; i++) {
			if(a[i] == 0) {
				c++;
			}
		}
		for(int i= 0 ; i < c ; i++) {
			a[i] = 0;
		}
		for(int j = c ; j<l ; j++) {
			a[j] = 1;
		}
	}
	public static void main(String[] args) {
		int a[] = {0,1,0,1,0,1,1,0,0,0,1,0,1,1,1,0,1};
		int l = a.length;
		sep(a,l);
		for(int i = 0 ; i < l ; i++ ) {
			System.out.print(a[i]+ " ");
		}

	}

}
