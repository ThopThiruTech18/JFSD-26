package in.versionit.collection.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Example01 {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);

		Enumeration elements = v1.elements();

		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}

	}

}
