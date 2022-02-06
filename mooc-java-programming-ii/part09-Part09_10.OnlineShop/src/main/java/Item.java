import java.util.HashMap;
import java.util.Map;

public class Item {
	
	private Map<String, Integer> itemListQuantity;
	private Map<String, Integer> itemListUnitPrice;
	
	public Item(String product, int qty, int unitPrice) {
		this.itemListQuantity = new HashMap<String, Integer>();
		this.itemListUnitPrice = new HashMap<String, Integer>();
		this.itemListQuantity.put(product, qty);
		this.itemListUnitPrice.put(product, unitPrice);
	}
	
	public int price() {
		int price = 0;
		for(String item : itemListQuantity.keySet()) {
			price = itemListQuantity.get(item) * itemListUnitPrice.get(item);
		}
		return price;
	}
	
	public void increaseQuantity() {
		int quantityToIncrase = 0;
		for(String item : itemListQuantity.keySet()) {
			quantityToIncrase = itemListQuantity.get(item);
			quantityToIncrase++;
			itemListQuantity.put(item, quantityToIncrase);
		}
		
		
	}
	
	@Override
	public String toString() {
		String toPrint = "";
		for(String item : itemListQuantity.keySet()) {
			toPrint = item + ": " + itemListQuantity.get(item);
		}
		return toPrint;
	}
	
	

}
