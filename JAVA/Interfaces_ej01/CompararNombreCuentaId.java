package Interfaces_ej01;

import java.util.Comparator;

public class CompararNombreCuentaId implements Comparator<Socios> {
	/*
	 * -1 si el primero es mayor
	 * 0 si son iguales
	 * 1 si el segundo es mayor
	 * */
	@Override
	public int compare(Socios o1, Socios o2) {
		int iguales = o1.getNombre().compareTo(o2.getNombre());
		// seguimos por aquí
		if (iguales == 0) {
			// si son iguales pasa a la cuenta
			iguales = (int) ((o1.getCuenta() - o2.getCuenta())*100);
			if (iguales == 0) {
				iguales = o1.getId_socio() - o2.getId_socio();
			}
		}
		return iguales;
	}
}