package no02.versionit.constructor1;

public class Employee {
	String name;
	int age;
	double salary;

//Note: If we dont provide any constructor it will create the default constructor

	void printData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}
}
