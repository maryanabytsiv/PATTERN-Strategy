package additional.strategy;

public class CreditCard implements PaymentStrategyI {

	@Override
	public void payOff(Integer amount) {
		System.out.println("From credit card goes " + amount);
	}

}
