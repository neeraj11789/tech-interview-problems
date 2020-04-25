package systemdesign.parkinglot.model;

import java.util.Map;
import java.util.UUID;

/** The type Parking display board. */
public class ParkingDisplayBoard {

  /** The Id. */
  String id = UUID.randomUUID().toString();

  /** The Message. */
  String message;

  /** Instantiates a new Parking display board. */
  public ParkingDisplayBoard() {
		this.message = "Welcome to the Parking Lot";
	}

  /**
   * Instantiates a new Parking display board.
   *
   * @param message the message
   */
  public ParkingDisplayBoard(String message) {
		this.message = message;
	}

  /**
   * Udpate Display
   *
   * @param floor the floor
   */
  public void updateDisplay(ParkingFloor floor) {
		StringBuilder sb = new StringBuilder();
		sb.append(message);
		sb.append("Available Parking Slots for each category displayed below");

		// Max - Occuplied for each type of Spot
		for (Map.Entry<ParkingSpotType, Integer> m :floor.parkingSpotWithOccupancyCounter.entrySet()){
			sb.append(m.getKey().name() + ": " + (floor.parkingSpotTypeWithMaxLimit.get(m.getKey()) - m.getValue()));
		}
	}


}
