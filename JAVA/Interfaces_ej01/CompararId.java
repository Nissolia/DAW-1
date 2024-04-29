package Interfaces_ej01;

import java.util.Comparator;

public class CompararId implements Comparator<Socios> {

	@Override
	public int compare(Socios o1, Socios o2) {
		int aux = 0;
		aux = o1.getId_socio() - o2.getId_socio();
		/*
		 * si o1 es mayor sale positivo, si son iguales sale 
		 * 0 y si es negativo el o2 es el grande
		 */
		return aux;
	}

}