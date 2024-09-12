package Evision;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialStudent {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			Student st = (Student) ois.readObject();
			st.displyName();
			System.out.println(st.hashCode());
			System.out.println(st.getAge());
			System.out.println(st.getEmail()); // null because of Transient keyword
			System.out.println(st.getAddress());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
