package in06.streamapi.terminal;

import java.util.Arrays;
import java.util.List;

public class Example01 {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,20,30,50,15,25);
	  
		asList
		.stream()
		.forEach(s->System.out.println(s));
		
		
		asList
		.stream()
		.forEachOrdered(s->System.out.println(s));
		
	}

}
