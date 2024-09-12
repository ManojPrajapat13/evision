package Evision;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("abc.txt");
		BufferedWriter b = new BufferedWriter(f);
		b.write("welcome to the point...");
		b.close();
		System.out.println("success...");
	}
}