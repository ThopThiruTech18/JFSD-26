package no03.versionit.constructor.thiskeyword;

public class Employee {
	String name;
	int age;
	double salary;

	public Employee() {
		
		System.out.println("0-Param: Constructor");
	}

	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("Param: Constructor");
		
		

	}

	void printData() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Salary : " + this.salary);
	}
}
