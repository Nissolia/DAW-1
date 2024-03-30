package tareas;

public class Fecha {
	/*************/
	/* ATRIBUTOS */
	/*************/
	private int dia;
	private int mes;
	private int anio;

	/*****************/
	/* CONSTRUCTORES */
	/*****************/
	Fecha() {
	}

	Fecha(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
		this.anio = 2024;
	}

	Fecha(int dia) {
		this.dia = dia;
		this.mes = 01;
		this.anio = 2024;
	}

	Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	/***************/
	/* GET AND SET */
	/***************/
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	// MES
	public int getMes() {
		return dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	// AÑO
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	/***********/
	/* MÉTODOS */
	/***********/
	
// 30 dias  4-6-9-11
	
	public Boolean fechaCorrecta() {
		Boolean bandera = false;

		if ((anio <= 2024 && anio >= 0) && (mes <= 12 && mes >= 1) && (dia <= 31 && dia >= 1)) {
			bandera = true;
			// GENIAL, OLE OLE
			System.out.println("Has puesto bien la fecha, ole ole");

			bandera = esBisiesto(anio);
		}
		return bandera;
	}

	public Boolean esBisiesto(int anio) {
		Boolean bandera = false;

		if (((anio % 4) == 0) && ((anio % 100) != 0) || ((anio % 400) == 0)) {
			bandera = true;
		}

		return bandera;
	}

	public void diaSiguiente() {

		/*
		 * Método fechaCorrecta() que comprueba si la fecha es correcta. Devuelve un
		 * valor de tipo boolean indicando si la fecha es correcta o no. Este método a
		 * su vez utilizará un método privado de la clase llamado esBisiesto que calcula
		 * si el año es o no bisiesto. El método esBisiesto devuelve true si el año es
		 * bisiesto y false si no lo es.
		 */
	}

	@Override
	public String toString() {
		String uni1 = "", uni2 = "";
		/***************************/
		if (dia >= 1 && dia <= 9) {
			uni1 = 0 +  String.valueOf(dia);
		}else {
			uni1 = String.valueOf(dia);
		}
		/* EL MES */
		if (mes >= 1 && mes <= 9) {
			uni2 = 0 +  String.valueOf(mes);
			
		}else {
			uni2 = String.valueOf(mes);
		}
		
		
		return uni1 + "-" + uni2 + "-" + anio;

	}
}
