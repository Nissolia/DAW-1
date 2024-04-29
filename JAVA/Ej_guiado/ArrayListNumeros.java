package Ej_guiado;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumeros {

	public static void main(String[] args) {

		/*
		 * Programa Java que lea una serie de valores numéricos enteros desde el teclado
		 * y los guarde en un ArrayList de tipo Integer. La lectura de números enteros
		 * termina cuando se introduzca el valor -99. Este valor no se guarda en el
		 * ArrayList. A continuación el programa mostrará por pantalla el número de
		 * valores que se han leído, su suma y su media. Por último se mostrarán todos
		 * los valores leídos, indicando cuántos de ellos son mayores que la media.
		 */
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		// Empezamos el programa
		System.out.println("La lista va a continuar hasta que añadas el número -99:");

		while ((valor = sc.nextInt()) != -99) {
			numeros.add(valor); // se le añade el add que así es como se le introduce
		}
		// arrays añadidos
		int numTotales = numeros.size();
		int numSuma = 0;
		for (int num : numeros) {
			numSuma += num;
		}
		double numMedia = (double) (numSuma / numTotales);
// mostrar los números
		System.out.println("Los números que has añadido son: " + numTotales);
		System.out.println("La suma total es: " + numSuma);
		System.out.println("La media de los números es: " + numMedia);
		int numMayoresM = 0;
		for (int num : numeros) {
			if (num > numMedia) {
				numMayoresM++;
				System.out.println(num + " es mayor que la media.");
			}
		}
		System.out.println("Hay " + numMayoresM + " mayores que la media.");
		
		/*
		 * Tenemos que modificar el ejercicio que acabamos de hacer para que trabaje con
		 * arraylist.
		 * 
		 * Y permita eliminar uno por id. Al final
		 */
		System.out.println("____________________________________________________________");
		 //borrar una entrada por id/indice
		System.out.println("Introduce el índice que va a borrar");
		int posicion = 0;
		 for (Integer i : numeros) {
				System.out.println("Posición "+posicion+") " +i);
				posicion++;
			    }
		int indice=sc.nextInt();
		numeros.remove(indice);
	    posicion = 0;
	    for (Integer i : numeros) {
		System.out.println("Posición "+posicion+") " +i);
		posicion++;
	    }
		
		
	    sc.close();
	}// acaba el main

}// acaba la clase de ArrayListNumeros
