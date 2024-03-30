package tareaClaseFiguraGeometrica;

/**
 * Class for triangle
 * 
 * @author Noelia
 * @version 1.0
 * @since 1.0
 */
public class Triangulo extends FiguraGeometrica {
	/* ATRIBUTOS */
	double lado1;
	double lado2;
	double lado3;

	/* CONSTRUCTORES */
	/**
	 * Constructors with params, 3 lados
	 * 
	 * @param radio
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;

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

		return (lado1 * lado2) / 2;
	}

	/**
	 * do the perimeter
	 * 
	 * @return double
	 */
	@Override
	public double getPerimetro() {

		return lado1 + lado2 + lado3;
	}
}
