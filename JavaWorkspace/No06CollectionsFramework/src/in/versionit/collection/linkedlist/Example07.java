package in.versionit.collection.linkedlist;

import java.util.LinkedList;

public class Example07 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.offer(100);
		list.offer(200);
		list.offer(300);
		list.offer(400);
		
		//int  --> Integer
		//char --> Character
		//boolean --> Boolean
		//double  --> Double
		//float   --> Float
		
		System.out.println(list);

		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		
		System.out.println(list);

	}

}
