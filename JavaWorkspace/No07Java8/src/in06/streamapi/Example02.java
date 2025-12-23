package in06.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Example02 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "bananaa", "cherry");
		
		
		OptionalInt max = words.stream().mapToInt(String::length).max();
		
		if(max.isPresent())
		{
			System.out.println(max.getAsInt());
		}
		
		
	}

}
