package Evision;

public class PrintAllPermutationOfStr {
	public static void permutation(String s, int l, int r) {
		if (l == r) {
			System.out.println(s);
		}else {
			for(int i=l ; i<r ; i++) {
				
			}
		}
	}

	public static void main(String[] args) {
		String s = "abcd";
		int l = 0;
		int r = s.length() - 1;
		permutation(s, l, r);
	}

}
