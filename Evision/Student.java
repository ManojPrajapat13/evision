package Evision;

import java.io.Serializable;

// Serialization in io
public class Student implements Serializable {
	private String name;
	private int age;
	transient private String email;
	private String address;

	public Student() { // default costructor..

	}

	public Student(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void displyName() {
		System.out.println("my name is : " + this.name);
	}

}
