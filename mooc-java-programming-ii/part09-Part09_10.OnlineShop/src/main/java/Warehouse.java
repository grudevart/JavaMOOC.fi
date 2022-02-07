import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

	private Map<String, Integer> productPriceList;
	private Map<String, Integer> productStockList;

	public Warehouse() {
		this.productPriceList = new HashMap<String, Integer>();
		this.productStockList = new HashMap<String, Integer>();

	}

	public void addProduct(String product, int price, int stock) {
		productPriceList.put(product, price);
		productStockList.put(product, stock);
	}

	public int price(String product) {
		return this.productPriceList.getOrDefault(product, -99);
	}

	public int stock(String product) {
		return this.productStockList.getOrDefault(product, 0);
	}

	public boolean take(String product) {
		int stock = productStockList.getOrDefault(product, 0);
		if (stock == 0) {
			return false;
		}
		productStockList.put(product, stock-1);
		return true;
	}

	public Set<String> products() {
		return this.productPriceList.keySet();
	}

}
