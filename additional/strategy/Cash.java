package additional.strategy;

public class Cash implements PaymentStrategyI {

	@Override
	public void payOff(Integer amount) {
		System.out.println("From cash goes " + amount);
	}

}
