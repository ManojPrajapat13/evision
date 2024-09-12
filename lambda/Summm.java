package lambda;

interface Sum {

	public abstract int sum(int a, int b);

	default void display() {

	}
}

public class Summm {

	public static void main(String[] args) {

		System.out.println("start sum ... ");

		Sum s = (a, b) -> a + b;

		System.out.println(s.sum(80, 20));
		System.out.println(s.sum(20, 200));
	}

}
