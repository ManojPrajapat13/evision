package Evision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingDataFromConsoleByInputStreamReaderAndBufferedReader {

	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		System.out.println("enter your name - ");
		String name = b.readLine();
		System.out.println("Welcome - " + name);
	}

}
