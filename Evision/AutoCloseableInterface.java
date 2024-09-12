package Evision;

class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("my resource..");
	}

}

public class AutoCloseableInterface {

	public static void main(String[] args) {

		try (MyClass m = new MyClass()) {

		} catch (Exception e) {

		}
	}

}
