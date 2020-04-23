package systemdesign.parkinglot.model;

public abstract class ParkingSpot {
	String id;

	boolean free;

	ParkingSpotType type;

	Vehicle vehicle;

	public ParkingSpot(ParkingSpotType type) {
		this.type = type;
	}

	void allotVehicle(Vehicle vehicle){
		this.vehicle = vehicle;
	}

	void removeVehicle(){
		this.vehicle = null;
	}
}

class CompactSpot extends ParkingSpot {
	public CompactSpot() {
		super(ParkingSpotType.COMPACT);
	}
}

class MotorbikeSpot extends ParkingSpot {
	public MotorbikeSpot() {
		super(ParkingSpotType.MOTORBIKE);
	}
}
