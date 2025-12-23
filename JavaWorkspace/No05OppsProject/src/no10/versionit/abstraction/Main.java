package no10.versionit.abstraction;

public class Main {

	public static void main(String[] args) {

		Payment creditCard = new CreditCard();
		Payment debitCard = new DebitCard();
		Payment upiPayment = new UpiPayment();

		creditCard.pay();
		debitCard.pay();
		upiPayment.pay();

		creditCard.m1();
		creditCard.withdraw();
		
		Payment.m2();

	}

}
