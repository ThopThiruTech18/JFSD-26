package in.versionit.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example04 {

	public static void main(String[] args) {

		// Employee emp=new Employee();

		ArrayList list = new ArrayList();
		list.add("hari");
		list.add(50);
		list.add('h');
		list.add(true);
		list.add(true);
		list.add(10.0);

		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("-------------");
		list.forEach(s -> System.out.println(s));
		System.out.println("--------------");
		list.forEach(System.out::println);

	}

}
