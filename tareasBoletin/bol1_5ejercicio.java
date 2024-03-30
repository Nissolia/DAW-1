package tareasBoletin;

import java.util.Scanner;

public class bol1_5ejercicio {

	public static void main(String[] args) {
		// BASE DE PIRÁMIDE DE 9 ASTERISCOS
		
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduzca numero de filas: ");
	        int filas = sc.nextInt();
	       
			// ALTURA DE LA PIRÁMIDE
	        for(int altura = 1; altura<=filas; altura++){
	            // ESPACIOS EN BLANCO
	            for(int espacio = 1; espacio <= filas-altura; espacio++){
	                System.out.print(" ");
	            }
	 
	            // ASTERISCO
	            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        sc.close();
	    
	}

}
