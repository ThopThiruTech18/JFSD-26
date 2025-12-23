package in06.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example14 {

	public static void main(String[] args) {
		

List<Integer> numbers = Arrays.asList(1, 3,10, 5, 2, 4, 6);
List<Integer> afterDropWhile = numbers.stream().dropWhile(n -> n % 2 != 0).collect(Collectors.toList());
System.out.println("After DropWhile: " + afterDropWhile);


String sentence = "The quick brown fox jumps over the lazy dog";
List<String> afterDropWhile1 = Arrays.stream(sentence.split("\\s+")).dropWhile(word -> word.length() < 4).collect(Collectors.toList());
System.out.println("After DropWhile: " + afterDropWhile1);

List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
List<Double> afterDropWhile2 = prices.stream().dropWhile(p -> p < 20.0).collect(Collectors.toList());
System.out.println("After DropWhile: " + afterDropWhile2);

List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e');
List<Character> afterDropWhile3 = chars.stream().dropWhile(c -> c < 'd').collect(Collectors.toList());
System.out.println("After DropWhile: " + afterDropWhile3);


List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
List<String> afterDropWhile4 = strings.stream().dropWhile(s -> s.length() < 6).collect(Collectors.toList());
System.out.println("After DropWhile: " + afterDropWhile4);
		
		
		
		
		
	}

}
