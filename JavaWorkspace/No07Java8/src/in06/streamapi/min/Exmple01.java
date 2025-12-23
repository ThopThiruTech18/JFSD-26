package in06.streamapi.min;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exmple01 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

		Optional<Integer> min = numbers.stream().min(Integer::compareTo);

		if (min.isPresent()) {
			System.out.println(min.get());

		}
		
		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
		if(max.isPresent())
		{
			System.out.println(max.get());
		}

	}

}
