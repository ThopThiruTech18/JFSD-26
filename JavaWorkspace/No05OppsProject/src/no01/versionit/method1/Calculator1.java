package no01.versionit.method1;

public class Calculator1 {

	// without parameters & without return type
	public void add1() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);

	}

	// without parameters & with return type
	public int add2() {
		int a = 10;
		int b = 20;
		return a + b;
	}

	public double add3() {
		double a = 10.0;
		double b = 20.0;
		return a + b;
	}

	// with parameters & with return type

	public int add4(int a, int b) {

		return a + b;
	}

	public double add5(double a, double b) {

		return a + b;
	}
	
	
	// with parameters & without return type
	
	public void add6(int a, int b) {

		System.out.println(a + b);
	}

	public void add7(double a, double b) {
		System.out.println(a + b);
	}
	

}
