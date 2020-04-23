package systemdesign.parkinglot.model;

public abstract class EmployeeAccount {

	String username;

	String password;

	AccountStatus status;

	Person person;

	boolean isActive(){
		return status.equals(AccountStatus.ACTIVE);
	}
}

class ParkingAttendant extends EmployeeAccount{
	void processTicket(ParkingTicket ticket){

	}
}

class Admin extends ParkingAttendant{

}
