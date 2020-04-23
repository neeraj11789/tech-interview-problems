package systemdesign.parkinglot.model;

import java.util.Map;
import java.util.UUID;

public class ParkingDisplayBoard {

	String id = UUID.randomUUID().toString();

	String message;

	public ParkingDisplayBoard() {
		this.message = "Welcome to the Parking Lot";
	}

	/**
	 *
	 * @param message
	 */
	public ParkingDisplayBoard(String message) {
		this.message = message;
	}

	/**
	 * Udpate Display
	 */
	public void updateDisplay(ParkingFloor floor){
		StringBuilder sb = new StringBuilder();
		sb.append(message);
		sb.append("Available Parking Slots for each category displayed below");

		// Max - Occuplied for each type of Spot
		for (Map.Entry<ParkingSpotType, Integer> m :floor.parkingSpotWithOccupancyCounter.entrySet()){
			sb.append(m.getKey().name() + ": " + (floor.parkingSpotTypeWithMaxLimit.get(m.getKey()) - m.getValue()));
		}
	}


}
