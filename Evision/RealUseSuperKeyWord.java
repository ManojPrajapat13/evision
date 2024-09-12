package Evision;
class Person{
	String name ;
	int id;
	Person(int id , String name){
		this.id = id;
		this.name = name;
	}
}
class Employee extends Person{
	float salary;
	Employee(int id , String name ,float salary){
		super(id, name);
		this.salary = salary;
	}
	public void display() {
		System.out.println(id+" " +name + " " + salary);
	}
}
public class RealUseSuperKeyWord {

	public static void main(String[] args) {
		Employee e = new Employee(101 , "Raja" , 2500.0f);
		e.display();

	}

}
