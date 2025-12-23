package in06.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example09 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10);
		
		
		List<Integer> collect1 = numbers.stream().limit(3).collect(Collectors.toList());
		List<Integer> collect2 = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(collect1);
		System.out.println(collect2);
		
		
	}

}
