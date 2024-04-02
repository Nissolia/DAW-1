package sustito;

import sustitoError.errorFecha;

public class Fecha {
	// CONSTANTES
	private final int ACTUAL = 2024;
	// ATRIBUTOS
	private int anio;
	private int mes;
	private int dia;

	/*****************/
	/* CONSTRUCTORES */
	/**
	 * @param anio
	 * @param mes
	 * @param dia
	 * 
	 * @throws Exception ***************/
	public Fecha(int anio, int mes, int dia) {
		
		if(mes<1 || mes > 12 || dia < 1 || dia > 30 || anio > ACTUAL) {
			throw new errorFecha("Datos incorrectos de la fecha.");
		}
			this.anio = anio;
			this.mes = mes;
			this.dia = dia;
	}

	/********************/
	/* GETTER Y SETTERS */
	/********************/
	public int getACTUAL() {
		return ACTUAL;
	}

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
	public Boolean setFecha(int anio, int mes, int dia) {
		Boolean salida = true;
		if(mes<1 || mes > 12 || dia < 1 || dia > 30 || anio > ACTUAL) {
			salida = false; 
		}else {
			this.anio = anio;
			this.mes = mes;
			this.dia = dia;
		}
		return salida;
	}

}
