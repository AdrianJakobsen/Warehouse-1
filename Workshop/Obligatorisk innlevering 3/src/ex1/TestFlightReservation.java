package ex1;


public class TestFlightReservation {

	public static void main(String[] args) {
		FlightReservation plane = new FlightReservation();
		boolean exit =false;
		plane.show();
		do{
			int row =plane.inputedRow();
			char seat =plane.inputedSeat();
			plane.assignSeat(row, seat);
			plane.prosentBookedSeats();
			plane.show();
		}
		while(exit!=true);

	}

}

