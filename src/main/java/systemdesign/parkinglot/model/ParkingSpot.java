package systemdesign.parkinglot.model;

/** The type Parking spot. */
public abstract class ParkingSpot {
  /** The Id. */
  String id;

  /** The Free. */
  boolean free;

  /** The Type. */
  ParkingSpotType type;

  /** The Vehicle. */
  Vehicle vehicle;

  /**
   * Instantiates a new Parking spot.
   *
   * @param type the type
   */
  public ParkingSpot(ParkingSpotType type) {
		this.type = type;
	}

  /**
   * Allot vehicle.
   *
   * @param vehicle the vehicle
   */
  void allotVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

  /** Remove vehicle. */
  void removeVehicle() {
		this.vehicle = null;
	}
}

/** The type Compact spot. */
class CompactSpot extends ParkingSpot {
  /** Instantiates a new Compact spot. */
  public CompactSpot() {
		super(ParkingSpotType.COMPACT);
	}
}

/** The type Motorbike spot. */
class MotorbikeSpot extends ParkingSpot {
  /** Instantiates a new Motorbike spot. */
  public MotorbikeSpot() {
		super(ParkingSpotType.MOTORBIKE);
	}
}
