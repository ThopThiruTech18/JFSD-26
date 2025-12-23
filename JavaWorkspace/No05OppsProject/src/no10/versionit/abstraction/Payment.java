package no10.versionit.abstraction;

public interface Payment {

//	public Payment()
//	{
//		
//	}

	void pay();

	default void withdraw() {
        System.out.println("Payment :: withdraw()");
	}

	default void m1() {
         System.out.println("default::Payment :: m1()");
	}

	static void m2() {
		 System.out.println("static::Payment :: m2()");
	}

}
