package in06.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,4,1, 2,5, 3,4,6,7,8,9,10);
		
		
		List<Integer> collect = numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
