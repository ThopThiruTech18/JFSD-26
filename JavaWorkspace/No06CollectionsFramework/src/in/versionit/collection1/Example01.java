package in.versionit.collection1;

import java.util.ArrayList;

public class Example01 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(40);
		
		
		ArrayList list2 = new ArrayList();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		boolean equals = list1.equals(list2);
		System.out.println(equals);
		
		

		
	}

}
