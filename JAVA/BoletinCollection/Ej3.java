package BoletinCollection;

import java.util.TreeSet;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * Implementa una aplicación donde se inserten 20 números enteros aleatorios
		 * distintos, menos que 100, en una colección. Deberán guardarse por orden
		 * decrecioente a medida que se vayan generando y se mostrará la colección
		 * resultante por pantalla.
		 */

		TreeSet<Integer> num = new TreeSet<>(); // se ordena auto y no se pueden poner objetos iguales
		// comprobamos
		do {
			// usamos el size para comprobar que tiene el tamaño que queremos
			num.add((int) (Math.random() * 100));
		} while (num.size() < 20);
		
		
		// lo usamos para ver lo que esta guardado en el set
		for (int guardado : num) {
			System.out.print(guardado + " ");
		}
	}// finalizacion main

}// fin clase


/*
 ORDENAR UN HASSET
 import java.util.HashSet;
import java.util.TreeSet;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		HashSet<Integer> num = new HashSet<>(); // se ordena auto y no se pueden poner objetos iguales
		// comprobamos
		do {
			// usamos el size para comprobar que tiene el tamaño que queremos
			num.add((int) (Math.random() * 100));
		} while (num.size() < 20);
		
		
		TreeSet<Integer> num2 = new TreeSet<>(num);
		
		// lo usamos para ver lo que esta guardado en el set
		for (int guardado : num2) {
			System.out.print(guardado + " ");
		}
	}// finalizacion main

}// fin clase
 */