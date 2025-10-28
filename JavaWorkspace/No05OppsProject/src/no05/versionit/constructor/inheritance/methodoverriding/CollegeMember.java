package no05.versionit.constructor.inheritance.methodoverriding;

public class CollegeMember {

	String name;
	int id;

	public CollegeMember(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	void printData()
	{
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
	}
	
	
	

}
