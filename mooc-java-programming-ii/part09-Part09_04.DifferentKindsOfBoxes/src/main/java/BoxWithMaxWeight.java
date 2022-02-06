import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

	private ArrayList<Item> itemsInBox;
	private int capacity;

	public BoxWithMaxWeight(int capacity) {
		this.capacity = capacity;
		this.itemsInBox = new ArrayList<Item>();
	}

	@Override
	public void add(Item item) {
		if (this.capacity - item.getWeight() < 0) {
			return;
		} else {
			itemsInBox.add(item);
			this.capacity -= item.getWeight();
		}

	}

	@Override
	public boolean isInBox(Item item) {
		if (itemsInBox.contains(item)) {
			return true;
		} else {
			return false;
		}
	}

}
