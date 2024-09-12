package Evision;

public class StockBuySelltoMaximizeProfit {

	public static void main(String[] args) {
		int arr[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
		int l = arr.length;

		int m = 0;

		for (int i = 0; i < l; i++) {
			int t = 0;
			for (int j = i + 1; j < l; j++) {
				t = Math.abs(arr[j] - arr[i]);
				if (t > m) {
					m = t;
					System.out.println( i +" " + j);
				}
			}
		}
		System.out.println(m);

	}

}
