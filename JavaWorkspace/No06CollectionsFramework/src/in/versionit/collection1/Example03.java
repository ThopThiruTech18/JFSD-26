package in.versionit.collection1;

import java.util.ArrayList;

public class Example03 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		ArrayList list2 = new ArrayList();
		list2.add(50);
		list2.add(60);
		list2.add(70);

		System.out.println(list1);
		list1.addAll(list2);

		System.out.println(list1);

	}

}
