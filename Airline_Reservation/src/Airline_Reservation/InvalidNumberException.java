package Airline_Reservation;
public class InvalidNumberException extends Exception {
	
	/**
	 to remove warning
	 */
	private static final long serialVersionUID = -3099496423883991243L;

	InvalidNumberException(String msg){
		super(msg);
	}
}