package in06.streamapi.min;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exmple03 {

	public static void main(String[] args) {
		
		//Integer -->  Integet::compareTo
		//Double -->  Double::compareTo
		//String --> min(Comparator.comparingInt(String::length)
		//Character --> min(Comparator.naturalOrder())

		List<Character> asList = Arrays.asList('a','d','c','b'); //a,b,c,d
		
		Optional<Character> min = asList.stream().max(Comparator.naturalOrder());
		if(min.isPresent())
		{
			System.out.println(min.get());
		}
		
		

	}

}
