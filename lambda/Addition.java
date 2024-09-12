package lambda;

// compile error when no abstract method is invalid @FunctionalInterface annotation
//annotation for functional interface

@FunctionalInterface
public interface Addition {

	public abstract int sum(int a, int b);

	static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println(add(5, 6));
	}
}