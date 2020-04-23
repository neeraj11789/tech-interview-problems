package systemdesign.parkinglot.model;

import java.time.LocalDateTime;

public class ParkingTicket {

	String id;

	LocalDateTime entranceTime;

	LocalDateTime exitTime;

	Double charges;

	ParkingTicketStatus status;
}
