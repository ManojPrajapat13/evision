package Evision;

public class SearchInARowWiseAndColumnWiseSortedMatrix {

	public static void main(String[] args) {
		int[][] m = { { 1, 6, 10, 12, 20 }, { 4, 8, 15, 22, 25 }, { 5, 20, 35, 37, 40 }, { 10, 28, 38, 45, 55 } };
		int k = 37;
		for(int i = 0 ; i< m.length ; i++) {
			for(int j = 0 ; j<m[0].length ; j++) {
				if(m[i][j] == k) {
					System.out.println(i+" " + j);
				}
			}
		}
	}

}
