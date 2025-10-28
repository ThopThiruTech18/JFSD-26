package in.versionit;
public class Example2 {
	
	public static void main(String[] args) {
		
		String name1="Charan";
		String name2="CharaN";
		String name3="";
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.length());
		
		boolean empty = name1.isEmpty();
		boolean empty2 = name3.isEmpty();
		System.out.println(empty);
		System.out.println(empty2);
		
		
		boolean blank = name1.isBlank();
		boolean blank2 = name3.isBlank();
		System.out.println(blank);
		System.out.println(blank2);
		
		int compareTo1 = "abc".compareTo("bcd");
		int compareTo2 = "123".compareTo("123");
		System.out.println(compareTo1);
		System.out.println(compareTo2);
		
		String name="Vekatesh";
		System.out.println(name.substring(3));
		System.out.println(name.substring(2, 7));//startingindex, endindex-1
		
		
		
		
	
	
		
	}

}
