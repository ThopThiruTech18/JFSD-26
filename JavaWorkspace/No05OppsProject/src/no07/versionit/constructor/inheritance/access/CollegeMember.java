package no07.versionit.constructor.inheritance.access;

public class CollegeMember {

	String name;
	int id;

	public CollegeMember(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void printData() {
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
	}

}
