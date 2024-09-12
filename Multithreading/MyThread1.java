package Multithreading;

public class MyThread1 extends Thread {
	public void run() {
		System.out.println("run method");
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			try {
				MyThread1.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String argvs[]) {

		// Thread t = new Thread("My first thread");

		MyThread1 m = new MyThread1();
		m.run();
//		m.start();
//		t.start();
		
//		String str = MyThread1.getName();
//		System.out.println(str);
	}
}
