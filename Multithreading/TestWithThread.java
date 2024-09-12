package Multithreading;

public class TestWithThread {
	
	public static void main(String[] args) {
		WithThread wt1 = new WithThread(" Manoj ");
		WithThread wt2 = new WithThread(" Prakash Chandra ");
		
		wt1.start();
		wt2.start();
		
		wt1.setName("my name is manoj");
//		System.out.println("wt1 thread name --> "+ wt1.getName());
		wt1.setPriority(5);
		System.out.println();
		System.out.println(wt1.getPriority()); 
		System.out.println(wt2.getState());
		System.out.println(wt1.getThreadGroup().getName());
		System.out.println(Thread.MIN_PRIORITY + "  " + Thread.NORM_PRIORITY+"  "+ Thread.MAX_PRIORITY);
	}
}
