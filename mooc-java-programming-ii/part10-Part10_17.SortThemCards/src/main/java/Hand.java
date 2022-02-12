import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hand implements Comparable<Hand> {

	private ArrayList<Card> cards;
	
	public Hand() {
		this.cards = new ArrayList<Card>();
	}
	
	public void add(Card card) {
		cards.add(card);
	}
	
	public void sort() {
		this.cards.sort((o1, o2) -> o1.compareTo(o2));
	}
	
	public void sortBySuit() {
		this.cards.sort(new BySuitInValueOrder());
	}
	
	public void print() {
		cards.stream().forEach(card -> System.out.println(card));
	}

	@Override
	public int compareTo(Hand o) {
		int sum1 = this.cards.stream().mapToInt(card -> card.getValue()).sum();
		int sum2 = o.cards.stream().mapToInt(card -> card.getValue()).sum();
		
		return sum1 - sum2;
	}
}
