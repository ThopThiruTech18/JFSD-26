package in.versionit;
public class Example3 {
	
	public static void main(String[] args) {
		
		
		
//		1. Length and Check Methods
//		----------------------------
//		- length(): "hello".length() → 5
//		- isEmpty(): "".isEmpty() → true
//		- isBlank(): "  ".isBlank() → true (Java 11+)
		
		System.out.println("hello".length());
		
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println("hello".isEmpty());
		
		System.out.println("            ".isBlank());
		System.out.println("".isBlank());
		
		
//		2. Character Access
//		--------------------
//		- charAt(int): "hello".charAt(1) → 'e'
		
		String name="hello";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
//		System.out.println(name.charAt(5));
		
		
//		3. Comparison
//		--------------  
//		- equals(String): "abc".equals("abc") → true
//		- equalsIgnoreCase(String): "AbC".equalsIgnoreCase("abc") → true
//		- compareTo(String): "abc".compareTo("bcd") → -1
		
		System.out.println("abc".equals("abc"));//true
		System.out.println("AbC".equalsIgnoreCase("abc"));//true
		System.out.println("abc".compareTo("bcd"));//-1
		System.out.println("abc".compareTo("abc"));//0
		
		
//		4. Substring and Slicing
//		-------------------------
//		- substring(int): "hello".substring(2) → "llo"
//		- substring(int, int): "hello".substring(1, 4-1) → "ell"
		
		System.out.println("hello world".substring(1));
		System.out.println("hello world".substring(5));
		System.out.println("hello world".substring(2));
		System.out.println("hello world".substring(8));
		
		System.out.println("hello".substring(1, 4));//(startinde,endindex-1)
		
		
//		5. Searching
//		-------------
//		- indexOf(String): "hellllllo".indexOf("l") → 2
//		- lastIndexOf(String): "hello".lastIndexOf("l") → 3
//		- contains(CharSequence): "hello".contains("ll") → true
//		- startsWith(String): "hello".startsWith("he") → true
//		- endsWith(String): "hello".endsWith("lo") → true
		
		System.out.println("he54354llllllo".indexOf("l"));
		System.out.println("he54354llllllo".lastIndexOf("l"));
		System.out.println("hello".contains("ll"));
		System.out.println("hello".startsWith("he"));
		System.out.println("hello".endsWith("lo"));
	
	
		
	}

}
