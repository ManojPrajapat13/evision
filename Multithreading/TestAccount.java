package Multithreading;

public class TestAccount extends Thread {
	static Account acc = new Account();
	
	private String name;

	public TestAccount(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			acc.deposite(name, 1000);
		}
	}

	public static void main(String[] args) {
		TestAccount t1 = new TestAccount("chaman  ");
		TestAccount t2 = new TestAccount("vivek Dubey  ");
		t1.start();
		t2.start();
	}
}
