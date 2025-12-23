package in.versionit.collection.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exmple05 {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		LinkedHashSet<Integer> set2=new LinkedHashSet<>(50);
		LinkedHashSet<Integer> set3=new LinkedHashSet<>(50,0.50f);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		System.out.println(set);
		
		
		
		
	}

}
