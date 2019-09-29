package strategy;

public class CristmasEvent extends DiscountPolicy {

	public CristmasEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDiscountedPrice(double price) {
		
		return price*0.5;
	}

}
