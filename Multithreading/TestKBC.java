package Multithreading;

import java.util.Scanner;

public class TestKBC {
	public static void soJao(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcon to KBC");
		soJao(2);
		System.out.println("Aap khel rahe kon banega Crorepati");
		soJao(3);
		System.out.println("Mai bol raha hu Amitabh Bachchan");
		soJao(2);
		System.out.println("First Question for you");
		soJao(1);
		System.out.println("Who is PM of India");
		soJao(2);
		System.out.println("your options are :");
		soJao(1);
		System.out.println("a. Rahul Ghandhi    b. Narendra Modi");
		System.out.println("c. Prinka Gandhi    d. Yogi");
		
		String q = sc.next();
		soJao(3);
		if(q.equals("b") || q.equals("B")) {
			System.out.println("Correct");
			soJao(1);
			System.out.println("Next Question for You");
			System.out.println("Second Question is");
			soJao(1);
			System.out.println("Who is Best Batsman of India");
			soJao(2);
			System.out.println("your options are :");
			soJao(1);
			System.out.println("a. Rahul Dravida    b. Jadeja");
			System.out.println("c. K.L. Rahul   d. King Kohli");
			
			q = sc.next();
			soJao(3);
			
			
			if(q.equals("d") || q.equals("D")) {
				System.out.println("Correct Answer");
				soJao(1);
				System.out.println("Next Question for You");
				System.out.println("Third Question is");
				soJao(1);
				System.out.println("Who is father of Nation");
				soJao(2);
				System.out.println("your options are :");
				soJao(1);
				System.out.println("a. Mahtama Gandhi    b. Jadeja");
				System.out.println("c. K.L. Rahul   d. King Kohli");
				
				q = sc.next();
				soJao(3);
				
				if(q.equals("a") || q.equals("A")) {
					System.out.println("Correct Answer");
					System.out.println("Next Question for You");
					System.out.println("Last Question is");
					soJao(1);
					System.out.println("What is National Game of India");
					soJao(2);
					System.out.println("your options are :");
					soJao(1);
					System.out.println("a. Cricket    b. Football");
					System.out.println("c. Hockey   d. Vollyball");
					
					q = sc.next();
					soJao(3);
					
					if(q.equals("c") || q.equals("C")) {
						System.out.println("Correct Answer");
						soJao(1);
				    	System.out.println("---------GOOD--------- ");
				    	soJao(1);
				    	System.out.println("AAP JEET CHUKE H 1 CR. KI DHANRASHI");
			}else {
				System.out.println("ohh.. sorry your answer is incorrect");
			}
		}else {
			System.out.println("ohh.. sorry your answer is incorrect");
		}
	}else {
			System.out.println("ohh.. sorry your answer is incorrect");
		  }
	}else {
		System.out.println("ohh.. sorry your answer is incorrect");
	  }
	}
}
