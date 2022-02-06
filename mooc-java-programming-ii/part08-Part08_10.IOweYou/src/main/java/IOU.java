import java.util.HashMap;

public class IOU {
	
	private HashMap<String, Double> debt;
	
	public IOU() {
		this.debt = new HashMap<String, Double>();		
	}

	public void setSum(String string, double amount) {
		this.debt.put(string, amount);	
	}

	public double howMuchDoIOweTo(String string) {
		return this.debt.getOrDefault(string, (double) 0);
	}

}
