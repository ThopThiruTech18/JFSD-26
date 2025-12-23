package in06.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example12 {

	public static void main(String[] args) {
		
		String sentence = "The quick brown fox jumps over the lazy dog a";
		
		String[] stringArray = sentence.split(" ");
		
		List<String> collect = Arrays.stream(stringArray).filter(f->f.length() >= 3).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
