package Multithreading;

public class TestNoThread {

	public static void main(String[] args) {
		NoThread nt1 = new NoThread("Virat");
		NoThread nt2 = new NoThread("Mahendra Singh Dhoni");
		
		nt1.run();
		nt2.run();
	}

}
