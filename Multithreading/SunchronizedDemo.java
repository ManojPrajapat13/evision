package Multithreading;

class Display {
	// synchronization done
	public synchronized void wish(String name) {
		for (int i = 0; i < 2 ; i++) {
			System.out.print("good morning...");
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThreadd extends Thread {
	String name;
	Display d;

	public MyThreadd(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class SunchronizedDemo {
	public static void main(String[] args) {
		Display d = new Display();
		Display dd = new Display();
		MyThreadd t1 = new MyThreadd(d, "Virat");
		MyThreadd t2 = new MyThreadd(dd, "Yuvraj");
//		MyThreadd t3 = new MyThreadd(d, "Raina");
//		MyThreadd t4 = new MyThreadd(d, "Rohit");
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
	}
}