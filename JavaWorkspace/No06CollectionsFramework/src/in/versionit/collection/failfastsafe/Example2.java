package in.versionit.collection.failfastsafe;

import java.util.concurrent.CopyOnWriteArrayList;

public class Example2 {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
		
		list.add(20);
		list.add(30);
		list.add(40);
		
		
//		list--> 20,30,40
//		copy entire list --> 20,30,40,100   add 200
//		copy--> 20,30,40,100,200
		
		
		for (Integer integer : list) {
			
			list.add(100);
			
			System.out.println(integer);
			
		}
		
	}

}
