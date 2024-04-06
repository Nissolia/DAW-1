package tareasBoletin;

import java.util.Scanner;

/* PROGRAMA QUE CALCULE EL VOLUMEN
 * DE UN CONO SEGÚN LA FÓRMULA, NO VALE R*R */
public class bol1_9ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* TECLADO */
		Scanner teclado = new Scanner(System.in);
		/* DECLARACIÓN DE VARIABLES */
		double r,h=0;
		double pi = Math.PI;
		double V=0;
		/* PEDIR VALORES POR TECLADO */
		System.out.println("Dime el valor de r y de h y te daré la fórmula resuelta.");
		System.out.println("Valor de r:");
		/* PEDIMOS VALORES */
		r = teclado.nextInt();
		System.out.println("Valor de h:");
		h = teclado.nextInt();
		
		
	    V = (1.0/3.0) * pi * Math.pow(r, 2) * h;
	    System.out.println(V);
		/* PARA QUE DEJE DE TOMAR COSAS POR PANTALLA */
		teclado.close();
	}

}
