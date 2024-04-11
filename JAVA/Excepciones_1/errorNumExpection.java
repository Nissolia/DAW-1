package Excepciones_1;

import java.util.InputMismatchException;

public class errorNumExpection extends InputMismatchException {
	/* no pueden ser ni inferiores a 0 ni un string obviamente */

	public errorNumExpection() {
	}

	public errorNumExpection(String message) {
		super(message);
	}
}
