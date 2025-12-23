package in06.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example18 {

	public static void main(String[] args) {
		
		
		List<String> asList = Arrays.asList("vijay","tharun","kiran");
		 List<Integer> asList2 = Arrays.asList(60,50,80,65);
		
		List<String> collect = asList.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<Character> collect2 = asList.stream().map(s->s.charAt(0)).collect(Collectors.toList());
		List<Integer> collect3 = asList2.stream().map(s->s+5).collect(Collectors.toList());
		
		
		System.out.println(collect);
		System.out.println(collect2);
		System.out.println(collect3);
		
	}

}
