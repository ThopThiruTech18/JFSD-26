package in.versionit.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example06 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		

		map1.put(1, "A");
		map1.put(3, "C");
		map1.put(4, "D");
		map1.put(2, "B");

		Set<Entry<Integer, String>> entrySet = map1.entrySet();

		for (Entry<Integer, String> entry : entrySet) {

			System.out.println(entry.getKey()+" : "+entry.getValue());
			

		}

	}

}
