package Interfaces_ej01;

import java.util.Comparator;

public class CompararNombreId implements Comparator<Socios> {

	@Override
	public int compare(Socios o1, Socios o2) {
		int iguales = o1.getNombre().compareTo(o2.getNombre());
		// seguimos por aquí
		if (iguales == 0) {
			// si son iguales pasa a la cuenta
			iguales = (int) ((o2.getCuenta() - o1.getCuenta()) * 100);
		}
		return iguales;
	}

}
