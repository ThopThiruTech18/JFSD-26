package in06.streamapi.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example02 {
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("java","python","dotnet");
		
		String collect = asList.stream().collect(Collectors.joining(",","{","}"));
		System.out.println(collect);
	
	}

}
