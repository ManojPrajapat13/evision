package Evision;

public class ZeroOneTwoSortAr {

	public static void main(String[] args) {
		int a[] = { 0, 2, 1, 0, 0, 2, 1 };
		int l = a.length;
		int z=0 , o=0, t=0;
		int fr[] = new int[3];
		for (int i : a) {
			if(i == 0) {
				z++;
			}else if(i == 1) {
				o++;
			}else{
				t++;
			}
		}
		int k =0 ;
		for(int i = 0 ; i<z ; i++) {
			a[k] = 0;
			k++;
		}
		for(int i = 0 ; i<o ; i++) {
			a[k] = 1;
			k++;
		}
		for(int i = 0 ; i<t ;i++) {
			a[k] = 2;
			k++;
		}
		
		for(int i = 0 ; i <l ; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
