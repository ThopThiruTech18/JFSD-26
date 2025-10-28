package no04.versionit.constructor.inheritance;

public class Employee extends CollegeMember {

	double salary;

	public Employee(double salary, String name, int id) {

		super(name, id);
		this.salary = salary;
	}
	public void printData()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Id :"+this.id);
		System.out.println("Salary :"+this.salary);
	}
	
	

}
