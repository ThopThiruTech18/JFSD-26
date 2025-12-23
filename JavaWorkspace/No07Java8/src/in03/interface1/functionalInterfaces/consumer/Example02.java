package in03.interface1.functionalInterfaces.consumer;

import java.util.function.Consumer;

public class Example02 {
	
	public static void main(String[] args) {
		
		Consumer<String> name= name1 -> System.out.println("Welcome to India : "+name1);
		name.accept("Charan");
	}

}
