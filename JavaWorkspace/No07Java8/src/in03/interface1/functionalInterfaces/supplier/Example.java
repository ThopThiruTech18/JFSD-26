package in03.interface1.functionalInterfaces.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Example {
	
	public static void main(String[] args) {
		
		Supplier<String> sup=()->"Welcome to the India";
		System.out.println(sup.get());
		
		Supplier<LocalDateTime> dateAndTime=()->LocalDateTime.now();
		System.out.println(dateAndTime.get());
		
		
		Supplier<Integer> otp=()->(int)(Math.random()*1000000);
		System.out.println(otp.get());
		
		
		
	}

}
