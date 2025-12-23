package in.versionit.collection.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Example03 {

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);

		Enumeration<Integer> elements = v1.elements();
		Integer sum = 0;
		while (elements.hasMoreElements()) {
			sum = sum + elements.nextElement();
		}
		
		System.out.println(sum);

	}

}
