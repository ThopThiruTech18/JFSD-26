package in.versionit.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example09 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "hari");
		
		System.out.println(map1.isEmpty());
		System.out.println(map1.size());
		
		System.out.println(map1);
		map1.clear();
		System.out.println(map1);
		

		

		

	}

}
