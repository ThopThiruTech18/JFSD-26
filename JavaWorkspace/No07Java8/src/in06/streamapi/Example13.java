package in06.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example13 {

	public static void main(String[] args) {
		
		String name="aeiou";
		

		System.out.println(name.indexOf("a"));
		System.out.println(name.indexOf("e"));
		System.out.println(name.indexOf("i"));
		System.out.println(name.indexOf("o"));
		System.out.println(name.indexOf("u"));
		System.out.println(name.indexOf("b"));
		System.out.println(name.indexOf("c"));
		
		List<Character> list = Arrays.asList('a', 'b', 'c', 'd', 'e');
		
		List<Character> collect = list.stream().filter(f->"aeiou".indexOf(f) != -1).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		
		
	}

}
