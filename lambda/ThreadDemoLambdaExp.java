package lambda;

public class ThreadDemoLambdaExp {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("i - " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
		};
		Thread t = new Thread(r);
		t.setName("JOHN");
		t.start();
		
		Runnable q = () -> {
			for(int i = 5 ; i>=0 ; i--) {
				System.out.println("i - " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(q);
		t2.setName("Akbar");
		t2.start();
	}
}
