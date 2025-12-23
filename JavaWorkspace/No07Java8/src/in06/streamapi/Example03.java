package in06.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Example03 {
	
	public static void main(String[] args) {
		
		List<Double> list = Arrays.asList(10.0,20.0,30.0);
		
		int asInt = list.stream().mapToInt(Double::intValue).max().getAsInt();
		System.out.println(asInt);
	}

}
