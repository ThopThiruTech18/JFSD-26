package in.versionit.collection.failfastsafe;

import java.util.ArrayList;

public class Example {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for (Integer one : list) {
			
			list.add(40);
			
			System.out.println(one);
			
		}
		
	}

}
