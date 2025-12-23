package in.versionit.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example01 {

	public static void main(String[] args) {

		// Employee emp=new Employee();

		ArrayList list = new ArrayList();
		list.add("hari");
		list.add(50);
		list.add('h');
		list.add(true);
		list.add(true);
		list.add(10.0);

//		System.out.println(list.size());
//
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));

		// Cursors
//		for loop
		// Iterator
		// ListIterator
		// Enumarator
		// foreach loop
		// lambda expression
		// method reference

		System.out.println("--------------for loop-------------------");

		for (int i = 0; i <= list.size()-1; i++) {

			System.out.println(list.get(i));

		}
		
		
	}

}
