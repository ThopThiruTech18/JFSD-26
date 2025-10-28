package in.versionit.programs;

public class Example5 {

	public static void main(String[] args) {

		// Reverse of a String
		String name = "hello"; // lenth=5-1=4
		// 01234

		
		StringBuffer buffer=new StringBuffer(name);
		StringBuffer reverse = buffer.reverse();
		System.out.println(reverse);
		
		
		StringBuilder builder=new StringBuilder(name);
		StringBuilder reversebuilder = builder.reverse();
		System.out.println(reversebuilder);

	}

}
