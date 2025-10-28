package no08.versionit.inheritence3;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("child1 properties");
		System.out.println("-------------------");
		Child1 child1=new Child1();
		child1.child1Method();
		child1.parentMethod();
		
		
		System.out.println("child2 properties");
		System.out.println("-------------------");
		Child2 child2=new Child2();
		child2.child2Method();
		child2.parentMethod();
		
		
		System.out.println("child3 properties");
		System.out.println("-------------------");
		Child3 child3=new Child3();
		child3.child3Method();
		child2.parentMethod();
		
	}

}
