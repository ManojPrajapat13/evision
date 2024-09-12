package Multithreading;

public class Account {
	private int balance;

	public Account( int balance) {
		this.balance = balance;
	}

	public Account() {
		
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	public synchronized void deposite(String name, int amount ) {
		
		int bal = getBalance();
		setBalance(bal + amount);
		
		System.out.println(name + "Amount deposite , now your balance =" + getBalance() );
		
	}
}
