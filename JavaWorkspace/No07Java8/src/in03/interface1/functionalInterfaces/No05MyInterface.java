package in03.interface1.functionalInterfaces;

import java.util.function.Predicate;

public class No05MyInterface {

	public static void main(String[] args) {

		String[] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };

		Predicate<String> p = name -> name.charAt(0) == 'S';

		for (String name : names) {

			if (p.test(name)) {
				System.out.println(name);
			}

		}

	}

}
