package in06.streamapi.terminal;

import java.util.Arrays;
import java.util.List;

public class Example02 {
	
	public static void main(String[] args) {
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75);
		prices.stream().forEach(price -> System.out.printf("%.2f ", price));
		
	}

}
