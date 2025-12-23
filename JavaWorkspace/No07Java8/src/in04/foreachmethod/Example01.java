package in04.foreachmethod;

import java.util.ArrayList;
import java.util.List;

public class Example01 {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(5);
		
		list.forEach(s->System.out.println(s));
		
	}

}
