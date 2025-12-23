package in.versionit.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example02 {

	public static void main(String[] args) {

		// Employee emp=new Employee();

		ArrayList list = new ArrayList();
		list.add("hari");
		list.add(50);
		list.add('h');
		list.add(true);
		list.add(true);
		list.add(10.0);

		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		

	}

}
