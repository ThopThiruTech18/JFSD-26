package no04.versionit.constructor.accessmodifiers;

public class College {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee(10000, "kiran", 1001);
		emp.printData();
		
		System.out.println("------------------");
		Student student=new Student("charan", 2001, 45.50);
		student.printData();
	}

}
