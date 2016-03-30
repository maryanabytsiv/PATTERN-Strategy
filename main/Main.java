package main;

import additional.context.Gentlemen;
import additional.strategy.Cash;
import additional.strategy.CreditCard;
import additional.strategy.DebitCard;

public class Main {

	public static void main(String[] args) {

		Gentlemen person1 = new Gentlemen();
		Gentlemen person2 = new Gentlemen();
		Gentlemen person3 = new Gentlemen();

		person1.setPaymentStrategy(new DebitCard());
		person2.setPaymentStrategy(new Cash());
		person3.setPaymentStrategy(new CreditCard());

		person1.makePayment(15000);
		person2.makePayment(45);
		person3.makePayment(168);

		person2.setPaymentStrategy(new Cash());
		person2.makePayment(7589);



	}

}