package Excepciones_2;

public class ProductoNoEncontradoException extends RuntimeException {
	public ProductoNoEncontradoException() {
	}
	
	public ProductoNoEncontradoException(String message) {
		super(message);
	}
}
