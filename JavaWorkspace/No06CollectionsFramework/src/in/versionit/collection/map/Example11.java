package in.versionit.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example11 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "java");
		map1.put(2, "python");
		map1.put(3, "php");

		Set<Integer> keys = map1.keySet();

		for (Integer key : keys) {
			System.out.println(key);

		}

	}

}
