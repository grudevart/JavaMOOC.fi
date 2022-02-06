import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	private Map<String, Item> itemsListInChart;

	public ShoppingCart() {
		this.itemsListInChart = new HashMap<String, Item>();
	}

	public void add(String product, int price) {
		if (itemsListInChart.containsKey(product)) {
			itemsListInChart.get(product).increaseQuantity();
		} else {
			itemsListInChart.put(product, new Item(product, 1, price));
		}
	}

	public int price() {
		int sum = 0;
		for (Item item : itemsListInChart.values()) {
			sum = sum + item.price();
		}
		return sum;
	}

	public void print() {
		for (Item item : itemsListInChart.values()) {
			System.out.println(item.toString());
		}
	}

}
