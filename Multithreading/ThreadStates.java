package Multithreading;

class X implements Runnable {
	public void run() {
		for (int i = 0; i < 1; i++) {
			System.out.println("hlo..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The state of thread t1 while it invoked the "
					+ "method join() on thread t2 -" + ThreadStates.t1.getState());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadStates implements Runnable {
	
	public static Thread t1;
	public static ThreadStates obj;

	public static void main(String[] args) {
		obj = new ThreadStates();
		t1 = new Thread(obj);
		
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
	}
	public void run() {
		X myObj = new X();
		Thread t2 = new Thread(myObj);
		
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());
		
		try {
			t2.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t2.getState());
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t2.getState());
	}
}
