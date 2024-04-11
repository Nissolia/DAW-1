package tareasPoli_2;

/**
 * Class for circles
 * 
 * @author Lalo
 * @version 1.0
 * @since 1.0
 */

public class Circulo extends Figura {
	
	// Attributes
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getColor()=" + getColor() + "]";
	}

	private double radio;
	
	// Constructors
	
	/**
	 * Constructors with all params
	 * @param color, radio
	 */

	public Circulo(String color, double radio) {
		super(color);
		// TODO Auto-generated constructor stub
		this.radio=radio;
	}

	public Circulo() {
		// TODO Auto-generated constructor stub
	}

	
	// Other methods
	
	/**
	 * Calcula el perimetro 
	 * 
	 * @return double
	 */
	
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		System.out.println(2*(Math.PI)*this.radio);
	}
	
	/**
	 * Calcula el area 
	 * 
	 * @return double
	 */

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println((Math.PI)*(Math.pow(this.radio,2)));
	}

}
