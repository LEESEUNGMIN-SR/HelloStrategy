package strategy;

public class OnSale extends DiscountPolicy {

	public OnSale() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDiscountedPrice(double price) {
		price*=0.9;
		return price;
	}

}
