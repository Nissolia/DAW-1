package Interfaces_ej01;

import java.util.Comparator;

public class CompararNombre implements Comparator<Socios> {

	@Override
	public int compare(Socios o1, Socios o2) {
		
		return o1.getNombre().compareTo(o2.getNombre());
	}

	

	
}
