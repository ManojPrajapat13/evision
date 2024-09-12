package Evision;

public class PairInArSumCloseToX {

	public static void main(String[] args) {
		int a[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		int l = a.length;
		int x = 110;

		int msum = Math.abs(a[0] + a[1] - x);
		int p1 = 0, p2 = 0;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				int tsum = Math.abs(a[i] + a[j] - x);
				if (tsum < msum) {
					msum = tsum;
					p1 = i;
					p2 = j;
				}
			}
		}
		System.out.println(a[p1] + " -- " + a[p2]);
	}
}
