package in.versionit.programs1;

public class Example2 {

	public static void main(String[] args) {

//		String name1="hari";
//		String name2="charan";
//		
//		String temp;
//		
//		temp=name1;
//		name1=name2;
//		name2=temp;
//		
//		System.out.println(name1);
//		System.out.println(name2);

		String name1 = "hari";
		String name2 = "charan";

		System.out.println("Before Swapping");
		System.out.println(name1);
		System.out.println(name2);

		// step-1: Combine both strings
		name1 = name1 + name2; // haricharan
		// step-2: Extract the first string by substring
		name2 = name1.substring(0, name1.length() - name2.length());
		// step-3: Extract the second string

		name1 = name1.substring(name2.length());

		System.out.println(name1);
		System.out.println(name2);

	}

}
