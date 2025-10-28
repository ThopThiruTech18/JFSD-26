package no01.versionit.method1;

public class Main {

	public static void main(String[] args) {

		Calculator1 cal1 = new Calculator1();

		int add4 = cal1.add4(10, 40);

		System.out.println(add4);

		double add5 = cal1.add5(10.0, 90.0);
		System.out.println(add5);

		// with parameters without return type

		cal1.add6(1, 5);
		cal1.add7(1.0, 5.0);

	}

}
