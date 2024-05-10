package Interfaces_ej8;

import java.util.ArrayList;
import java.util.Collections;

public class NumEnteros {
	/*
	 * Insertar en una lista 20 enteros aleatorios entre 1 y 10. A partir de ella,
	 * crear un conjunto con los elementos de la lista sin repetir, otro con los
	 * repetidos y otro con los elementos que aparecen una sola vez en la lista
	 * original. Lista de los no repetidos Lista de los repetidos Lista de los
	 * repetidos pero solo de un numero
	 */
	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();
		// programa
		for (int i = 0; i < 20; i++) { // añadimos a la lista los randoms
			lista.add((int) (Math.random() * 11));
		}
		System.out.println("Elementos de la lista sin modificar: ");
		for (Integer integer : lista) {
			System.out.print(integer + " ");
		}
		System.out.println("\n_________________________________________\n");

		Collections.sort(lista);

		System.out.println("Elementos de la lista ordenados: ");
		for (Integer integer : lista) {
			System.out.print(integer + " ");
		}
		System.out.println("\n_________________________________________\n");
		// Lista de los no repetidos
		ArrayList<Integer> listaNoRepe = new ArrayList<>();
		ArrayList<Integer> listaRepe = new ArrayList<>();
		ArrayList<Integer> listaNoRepeUnNum = new ArrayList<>();
		// empezamos con las listas
		int aux = -1;
		// hay que buscar una forma de que los elementos no se repitan anteriormente
		for (Integer integer : lista) {
			if (aux == integer) {
				listaRepe.add(integer);// añadimos si se parece al anterior
				aux = integer;
			} else if (aux != integer) {
				// comprobación de que en la lista no tenemos los repetidos
				listaNoRepe.add(integer);// añadimos los que no se repiten
				aux = integer;
			} else {
				System.out.println("Vaya liada");
			}
		}
		// frecuency collections
		
		// imprimimos
		System.out.println("Elementos de los números sin repetir: ");
		for (Integer integer : listaNoRepe) {
			System.out.print(integer + " ");
		} // se podría hacer de comparar dentro de dos fo each para que los que tienen
			// repeticion comprobar si hay otro en los de sin repetir - el problema de aquí
			// es como comparar sin repetir la lista
		System.out.println("\n_________________________________________\n");
		System.out.println("Elementos de los números con repetición: ");
		for (Integer integer : listaRepe) {
			System.out.print(integer + " ");
		}
	}
}