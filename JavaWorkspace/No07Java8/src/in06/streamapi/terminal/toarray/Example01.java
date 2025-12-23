package in06.streamapi.terminal.toarray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example01 {
	
	public static void main(String[] args) {
		
		Integer[] array=new Integer[] {};
		Integer[] array1= {};
		
		List<Integer> asList = Arrays.asList(10,20,30,40,50);
		
		Integer[] numbers = asList.stream().toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(numbers));
		
		
	}

}
