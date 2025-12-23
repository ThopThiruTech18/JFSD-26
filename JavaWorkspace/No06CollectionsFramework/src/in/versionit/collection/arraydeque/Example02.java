package in.versionit.collection.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example02 {
	
	public static void main(String[] args) {
		
		Deque<Integer> d1=new ArrayDeque<>();
		d1.add(10);
		d1.add(20);
		d1.add(30);
		d1.add(40);
		d1.add(null);
		
		d1.offerFirst(1000);
		d1.offerLast(2000);
		

		
		System.out.println(d1);
		
		
		
		
	}

}
