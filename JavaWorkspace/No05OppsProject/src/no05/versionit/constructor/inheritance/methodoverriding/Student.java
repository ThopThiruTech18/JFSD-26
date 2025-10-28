package no05.versionit.constructor.inheritance.methodoverriding;

public class Student extends CollegeMember {

	double marks;

	public Student(String name, int id, double marks) {
		super(name, id);
		this.marks = marks;
	}

	public void printData() {
		System.out.println("Name :" + this.name);
		System.out.println("Id :" + this.id);
		System.out.println("Marks :" + this.marks);
	}

}
