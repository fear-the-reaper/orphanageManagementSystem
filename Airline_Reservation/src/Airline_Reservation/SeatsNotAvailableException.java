package Airline_Reservation;
public class SeatsNotAvailableException extends Exception {
	
	/**
	 to remove warning
	 */
	private static final long serialVersionUID = -3099496423883991243L;

	SeatsNotAvailableException(String msg){
		super(msg);
	}
}