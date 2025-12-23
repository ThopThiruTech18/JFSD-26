package in.versionit.collection.vector;

import java.util.Vector;

public class Example05 {

	public static void main(String[] args) {

		Vector<Integer> v1=new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.addElement(60);
		v1.removeElementAt(0);
		
		System.out.println(v1);
		v1.insertElementAt(100, 2);
		
//		System.out.println(v1.firstElement());
//		System.out.println(v1.lastElement());
		
		System.out.println(v1);
		v1.removeAllElements();
		System.out.println(v1);
		
		
		
		

	}

}
