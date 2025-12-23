package in05.stringjoiner;

import java.util.StringJoiner;

public class Example01 {
	
	public static void main(String[] args) {
		
		
		StringJoiner joiner=new StringJoiner("_","{","}");
		joiner.add("java");
		joiner.add("python");
		joiner.add(".net");
		joiner.add("java");
		joiner.add("python");
		joiner.add(".net");
		
		System.out.println(joiner);
	}

}
