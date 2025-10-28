package in.versionit.programs;

public class Example3 {

	public static void main(String[] args) {

		// Reverse of a String
		String name = "hello"; // lenth=5-1=4
		// 01234

		char[] charArray = name.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			System.out.print(charArray[i]);

		}
		System.out.println();
		for (int i = charArray.length - 1; i >= 0; i--) {

			System.out.print(charArray[i]);

		}

	}

}
