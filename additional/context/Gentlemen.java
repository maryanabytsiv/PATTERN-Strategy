package additional.context;

import additional.strategy.PaymentStrategyI;

public class Gentlemen {

	private PaymentStrategyI paymentStrategy;

	public void setPaymentStrategy(PaymentStrategyI paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void makePayment(Integer amount){

		paymentStrategy.payOff(amount);
		System.out.println("-----------------------------");
	}

}
