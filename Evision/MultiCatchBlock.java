package Evision;

public class MultiCatchBlock {

	public static void main(String[] args) {
		try {
//			int a[] = new int [5];
//			a[5] = a[4]/0;
			String s = null;
			int l = s.length();
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occur -- / by 0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("idx 5 is  not found..");
		}
		catch(NullPointerException e) {
			System.out.println("null point found...");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("ended.........");
		}
	}

}
