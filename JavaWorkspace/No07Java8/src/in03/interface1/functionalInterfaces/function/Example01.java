package in03.interface1.functionalInterfaces.function;

import java.util.function.Function;

public class Example01 {

	public static void main(String[] args) {

		Function<String, String> name = n -> n.toUpperCase();
		System.out.println(name.apply("hello"));

		Function<String, Integer> name1 = n -> n.length();
		System.out.println(name1.apply("hello"));

	}

}
