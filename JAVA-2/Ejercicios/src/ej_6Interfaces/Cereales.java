package ej_6Interfaces;

import java.time.LocalDate;

public class Cereales implements EsAlimento {
	String marca;
	double precio;
	tipoCereal cerealTipo;
	int calorias;
	String nombreCereal;
// CONSTRUCTOR

	public Cereales(String marca, double precio, tipoCereal cereal) {
		this.marca = marca;
		this.precio = precio;
		switch (cereal) {
		case AVENA:
			nombreCereal="avena";
			this.calorias = 5;
			break;
		case MAIZ:
			nombreCereal="maiz";
			this.calorias = 8;
			break;
		case TRIGO:
			nombreCereal="trigo";
			this.calorias = 12;
			break;
		default:
			nombreCereal="otro";
			calorias = 15;
		}
		this.cerealTipo = cereal;
	}

	void setCereal(String string) {
		// TODO Auto-generated method stub

	}

	// MÉTODOS DE : ES ALIMENTO
	@Override
	public void setCaducidad(LocalDate fc) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return 0;
	}

}
