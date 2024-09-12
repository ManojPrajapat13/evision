package Evision;

import java.util.Scanner;

public class ExceptionHand {

	public static void main(String[] args) {
		System.out.println("started...");
		try {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			System.out.println(Integer.parseInt(s));
			System.out.println("dfghjk");
		} 
		catch (NumberFormatException e) {
			System.out.println("envalid number. ");
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
			Scanner sc = new Scanner(System.in);
			System.out.println("n can not devide by 0.");
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("xception ");
		}
		finally {
			System.out.println("i ma in finally block...");
		}
		System.out.println("ended...");
	}

}
