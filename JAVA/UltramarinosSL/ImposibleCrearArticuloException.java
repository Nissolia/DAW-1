package UltramarinosSL;

public class ImposibleCrearArticuloException extends RuntimeException {
	ImposibleCrearArticuloException(String texto){
		System.out.println(texto);
	}
	ImposibleCrearArticuloException(){
		getMessage();
	}
}
