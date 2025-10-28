package no04.versionit.constructor.accessmodifiers;

 class CollegeMember {

	  String name;
	 int id;

	public CollegeMember(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	void printData()
	{
		System.out.println(name);
		System.out.println(id);
	}

}
