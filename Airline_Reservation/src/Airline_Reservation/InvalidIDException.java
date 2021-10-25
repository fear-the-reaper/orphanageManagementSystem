package Airline_Reservation;
public class InvalidIDException extends Exception {
	
	/**
	 to remove warning
	 */
	private static final long serialVersionUID = -3099496423883991243L;

	InvalidIDException(String msg){
		super(msg);
	}
}