package systemdesign.parkinglot.model;

/** The type Employee account. */
public abstract class EmployeeAccount {

  /** The Username. */
  String username;

  /** The Password. */
  String password;

  /** The Status. */
  AccountStatus status;

  /** The Person. */
  Person person;

  /**
   * Is active boolean.
   *
   * @return the boolean
   */
  boolean isActive() {
		return status.equals(AccountStatus.ACTIVE);
	}
}

/** The type Parking attendant. */
class ParkingAttendant extends EmployeeAccount {
  /**
   * Process ticket.
   *
   * @param ticket the ticket
   */
  void processTicket(ParkingTicket ticket) {}
}

/** The type Admin. */
class Admin extends ParkingAttendant {}
