package tareaClaseFiguraGeometrica;

/**
 * Class for square
 * 
 * @author Noelia
 * @version 1.0
 * @since 1.0
 */
public class Cuadrado extends FiguraGeometrica {
	/* ATRIBUTOS */
	double lado;

	/* CONSTRUCTORES */
	/**
	 * Constructors with param lado
	 * 
	 * @param radio
	 */
	public Cuadrado(double lado) {
		super();
		this.lado = lado;

	}

	/***********/
	/* MÉTODOS */
	/**
	 * do the area
	 * 
	 * @return double
	 */
	@Override
	public double getArea() {

		return lado * lado;
	}

	/**
	 * do the perimeter
	 * 
	 * @return double
	 */
	@Override
	public double getPerimetro() {

		return lado * 2;
	}
}
