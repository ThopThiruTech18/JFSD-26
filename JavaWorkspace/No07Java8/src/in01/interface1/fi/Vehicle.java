package in01.interface1.fi;

public interface Vehicle {
	
	void start();  //abstract methods
	void engine(); //abstract methods
	
	default void stop()  //non-abstract methods or concrete method
	{
		System.out.println("Vehicle : stop : default");
	}
	
	static void wheels()//non-abstract methods or concrete method
	{
		System.out.println("Vehicle : wheels : static");
	}

}
