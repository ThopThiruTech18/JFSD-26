package in.versionit.collection.linkedlist;

import java.util.LinkedList;

public class Example05 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.poll());
		System.out.println(list.poll());
		
		System.out.println(list);
		

		
		

	}

}
