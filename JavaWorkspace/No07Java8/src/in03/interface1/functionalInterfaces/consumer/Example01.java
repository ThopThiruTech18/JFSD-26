package in03.interface1.functionalInterfaces.consumer;

import java.util.Arrays;
import java.util.List;

public class Example01 {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,20,30,40,50);
		asList.forEach(s->System.out.println(s));
		
		
	}

}
