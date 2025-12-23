package in03.interface1.functionalInterfaces.customfi;

public class Example01 {
	public static void main(String[] args) {

//		public int calculate(int a);

		Square number = n -> n * n;
		int output = number.calculate(10);
		System.out.println(output);

	}

}
