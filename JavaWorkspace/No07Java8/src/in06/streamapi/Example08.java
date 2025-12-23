package in06.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example08 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 4, 2, 5,1,10);
		
		List<Integer> collect = numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
	}

}
