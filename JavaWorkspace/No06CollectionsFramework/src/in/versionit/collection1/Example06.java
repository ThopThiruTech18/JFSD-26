package in.versionit.collection1;

import java.util.ArrayList;

public class Example06 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(60);
		list1.add(50);
		list1.add(60);

		

		System.out.println(list1.indexOf(50));
		System.out.println(list1.indexOf(60));
		System.out.println(list1.lastIndexOf(60));

	}

}
