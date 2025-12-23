package in06.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Example04 {
	
	public static void main(String[] args) {
		
		List<Character> list = Arrays.asList('a','b','c');
		int sum = list.stream().mapToInt(c->(int)c).sum();
		System.out.println(sum);
	}

}
