package no06.versionit.accessmodifiers1;

public class A {

	private int a = 10;
	int b = 20;
	protected static int c = 30;
	public int d = 40;

	public static void main(String[] args) {

		A a1 = new A();

		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);

	}

}
