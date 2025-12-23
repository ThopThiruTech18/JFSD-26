package in03.interface1.functionalInterfaces;

import java.util.function.Predicate;

public class No04MyInterface {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> p= age -> age >= 18;
		
		
		if(p.test(17))
		{
			System.out.println("Your eligible for the voting");
		}
		else
		{
			System.out.println("Your not eligible for the voting");
		}
		
		
		
	}

	

}
