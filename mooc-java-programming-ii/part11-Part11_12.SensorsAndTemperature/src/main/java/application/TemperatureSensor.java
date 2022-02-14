package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
	
	private boolean state;
	
	public TemperatureSensor() {
		this.state = false;
	}

	@Override
	public boolean isOn() {
		if (state == true) {
			return  true;
		}
		return false;
	}

	@Override
	public void setOn() {
		state = true;	
	}

	@Override
	public void setOff() {
		state = false;
		
	}

	@Override
	public int read() {
		if (isOn()==false) {
			throw new IllegalStateException("Please turn on the sensor.");
		}
		Random random = new Random();
		return random.nextInt(61) - 30;
	}

}
