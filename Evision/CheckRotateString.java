package Evision;

public class CheckRotateString {

	public static boolean check(String a, String b) {
		
		if((a.length() == b.length())&&((a+a).indexOf(b) != -1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "vision";
		String s2 = "ionvis";
		
		if(check(s1,s2)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
