package in06.streamapi.anymatchallnone;

import java.util.Arrays;
import java.util.List;

public class Examaple01 {
	
	public static void main(String[] args) {
		
		//any match
		List<Integer> asList1 = Arrays.asList(1,2,3);
		List<Integer> asList2 = Arrays.asList(1,3,5,7);
		boolean anyMatch1 = asList1.stream().anyMatch(s -> s%2 == 0);
		boolean anyMatch2 = asList2.stream().anyMatch(s -> s%2 == 0);
		
		System.out.println(anyMatch1);
		System.out.println(anyMatch2);
		
	}

}
