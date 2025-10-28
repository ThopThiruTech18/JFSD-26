package no02.versionit.constructor3;

public class Employee {
	String name;
	int age;
	double salary;

	public Employee() {
		System.out.println("0-Param: Constructor");
	}

	public Employee(String l_name, int l_age, double l_salary) {
		name = l_name;
		age = l_age;
		salary = l_salary;
		System.out.println("Param: Constructor");

	}

	void printData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}
}
