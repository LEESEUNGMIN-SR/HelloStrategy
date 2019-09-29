package strategy;

public class main {

	public static void main(String[] args) {
		Song s1 = new Song("BTS fire");
		s1.setPrice(2000);
		s1.setDiscountMode(new TodayEvent());
		
		Song s2 = new Song("EXO song");
		s2.setPrice(1000);
		s2.setDiscountMode(new OnSale());
		
		Song s3 = new Song("CYP bounce");
		s3.setPrice(1000);
		s3.setDiscountMode(new TodayEvent());
		
		CartForSongs cart1 = new CartForSongs();
		cart1.addSong(s1);
		cart1.addSong(s2);
		cart1.addSong(s3);
		
		s3.setDiscountMode(new CristmasEvent());
		System.out.println(cart1.totalPrice());
	}

}
