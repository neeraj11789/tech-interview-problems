package systemdesign.parkinglot.model;

/** The type Vehicle. */
public abstract class Vehicle {

  /** The Liscense number. */
  String liscenseNumber;

  /** The Type. */
  VehicleType type;

  /** The Ticket. */
  ParkingTicket ticket;

  /**
   * Instantiates a new Vehicle.
   *
   * @param type the type
   */
  public Vehicle(VehicleType type) {
		this.type = type;
	}

  /**
   * Assign ticket.
   *
   * @param ticket the ticket
   */
  void assignTicket(ParkingTicket ticket) {
		this.ticket = ticket;
	}
}

/** The type Car. */
class Car extends Vehicle {
  /** Instantiates a new Car. */
  public Car() {
		super(VehicleType.CAR);
	}
}

/** The type Motorcycle. */
class Motorcycle extends Vehicle {
  /** Instantiates a new Motorcycle. */
  public Motorcycle() {
		super(VehicleType.CAR);
	}
}
