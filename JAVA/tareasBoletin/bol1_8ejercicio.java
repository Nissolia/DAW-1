package tareasBoletin;

import java.util.Scanner;

/* CALCULADORA, 4 FUNCIONES BASICAS */

public class bol1_8ejercicio {

	public static void main(String[] args) { // TODO Auto-generated method stub

		/* TECLADO */
		Scanner teclado = new Scanner(System.in);
		/* DECLARACIÓN DE VARIABLES */
		int num1, num2;
		char elecc;
		do {
			/* ELEGIR QUE HACER */
			System.out.println("Que quieres hacer?");
			System.out.println("sumar : s | restar : r | multiplicar : m | dividir : d | salir : x");
			/*
			 * EL NEXT LINE SE USA Y EL CHARAT SOLO COGE EL QUE SEA NECESARIO, EN ESTE CASO
			 * LA PRIMERA POSICIÓN
			 */
			elecc = teclado.next().charAt(0);
			
			if (elecc == 'x') {
				System.out.println("Hasta nunqui");
			} else {
				/* INTRODUCIR LOS NUMEROS */
				System.out.println("Escribe el primer numero");
				num1 = teclado.nextInt();
				System.out.println("Escribe el segundo numero");
				num2 = teclado.nextInt();
				/* CALCULOS */
				switch (elecc) {
				case 's':
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					break;
				case 'r':
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
					break;

				case 'm':
					System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
					break;
				case 'd':
					System.out.println(num1 + " % " + num2 + " = " + ((double)num1 / num2));
					break;
				default:
					System.out.println("Ninguna respuesta de las escritas, buena esa");
				}
			}

		} while (elecc != 'x');
		/* PARA QUE DEJE DE TOMAR COSAS POR PANTALLA */
		teclado.close();
	}
}
