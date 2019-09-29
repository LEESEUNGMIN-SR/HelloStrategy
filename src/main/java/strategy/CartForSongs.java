package strategy;

import java.util.List;
import java.util.ArrayList;

public class CartForSongs {
	private List<Song> songs = new ArrayList<Song>();
	
	public void addSong(Song s) {
		songs.add(s);
	}
	
	public double totalPrice() {
		double result = 0.0;
		for(Song s : songs) {
			DiscountPolicy d = s.getDiscountMode();
			result += d.getDiscountedPrice(s.getPrice());
		}
		return result;
	}
}
