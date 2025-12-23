package in06.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example11 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2,5, 3,4,6,7,8,9,10);
		
		List<Integer> evenNumbers = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		List<Integer> oddNumbers = list.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(oddNumbers);
		
		
		
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n->n%2!=0));
		System.out.println(map.get(true));
		System.out.println(map.get(false));
		
	}

}
