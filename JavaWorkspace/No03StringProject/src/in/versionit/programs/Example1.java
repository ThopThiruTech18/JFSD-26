package in.versionit.programs;

public class Example1 {

	public static void main(String[] args) {

		// charAt
		// toCharArray

		// By using charAt Method
//		String name = "hello"; // lenth=5-1=4
//		for (int i = 0; i < name.length(); i++) {
//			
//			System.out.println(name.charAt(i));
//			
//		}

//		String name = "hello";
//		
//		char[] charArray = name.toCharArray();
//		
//		for (int i = 0; i < charArray.length; i++) {
//			
//			System.out.println(charArray[i]);
//			
//		}

//		String name = "hello";
//					// 01234
//
//		for (int i = name.length() - 1; i >=0 ; i--) {
//			System.out.print(name.charAt(i));
//		}

		String name = "hello";
					// 01234
		
//		char[] charArray = name.toCharArray();
//
//		for (int i = name.length() - 1; i >= 0; i--) {
//			System.out.print(charArray[i]);
//		}
		
		
		
		int start=name.length() - 1;
		int end=0;
		
		while(start>=end)
		{
			
			System.out.println(name.charAt(start));
			
			start--;
		}
		
		
		
		
		

	}

}
