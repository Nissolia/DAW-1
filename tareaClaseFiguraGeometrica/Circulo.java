package tareaClaseFiguraGeometrica;

/**
 * Class for circle
 * 
 * @author Noelia
 * @version 1.0
 * @since 1.0
 */

public class Circulo extends FiguraGeometrica {
	/* ATRIBUTOS */
	private double radio;

	/* CONSTRUCTORES */

	/**
	 * Constructors with param radio
	 * 
	 * @param radio
	 */

	public Circulo(double radio) {
		super();
		this.radio = radio;

	}
	/* GETTER AND SETTERS */

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	/***********/
	/* MÉTODOS */
	/***********/
	/**
	 * do the area
	 * 
	 * @return double
	 */
	@Override
	public double getArea() {

		return Math.PI * radio * radio;
	}

	/**
	 * do the perimeter
	 * 
	 * @return double
	 */
	@Override
	public double getPerimetro() {

		return 2 * Math.PI * radio;
	}

}
