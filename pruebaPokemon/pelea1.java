package pruebaPokemon;

import java.util.Scanner;

/* Desarrolla un programa que escriba los números del M al N. */
public class pelea1 {

	public static void main(String[] args) { // TODO Auto-generated method stub
		/* TECLADO */
		Scanner teclado = new Scanner(System.in);
		/* DECLARACIÓN DE VARIABLES */
		Boolean aux = true;
		int num1, num2;
		/* AÑADIR LOS NUMEROS POR TECLADO */
		System.out.println("Ingresa el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		num2 = teclado.nextInt();
		/* PARA QUE DEJE DE TOMAR COSAS POR PANTALLA */
		teclado.close();
		/* ENSEÑANDO QUE NUMEROS SALEN EN PANTALLA */
		System.out.println("Vamos a ver los numeros del " + num1 + " al " + num2);
		/* BUCLE PARA VER LOS NUMEROS */
		do {
			System.out.print(num1 + "  ");

			num1++;
			if (num1 > num2) {
				aux = false;
			}

		} while (aux);
	}

}
