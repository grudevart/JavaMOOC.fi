package application;

import java.nio.channels.IllegalSelectorException;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
	
	private ArrayList<Sensor> listOfSensors;
	private ArrayList<Integer> readings;
	
	public AverageSensor() {
		this.listOfSensors = new ArrayList<Sensor>();
		this.readings = new ArrayList<Integer>();
	}
	
	public void addSensor(Sensor toAdd) {
		listOfSensors.add(toAdd);
	}
	public List<Integer> readings() {
		return readings;
	}

	@Override
	public boolean isOn() {
		for(Sensor sensor : listOfSensors) {
			if(sensor.isOn()==false) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void setOn() {
		listOfSensors.stream().forEach(s -> s.setOn());
	}

	@Override
	public void setOff() {
		listOfSensors.stream().forEach(s -> s.setOff());	
	}

	@Override
	public int read() {
		if(isOn()==false) {
			throw new IllegalStateException("Please turn on sensors.");
		}
		if(listOfSensors.isEmpty()) {
			throw new IllegalStateException("Please add atleast one sensor.");
		}
		int reading;
		reading =  (int) listOfSensors.stream().map(s -> s.read()).mapToInt(Integer::intValue).average().getAsDouble();
		readings.add(reading);
		return reading;
	}

	
}
