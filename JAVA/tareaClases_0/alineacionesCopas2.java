package tareaClases_0;

import java.util.Scanner;

/**************************/
/* HECHO POR @NOELIA BAÑOS*/
/**************************/

public class alineacionesCopas2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
			// EMPEZAMOS PROGRAMA
		System.out.print("Dime la frase que quieras: ");
		String frase = teclado.nextLine();
		// VER LARGURA DEL TEXTO
		int contador = 0;
		// STRING EN EL QUE TENEMOS EN CUENTA VOCALES MAYUSCULAS Y MINUSCULAS
		String vocales = "aeiouAEIOU";
			// SE MIRA EL TAMAÑO QUE TIENE LA LARGURA DEL TECTO
		for (int i = 0; i < frase.length(); i++) {
			// USAMOS EL CHARAT PARA IR UNO POR UNO Y PASARLO DE UN LUGAR A OTRO
			char caracter = frase.charAt(i);
			if (vocales.indexOf(caracter) != -1) { // ??
				contador++;
			}
		}
		String fraseModificada = frase.replace('a', 'e').replace('A', 'E');
			// MOSTRAR
		System.out.println("Frase original: " + frase);
		System.out.println("Número de vocales: " + contador);
		System.out.println("Frase modificada: " + fraseModificada);

		// CERRAR TECLADO
		teclado.close();
	}

}
