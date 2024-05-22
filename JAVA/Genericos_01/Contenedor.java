package Genericos_01;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T>> {
	// usamos el comparable para poder ordenar los objetos

	/*********** ATRIBUTOS ***********/

	private T[] atributo;
	// usamos un array generico para guardar los elementos
	private int tamanio;
	// para poder tener en cuenta los elementos que vamos a tener en el array

	/*********** CONSTRUCTOR ***********/

	// se usa el 'unchecked' porque no se puede hacer un array generico en java
	@SuppressWarnings("unchecked")
	public Contenedor() {
		// inicializamos con un array vacio en tamanio 0
		atributo = (T[]) new Comparable[0];
		tamanio = 0;
	}

	// si añadimos un parámetro en el constructor y se le asigna tamanio a 1
	public Contenedor(T obj) {
		atributo[0] = obj;
		tamanio = 1;
	}

	/*********** MÉTODOS ***********/

	/* añade más espacio al array, inserta un elemento al final */
	public void insertarAlfinal(T nuevo) {
		atributo = Arrays.copyOf(atributo, tamanio + 1);
		atributo[tamanio] = nuevo;
		tamanio++;
	}

	/* Elimina y devuelve el ultimo elemento del array */
	public T extraerDelFinal() {
		if (tamanio == 0) {// comprueba que no está vacio
			throw new IllegalStateException("El contenedor está vacío");
		}
		T ultimo = atributo[tamanio - 1];
		atributo = Arrays.copyOf(atributo, tamanio - 1);
		tamanio--; // se elimina del array principal
		return ultimo;
	}

	/* ordena los elementos del array */
	public void ordenar() {
		Arrays.sort(atributo, 0, tamanio);
		// usamos el sort para ordenar
	}

	/* Inserta un elemento nuevo al comienzo del array */
	public void insertarAlPrincipio(T nuevo) {
		atributo = Arrays.copyOf(atributo, tamanio + 1);// redimensionamos el array
		System.arraycopy(atributo, 0, atributo, 1, tamanio);// se mueven los elementos a un lado
		atributo[0] = nuevo;// guardamos el nuevo en la primera posicion
		tamanio++;// incrementamos el tamaño
	}

	/* elimina y devuelve el primer elemento del array */
	public T extraerDelPrincipio() {
		if (tamanio == 0) {// confirmamos que no está vacio
			throw new IllegalStateException("El contenedor está vacío");
		}
		T primero = atributo[0];// guardamos el primer elemento que está en el array
		T[] nuevosElementos = Arrays.copyOfRange(atributo, 1, tamanio);// extraemos el primero que encontramos
		atributo = nuevosElementos;
		tamanio--;// quitamos el tamaño total
		return primero;
	}

	/* añadimos un elemento en el array, es similar a insertar al principio */
	public void guardar(T nuevo) {
		atributo = Arrays.copyOf(atributo, tamanio + 1);
		atributo[tamanio] = nuevo;
		tamanio++;
	}

	/*
	 * devulve el ultimo elemento del array sin eliminarlo, verificamos que no esta
	 * vacios y luego se devuvle el ultimo elemento
	 */
	public T extraer() {
		if (tamanio == 0) {
			throw new IllegalStateException("El contenedor está vacío");

		} else if (tamanio < 0) {
			System.out.println();
		}
		return atributo[tamanio - 1];
	}

	/**
	 * Método toString en el cual se devulve una representacion en cadena de los
	 * elementos del array
	 */
	@Override
	public String toString() {
		String cadenaTexto = "";

		for (int i = 0; i < tamanio; i++) {// usamos el tamaño para ver el array
			cadenaTexto += atributo[i];

			if (i < tamanio - 1) {
				cadenaTexto += ", ";
			}
		}
		cadenaTexto += ".";
		return cadenaTexto;
	}

}
