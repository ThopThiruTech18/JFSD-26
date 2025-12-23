package in.versionit.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example10 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "java");
		map1.put(2, "python");
		map1.put(3, "php");
		
		System.out.println(map1.putIfAbsent(4, "C"));
		System.out.println(map1.putIfAbsent(1, "java"));
		System.out.println(map1);
		
		
		

		

		

	}

}
