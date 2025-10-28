package in.versionit.programs;

public class Example2 {

	public static void main(String[] args) {

		// Reverse of a String
		String name = "hello"; // lenth=5-1=4
		// 01234

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

	}

}
