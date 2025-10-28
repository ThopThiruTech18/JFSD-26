package no09.versionit.polymorphism;

public class Calculator2 {

	public int add(int a, int b) {
		return a + b;
	}

	public double add(int a, double b) { // 10,10.05
		return a + b;
	}

	public double add(double a, double b) { // 10,10.05
		return a + b;
	}

	public double add(double a, int b) { // 10,10.05
		return a + b;
	}

	public static void main(String[] args) {

		Calculator2 cal = new Calculator2();

		double add = cal.add(10.0, 10.0);
		int add2 = cal.add(10, 10);
		double add3 = cal.add(10.0, 10);
		double add4 = cal.add(10, 10.00);

		System.out.println(add);
		System.out.println(add2);
		System.out.println(add3);
		System.out.println(add4);

	}

}
