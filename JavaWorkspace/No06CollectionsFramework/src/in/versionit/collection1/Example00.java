package in.versionit.collection1;

import java.util.ArrayList;

public class Example00 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(101);
		list.add(100);
		list.add(40);

		System.out.println(list);
		System.out.println(list.set(3, 1000));
		System.out.println(list);

	}

}
