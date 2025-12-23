package no10.versionit.abstraction;

public class CreditCard implements Payment {

//	@Override
//	public void withdraw() {
//
//		System.out.println("CreditCard :: withdraw()");
//
//	}

	@Override
	public void m1() {
		System.out.println("CreditCard :: m1()");
	}

	@Override
	public void pay() {
		System.out.println("Payment successfull by using CreditCard");

	}

}
