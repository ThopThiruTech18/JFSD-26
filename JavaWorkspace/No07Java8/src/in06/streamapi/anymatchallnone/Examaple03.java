package in06.streamapi.anymatchallnone;

import java.util.Arrays;
import java.util.List;

public class Examaple03 {
	
	public static void main(String[] args) {
		
		//any match
		List<Integer> asList1 = Arrays.asList(1,2,3);
		List<Integer> asList2 = Arrays.asList(1,3,5,7);
		List<Integer> asList3 = Arrays.asList(10,2,4);
		boolean anyMatch1 = asList1.stream().allMatch(s -> s%2 == 0);
		boolean anyMatch2 = asList2.stream().allMatch(s -> s%2 == 0);
		boolean anyMatch3 = asList3.stream().allMatch(s -> s%2 == 0);
		
		System.out.println(anyMatch1);
		System.out.println(anyMatch2);
		System.out.println(anyMatch3);
		
	}

}
