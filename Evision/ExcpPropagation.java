package Evision;

import java.io.IOException;

public class ExcpPropagation {
	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		ExcpPropagation obj = new ExcpPropagation();
		obj.p();
		System.out.println("normal flow");
	}
}
