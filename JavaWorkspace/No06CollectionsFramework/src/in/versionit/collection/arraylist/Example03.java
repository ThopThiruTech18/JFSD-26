package in.versionit.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example03 {

	public static void main(String[] args) {

		// Employee emp=new Employee();

		ArrayList list = new ArrayList();
		list.add("hari");
		list.add(50);
		list.add('h');
		list.add(true);
		list.add(true);
		list.add(10.0);

		ListIterator listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("-------------------");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
