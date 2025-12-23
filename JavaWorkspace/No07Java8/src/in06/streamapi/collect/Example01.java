package in06.streamapi.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example01 {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,5,2,4);
		Set<Integer> collect1 = asList.stream().map(c->c*c).collect(Collectors.toSet());
		List<Integer> collect2 = asList.stream().map(c->c*c).collect(Collectors.toList());
		Map<Integer, Integer> collect = asList.stream().collect(Collectors.toMap(c->c,c->c*c));
		Integer[] array = asList.stream().toArray(Integer[]::new);
		System.out.println(collect);
	}

}
