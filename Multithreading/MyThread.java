package Multithreading;

public class MyThread implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("value of i is : " + i);
			try {
				Thread.sleep(2000);  //  in mili second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// create object of MyThread class
		MyThread t = new MyThread();

		Thread th = new Thread(t);
		
		// create object of ThreadCls class
		ThreadCls tc = new ThreadCls();
		
		th.start();
		tc.start();
	}

}
