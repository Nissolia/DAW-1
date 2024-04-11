package Excepciones_2;

public class CarritoVacioException extends RuntimeException {
	public CarritoVacioException() {
	}
	
	public CarritoVacioException(String message) {
		super(message);
	}
}
