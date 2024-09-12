package Evision;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// example to handle checked exception

public class FileNotFoundExc {

	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("manoj.txt");
			pw.println();
		}
		catch(FileNotFoundException e ) {
			System.out.println(e.getMessage());
		}
		System.out.println("file saved successfully...");
	}

}
