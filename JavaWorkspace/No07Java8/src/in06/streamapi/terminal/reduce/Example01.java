package in06.streamapi.terminal.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example01 {
	
	public static void main(String[] args) {
		
//		List<Integer> asList = Arrays.asList(1,2,3,4,5);
//		Optional<Integer> numbers = asList.stream().reduce((a, b) -> a * b);
//		if(numbers.isPresent())
//		{
//			System.out.println(numbers.get());
//			
//		}
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
	    String reduce = words.stream().reduce("      ",(a, b) -> a + "" + b);
		System.out.println(reduce);
		
	}

}
