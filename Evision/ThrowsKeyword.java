package Evision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite {

	public void readFile() throws FileNotFoundException {  // thorws use with the method name
		FileInputStream fi = new FileInputStream("d:/abc.text");
	}

	public void saveFile() throws FileNotFoundException {
		String text = "this is demo";
		FileOutputStream fo = new FileOutputStream("d:/xyz.text");
	}
}

public class ThrowsKeyword {
	public static void main(String[] args) {
		ReadAndWrite  rw = new ReadAndWrite ();
		try {
			rw.readFile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not found");
		}
		try {
			rw.saveFile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not found");
		} 
		System.out.println("end.....");
	}
}