package in06.streamapi.min;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exmple02 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "cherry");
		
		Optional<String> min = words.stream().min(Comparator.comparingInt(String::length));
		if(min.isPresent())
		{
			System.out.println(min.get());
		}

	}

}
