package in.versionit.assessments;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		String name = "racecar";
		int vowelsCount = 0;
		int consonentsCount = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {

				vowelsCount++;

			} else {
				consonentsCount++;
			}

		}

		System.out.println("vowelsCount is : " + vowelsCount);
		System.out.println("vowelsCount is : " + consonentsCount);

	}

}
