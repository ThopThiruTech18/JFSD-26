package no09.versionit.polymorphism;

public class Calculator {

	public int add(int a) {
		return a + a;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();

		int add0 = cal1.add(10);

		int add1 = cal1.add(20, 30);
		int add2 = cal1.add(10, 20, 30);

		System.out.println(add0);
		System.out.println(add1);
		System.out.println(add2);

	}

}
