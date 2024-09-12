package Multithreading;

class UserThread extends Thread{
	public void run() {
		// task for thread..
		System.out.println("this is user defined thread");
	}
}
public class ThreadOperation {

	public static void main(String[] args) {
		System.out.println("start..");
		int x = 20 + 60;
		System.out.println("sum is " + x);
		System.out.println(Thread.currentThread());
		Thread t = Thread.currentThread();

		System.out.println("before current thread name is - " + t.getName());
		t.setName("First thread");
		System.out.println("after current thread name is - " + t.getName());
		System.out.println("current thread id is - " + t.getId());
		System.out.println("priority - "+ t.getPriority());
		try {
			t.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		UserThread u = new UserThread();
		
		// start method for start thread
		u.start();
		
		System.out.println("end..");
	}

}
