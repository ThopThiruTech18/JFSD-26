package in.versionit.collection.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example01 {
	
	public static void main(String[] args) {
		
		Deque<Integer> d1=new ArrayDeque<>();
		d1.add(10);
		d1.add(20);
		d1.add(30);
		d1.add(40);
		
		d1.addFirst(100);
		d1.addLast(200);
		
		d1.removeFirst();
		d1.removeLast();
		

		
		System.out.println(d1);
		
		
		
		
	}

}
