package in.versionit.assessments;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		String name = "racecar";
//					   0123456
		String sum = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			sum = sum + name.charAt(i);

		}

		if (name.equals(sum)) {
			System.out.println("Given String is polindrome");
		} else {
			System.out.println("Given String is not a polindrome");
		}

	}

}
