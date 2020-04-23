package systemdesign.parkinglot.model;

public abstract class Vehicle {

	String liscenseNumber;

	VehicleType type;

	ParkingTicket ticket;

	public Vehicle(VehicleType type) {
		this.type = type;
	}

	void assignTicket(ParkingTicket ticket){
		this.ticket = ticket;
	}
}

class Car extends Vehicle {
	public Car() {
		super(VehicleType.CAR);
	}
}

class Motorcycle extends Vehicle {
	public Motorcycle() {
		super(VehicleType.CAR);
	}
}
