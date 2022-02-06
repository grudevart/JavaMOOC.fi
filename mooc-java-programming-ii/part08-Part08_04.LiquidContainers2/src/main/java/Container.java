
public class Container {

	private int amount;

	public Container() {
		this.amount = 0 ;
	}

	public int contains() {
		return this.amount;
	}

	public void setAmount(int amount)	{
		this.amount = amount;
	}

	public void add(int amountToAdd) {
		if (this.amount + amountToAdd > 100) {
			this.amount = 100;
		} else if (amountToAdd < 0) {
			return;
		} else {
			this.amount += amountToAdd;
		}
	}


	public String toString() {
		return this.amount + "/100";
	}

	public void remove(int amountToRemove) {
		this.amount -=amountToRemove;
		if(this.amount<0) {
			this.amount = 0;
		}
		
	}
}
