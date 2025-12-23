package in.versionit.collection.linkedlist;

import java.util.LinkedList;

public class Example03 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
		

	}

}
