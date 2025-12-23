package in.versionit.collection.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exmple06 {
	
	public static void main(String[] args) {
		
		
		TreeSet set=new TreeSet();
		set.add(40);
		set.add(100);
		set.add(30);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
//		set.add(null);
		set.add('a');
		
		System.out.println(set);
		
		
		
	}

}
