package Multithreading;

public class DaemonThread extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread is work...");
			System.out.println(Thread.currentThread().getName());
		} else {
			System.out.println("User thread work...");
		}
	}

	public static void main(String[] args) {

		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();
		DaemonThread d3 = new DaemonThread();

		d1.setDaemon(true);  // d1 is daemon thread..
		d3.setDaemon(true); //  d3.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
		if(d2.isDaemon()) {
			System.out.println("daemon h...");
		}else {
			System.out.println("not daemon..");
		}
	}

}
