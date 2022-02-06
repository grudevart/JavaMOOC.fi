import java.beans.VetoableChangeListener;
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

	private HashMap<LicensePlate, String> registry;

	public VehicleRegistry() {
		this.registry = new HashMap<LicensePlate, String>();
	}

	public boolean add(LicensePlate licensePlate, String owner) {
		if (this.registry.containsKey(licensePlate)) {
			return false;
		} else {
			registry.put(licensePlate, owner);
			return true;
		}
	}

	public String get(LicensePlate licensePlate) {
			return this.registry.getOrDefault(licensePlate, null);
	}

	public boolean remove(LicensePlate licensePlate) {
		if (this.registry.containsKey(licensePlate)) {
			this.registry.remove(licensePlate);
			return true;
		} else {
			return false;
		}
	}
	
	public void printLicensePlates() {
		for(LicensePlate plates : this.registry.keySet()) { 
			System.out.println(plates.toString());
		}
	}
	
	public void printOwners() {
		ArrayList<String> names = new ArrayList<String>();
		for(LicensePlate lic : this.registry.keySet()) {
			if(names.contains(this.registry.get(lic))){
				continue;
			}
		names.add(this.registry.get(lic));
		System.out.println(this.registry.get(lic));
	}

}
}
