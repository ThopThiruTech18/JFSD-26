package in06.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Example05 {
	
	public static void main(String[] args) {
		
		List<Character> list = Arrays.asList('a','b','c','d','a','a');
		
		List<Character> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
