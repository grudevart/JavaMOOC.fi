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
		if (productPriceList.isEmpty() || !productPriceList.containsKey(product)) {
			return -99;
		}
		return productPriceList.get(product);
	}

	public int stock(String product) {
		if (productStockList.isEmpty() || !productStockList.containsKey(product)) {
			return 0;
		}
		return productStockList.get(product);
	}

	public boolean take(String product) {
		int stock = productStockList.getOrDefault(product, 0);
		if (stock == 0) {
			return false;
		}
		stock--;
		productStockList.put(product, stock);
		return true;
	}

	public Set<String> products() {
		Set<String> products = productPriceList.keySet();
		return products;
	}

}
