package in.versionit.collection.linkedlist;

import java.util.LinkedList;

public class Example04 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		list.addFirst(1);
		list.addLast(100);
		System.out.println(list);
		

	}

}
