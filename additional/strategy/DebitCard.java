package additional.strategy;

public class DebitCard implements PaymentStrategyI {

	@Override
	public void payOff(Integer amount) {
		System.out.println("From debit card goes " + amount);
	}

}
