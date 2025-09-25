package in.thiruit;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		pattern1I();
		System.out.println("**********************");
		pattern1J();
		System.out.println("**********************");
		patterncharI();
		System.out.println("**********************");
		patterncharJ();
		System.out.println("**********************");
		patterncharStar();
	}

	private static void pattern1I() {
		System.out.println("for loop started");
		for (int i = 1; i <= 5; i++) {    //5*5
			
			for (int j = 1; j <= 5; j++) {   
				
				System.out.print(i);
				
			}
			System.out.println();
			
		}
	}
	
	
	private static void pattern1J() {
		System.out.println("for loop started");
		for (int i = 1; i <= 5; i++) {    //5*5
			
			for (int j = 1; j <= 5; j++) {   
				
				System.out.print(j);
				
			}
			System.out.println();
			
		}
	}
	
	
	
	private static void patterncharI() {
		System.out.println("for loop started");
		for (char i = 'a'; i <= 'd'; i++) { // 5*5

			for (char j = 'a'; j <= 'e'; j++) {

				System.out.print(i);

			}
			System.out.println();

		}
	}
	
	private static void patterncharJ() {
		int k=1;
		System.out.println("for loop started");
		for (char i = 'a'; i <= 'd'; i++) {    //4*5=20
			
			for (char j = 'a'; j <= 'e'; j++) {   
				
				System.out.print((k++)+"   ");
				
			}
			System.out.println();
			
		}
	}
	
	
	private static void patterncharStar() {
		int k=1;
		System.out.println("for loop started");
		for (char i = 'a'; i <= 'd'; i++) {    //4*5=20
			
			for (char j = 'a'; j <= 'e'; j++) {   
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
	
	
	

}
