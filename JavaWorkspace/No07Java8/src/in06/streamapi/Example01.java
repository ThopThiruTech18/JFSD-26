package in06.streamapi;

import java.util.Arrays;
import java.util.List;

public class Example01 {
	
	public static void main(String[] args) {
		
	 List<String> asList = Arrays.asList("1","4","6","7","8","10","4");
		
	 asList.stream().forEach(s->System.out.println(s));
	 System.out.println("----------------");
	 asList.stream().distinct().mapToInt(Integer::parseInt).forEach(System.out::println);
	 
		
		
	}

}
