package Evision;

public class AnagramCheck {

	public static boolean check(String a, String b) {
		int fr[] = new int[26];
		if(a.length() != b.length()) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			fr[a.charAt(i) - 'a']++;
			fr[b.charAt(i) - 'a']--;
		}
		for(int i = 0 ; i<26 ;i++) {
			if(fr[i]!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String a = "anagram";
		String b = "gramana";
		if(check(a,b)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
}
