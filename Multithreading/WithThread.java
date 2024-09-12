package Multithreading;

public class WithThread extends Thread{
	private String name;

	public WithThread(String nm) {
		name =  nm;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " Hello  " + name);
		}
 
	}
	
}
