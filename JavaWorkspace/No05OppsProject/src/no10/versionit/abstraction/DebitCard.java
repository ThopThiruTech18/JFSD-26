package no10.versionit.abstraction;

public class DebitCard implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment successfull by using DebitCard");

	}

}
