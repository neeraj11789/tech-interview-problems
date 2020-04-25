package systemdesign.parkinglot.model;

import java.util.Map;

/** The type Parking floor. */
public class ParkingFloor {
  /** The Id. */
  String id;

  /** The Number. */
  int number;

  /** The Display board. */
  ParkingDisplayBoard displayBoard;

  /** Map with each type for SpotType and Max Count */
  Map<ParkingSpotType, Integer> parkingSpotTypeWithMaxLimit;

  /** Counter with each type of SpotType; */
  Map<ParkingSpotType, Integer> parkingSpotWithOccupancyCounter;

  /**
   * Instantiates a new Parking floor.
   *
   * @param number the number
   * @param parkingSpotTypeWithCounter the parking spot type with counter
   */
  public ParkingFloor(int number, Map<ParkingSpotType, Integer> parkingSpotTypeWithCounter) {
		this.number = number;
		this.parkingSpotTypeWithMaxLimit = parkingSpotTypeWithCounter;

		// Initializing the floor with each type of parking as 0
		for (ParkingSpotType type: ParkingSpotType.values()){
			parkingSpotWithOccupancyCounter.put(type, 0);
		}
		this.displayBoard = new ParkingDisplayBoard("Welcome to the Parking Lot: Floor number - " + number);
	}

  /**
   * Assign vehicle to spot.
   *
   * @param spot the spot
   * @param vehicle the vehicle
   */
  void assignVehicleToSpot(ParkingSpot spot, Vehicle vehicle) {
		if(parkingSpotWithOccupancyCounter.get(spot.type) > parkingSpotTypeWithMaxLimit.get(spot.type)){
            System.out.println(spot.type + " is FULL");
			displayBoard.updateDisplay(this);
		}else {
			spot.allotVehicle(vehicle);
			parkingSpotWithOccupancyCounter.put(spot.type,
					parkingSpotWithOccupancyCounter.getOrDefault(spot.type, 0) + 1);
			displayBoard.updateDisplay(this);
		}
	}

  /**
   * Remove vehicle from spot.
   *
   * @param spot the spot
   */
  void removeVehicleFromSpot(ParkingSpot spot) {
		spot.removeVehicle();
	}
}
