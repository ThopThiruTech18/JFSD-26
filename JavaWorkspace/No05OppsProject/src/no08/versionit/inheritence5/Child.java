package no08.versionit.inheritence5;

public class Child implements ParentInterfaceA,ParentInterfaceB{

	@Override
	public void methodB() {
		System.out.println("ParentInterfaceB :: methodB");
		
	}

	@Override
	public void methodA() {
		System.out.println("ParentInterfaceA :: methodA");
		
	}

}
