package no04.versionit.constructor.inheritance;

public class CollegeMember {

	String name;
	int id;

	public CollegeMember(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void printData() {
		System.out.println("Name :" + this.name);
		System.out.println("Id :" + this.id);
	}

}
