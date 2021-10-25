package Airline_Reservation;
public class InvalidPasswordException extends Exception {
	
	/**
	 to remove warning
	 */
	private static final long serialVersionUID = -3099496423883991243L;

	InvalidPasswordException(String msg){
		super(msg);
	}
}