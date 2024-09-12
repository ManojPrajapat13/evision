package Evision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc = null;
//		try {
//			sc = new Scanner (System.in);
//			System.out.println("enter age : ");
//			String age = sc.next();
//			System.out.println(Integer.parseInt(age));
//		} catch (NumberFormatException e) {
//			System.out.println("Number Format Exception");
//			System.out.println(e.getMessage());
//		} finally {
////			sc.close(); 
//		}
//		System.out.println("end...");

		Scanner sc = new Scanner(System.in); 		   // before java 9 not allow
		InputStream io = new FileInputStream("m.txt"); // to declare outside of try () , the only way to delare
		try (io; sc) {				//try (Scanner sc = new Scanner(System.in); InputStream io = new FileInputStream("m.txt")) 
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
