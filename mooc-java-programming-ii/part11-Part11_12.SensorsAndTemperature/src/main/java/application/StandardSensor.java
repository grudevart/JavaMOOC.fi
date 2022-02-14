package application;

public class StandardSensor implements Sensor {
	
	private int toReturn;
	
	public StandardSensor(int toReturn) {
		this.toReturn = toReturn;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public void setOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int read() {
		return toReturn;
	}

}
