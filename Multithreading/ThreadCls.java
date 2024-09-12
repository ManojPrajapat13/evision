package Multithreading;

public class ThreadCls extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("welcome.." + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadCls t = new ThreadCls();
		t.start();
		
	}

}
