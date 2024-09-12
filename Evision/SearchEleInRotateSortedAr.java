package Evision;

public class SearchEleInRotateSortedAr {
	public static int search(int a[],int k) {
		
		for(int i = 0 ; i<a.length ; i++) {
			if(a[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[]= {5,6,7,8,9,1,2,3,4};
		int k = 8;
		System.out.println("present at index - " +search(a,k));
	}

}
