package in06.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example16 {

	public static void main(String[] args) {
		
		
//				h = 104
//				e = 101
//				l = 108
//				l = 108
//				o = 111
		
		//104,101,108,108,111
		
		
		//KEY-VALUE
		//h-1
		//e-1
		//l-2
		//o-1
		
		
//		String name="hello"; 
//		
//		Map<Character, Long> collect = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s->s,Collectors.counting()));
//		System.out.println(collect);
		
		List<String> words = Arrays.asList("hello", "world");         //104,101,108,108,111-> 104,101,108,111
		List<Character> distinctChars = words.stream().flatMap(s -> s.chars().distinct().mapToObj(c -> (char) c)).collect(Collectors.toList());
		System.out.println("Distinct Characters: " + distinctChars);

	}

}
