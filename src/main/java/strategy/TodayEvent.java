package strategy;

public class TodayEvent extends DiscountPolicy {
	public double getDiscountedPrice(double price) {
		return price*0.7;
	}
}
