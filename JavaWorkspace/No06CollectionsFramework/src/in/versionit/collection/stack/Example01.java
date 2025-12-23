package in.versionit.collection.stack;

import java.util.Stack;

public class Example01 {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack1=new Stack<>();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);
		stack1.push(1);
		
		System.out.println(stack1.search(10));
		System.out.println(stack1.search(1));
		
	}

}
