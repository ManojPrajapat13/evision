package Evision;

public class FindPairWithSumCloseToZero {

	public static void main(String[] args) {
		int ar[] = { 1, 3, -9 ,5, 7, 8, 20, -40, 6 }; // -5 6
		
		int msum =ar[0] +ar[1]; 
		int p1=0;
	    int p2=1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				int tsum = ar[i] + ar[j];
				if( Math.abs(msum)> Math.abs(tsum)) {
					p1=i;
					p2=j;
					msum = tsum;  
				}
			}
		}
		System.out.println("minimum sum is " +msum +" p1-> "+ ar[p1] +" p2-> "+ ar[p2]);
	}

}
