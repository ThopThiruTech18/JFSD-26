package in03.interface1.functionalInterfaces;

@FunctionalInterface
public interface No03MyInterface {

	public void add(int a, int b);

	default void m1() {
		System.out.println("No03MyInterface :: m1");
	}

	default void m2() {
		System.out.println("No03MyInterface :: m1");
	}

	static void m3() {
		System.out.println("No03MyInterface :: m1");
	}

	static void m4() {
		System.out.println("No03MyInterface :: m1");
	}

}
