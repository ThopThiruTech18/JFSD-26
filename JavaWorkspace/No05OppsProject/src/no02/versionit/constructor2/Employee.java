package no02.versionit.constructor2;

public class Employee {
	String name;
	int age;
	double salary;

	public Employee() {
		System.out.println("0-Param: Constructor");
	}

	void printData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}
}
