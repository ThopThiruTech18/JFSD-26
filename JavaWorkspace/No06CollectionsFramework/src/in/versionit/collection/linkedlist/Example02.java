package in.versionit.collection.linkedlist;

import java.util.LinkedList;

public class Example02 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.peek());
		System.out.println(list.offer(100));
		System.out.println(list);

	}

}
