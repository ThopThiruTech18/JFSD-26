package in.versionit.collection.linkedlist;

import java.util.LinkedList;

public class Example06 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.offer(100);
		list.offer(200);
		list.offer(300);
		list.offer(400);
		
		list.offerFirst(1);
		list.offerLast(1000);
		
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		
		System.out.println(list);

	}

}
