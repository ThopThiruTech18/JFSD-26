package no08.versionit.inheritence7;

public class Child implements ParentIInterface,Parent2Interface {

	@Override
	public void grandParentIInterfaceMethod() {
		System.out.println("GrandParentIInterface::grandParentIInterfaceMethod");
		
	}

	@Override
	public void parentIInterfaceMethod() {
		System.out.println("ParentIInterface :: ParentIInterfaceMethod");
		
	}

	@Override
	public void parent2IInterfaceMethod() {
		System.out.println("Parent2Interface :: parent2IInterfaceMethod");
		
	}

}
