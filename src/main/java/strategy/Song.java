package strategy;

public class Song {
	private String title;
	private double price;
	private DiscountPolicy discountMode;
	
	public String getTitle() {
		return title;
	}
	public Song(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public DiscountPolicy getDiscountMode() {
		return discountMode;
	}
	public void setDiscountMode(DiscountPolicy discountMode) {
		this.discountMode = discountMode;
	}
	
}
