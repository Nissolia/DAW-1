package pruebaPokemon;

import java.util.Scanner;

/* Desarrolla una aplicación que vaya leyendo números de teclado mientras
 * el número introducido sea par; el programa parará cuando se introduzca un número impar. */
public class pelea3 {

	public static void main(String[] args) {
		/* TECLADO */
		Scanner teclado = new Scanner(System.in);
		/* DECLARACIÓN DE VARIABLES */
		int numero;
		/** EMPEZAR PROGRAMA **/
		do {
			/* AÑADIR NUMERO POR TECLADO */
			System.out.print("Introduce el numero, si es par el programa sigue corriendo: ");
			numero = teclado.nextInt();
		} while ((numero % 2) == 0);
		/* PARA QUE DEJE DE TOMAR COSAS POR TECLADO */
		teclado.close();
		System.out.println("Programa finalizado. . .");
		/* FIN PROGRAMA */
	}

}
