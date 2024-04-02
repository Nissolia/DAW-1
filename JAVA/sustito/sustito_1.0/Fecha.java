package sustito;

public class Fecha {
	private int anio;
	private int mes;
	private int dia;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	public Fecha(int anio, int mes, int dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}

	/********************/
	/* GETTER Y SETTERS */
	/********************/
	public int getAnio() {
		return anio;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	/***********/
	/* MÉTODOS */
	/***********/	
	public void setFecha(int anio, int mes, int dia) {
	    // Verificar que el año tenga 4 caracteres
	    String anioStr = String.valueOf(anio);
	    if (anioStr.length() != 4) {
	        throw new IllegalArgumentException("El año debe tener 4 caracteres.");
	    }
	    // Que el año este entre 1900 y 2024
	    if (anio < 1900 || anio > 2024) {
	        throw new IllegalArgumentException("Has introducido una fecha incorrecta.");
		}
	    
	    // Verificar que el mes tenga 2 caracteres o 1
	    String mesStr = String.format("%02d", mes);
	    if (mesStr.length() != 2 && mesStr.length() != 1) {
	        throw new IllegalArgumentException("El mes debe tener 2 o 1 carácter.");
	    }
	    
	    // Verificar que el día tenga 2 caracteres o 1
	    String diaStr = String.format("%02d", dia);
	    if (diaStr.length() != 2 && diaStr.length() != 1) {
	        throw new IllegalArgumentException("El día debe tener 2 o 1 carácter.");
	    }
	    
	    // Asignar los valores
	    this.anio = anio;
	    this.mes = mes;
	    this.dia = dia;
	}

}
