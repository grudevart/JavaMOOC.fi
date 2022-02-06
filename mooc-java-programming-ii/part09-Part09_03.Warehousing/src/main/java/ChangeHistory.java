import java.util.ArrayList;

public class ChangeHistory {

	private ArrayList<Double> history;

	public ChangeHistory() {
		this.history = new ArrayList<Double>();
	}

	public void add(double status) {
		this.history.add(status);
	}

	public void clear() {
		this.history.clear();
	}

	public double maxValue() {
		double maxValue = 0.0;
		if (this.history.isEmpty()) {
			return 0.0;
		} else {
			for (Double value : history) {
				if (value > maxValue) {
					maxValue = value;
				}
			}
			return maxValue;
		}
	}

	public double minValue() {
		double minValue = this.history.get(0);
		if (this.history.isEmpty()) {
			return 0.0;
		} else {
			for (Double value : history) {
				if (value < minValue) {
					minValue = value;
				}
			}
			return minValue;
		}
	}

	public double average() {
		double average = 0.0;
		double sum = 0.0;
		if (this.history.isEmpty()) {
			return average;
		} else {
			for (double value : history) {
				sum += value;
			}
		}
		return average = sum / this.history.size();

	}

	@Override
	public String toString() {
		return this.history.toString();
	}
}
