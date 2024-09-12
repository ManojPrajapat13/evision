package Evision;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream; 

public class SerialStudent {

	public static void main(String[] args) { 
		try {
			// creat obj of Student class
			Student s = new Student("manoj", 22, "manoj@gmail.com", "ujjain");
			System.out.println("hash code of s :- "+s.hashCode());
			// write data to file
			FileOutputStream fos = new FileOutputStream("abc.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// for serializing we call the method.. of ObjectOutputStream class..
			oos.writeObject(s);

			oos.close();
			fos.close();

			System.out.println("object state transfer to file abc.txt");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
