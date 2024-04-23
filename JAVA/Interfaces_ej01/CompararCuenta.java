package Interfaces_ej01;

import java.util.Comparator;

public class CompararCuenta implements Comparator<Socios> {

	@Override
	public int compare(Socios o1, Socios o2) {
		double aux = 0;
		aux = o1.getCuenta() - o2.getCuenta();
		/*
		 * si o1 es mayor sale positivo, si son iguales sale 
		 * 0 y si es negativo el o2 es el grande
		 */
		int auxInt = (int) (aux * 100);
		return auxInt;
	}

}
