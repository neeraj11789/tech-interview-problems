package systemdesign.parkinglot.model;

import java.time.LocalDateTime;

/** The type Parking ticket. */
public class ParkingTicket {

  /** The Id. */
  String id;

  /** The Entrance time. */
  LocalDateTime entranceTime;

  /** The Exit time. */
  LocalDateTime exitTime;

  /** The Charges. */
  Double charges;

  /** The Status. */
  ParkingTicketStatus status;
}
