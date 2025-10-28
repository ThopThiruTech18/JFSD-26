package no01.versionit.method2;

public class Employee {
	String name;
	int age;
	double salary;

	void takeInputs(String l_name, int l_age, double l_salary) {
		name = l_name;
		age = l_age;
		salary = l_salary;
	}

	void printData() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}
}
