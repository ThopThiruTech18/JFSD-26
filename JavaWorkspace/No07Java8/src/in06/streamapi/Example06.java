package in06.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Example06 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 4, 2, 5);
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry");
		List<Double> prices = Arrays.asList(10.5, 20.0, 10.5, 15.75);
		List<Character> chars = Arrays.asList('a', 'b', 'c', 'a', 'b');
		
		
		Set<Integer> collect2 = numbers.stream().collect(Collectors.toSet());
		System.out.println(collect2);
//		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);
		
		
	}

}
