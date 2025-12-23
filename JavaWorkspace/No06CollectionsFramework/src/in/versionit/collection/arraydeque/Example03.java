package in.versionit.collection.arraydeque;

import java.util.PriorityQueue;

public class Example03 {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(10);
		pq.add(5);
		pq.add(25);
		pq.add(1);
		pq.add(100);
		
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
