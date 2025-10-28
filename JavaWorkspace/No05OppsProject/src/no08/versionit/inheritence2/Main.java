package no08.versionit.inheritence2;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.println("Child class properties");
		System.out.println("-------------------------------");
		Child child1=new Child();
		child1.childMethod();
		child1.parentMethod();
		child1.grandParentMethod();
		
		
		System.out.println("-------------------------------");
		System.out.println("Parent1 class properties");
		System.out.println("-------------------------------");
		Parent p1=new Parent();
		p1.parentMethod();
		p1.grandParentMethod();
		
		
		System.out.println("-------------------------------");
		System.out.println("GrandParent class properties");
		System.out.println("-------------------------------");
		
		GrandParent gp1=new GrandParent();
		gp1.grandParentMethod();
		
	}

}
