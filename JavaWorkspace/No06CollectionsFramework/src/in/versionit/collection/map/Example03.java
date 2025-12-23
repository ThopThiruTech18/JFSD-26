package in.versionit.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example03 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new LinkedHashMap<>();
		Map<Integer, String> map3 = new TreeMap<>(Collections.reverseOrder());

		map3.put(3, "C");
		map3.put(4, "D");
		map3.put(1, "A");
		map3.put(2, "B");

		System.out.println(map3);

	}

}
