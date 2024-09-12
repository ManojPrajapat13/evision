package Evision;

public class FindPairWithSumK {

	public static void main(String[] args) {
		int a[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
		int l = a.length;
		int k = 15;
		
		for(int i = 0 ;i<l ; i++) {
			for(int j = i+1 ; j< l ; j++) {
				if(a[i] +a[j] == k) {
					System.out.println(a[i] +" and "+ a[j]);
				}
			}
		}
	}

}
