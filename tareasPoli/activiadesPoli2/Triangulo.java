package tareasPoli.activiadesPoli2;

/**
 * Class for triangles
 * 
 * @author Lalo
 * @version 1.0
 * @since 1.0
 */

public class Triangulo extends Figura {
	
	// Attributes
	
	private int base;
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", getColor()=" + getColor() + "]";
	}

	public void setAltura(int a) {
		altura = a;
	}
	private int altura;
	
	// Constructors
	
	/**
	 * Constructors with all params
	 * @param color, base, altura
	 */

	public Triangulo(String color, int base, int altura) {
		super(color);
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	public Triangulo() {
		super();
	}
	
	/**
	 * No calcula el perimetro porque sin los lados es una liada
	 * 
	 * @return double
	 */

	@Override
	public void calcularPerimetro() {
		double perimetro = base*Math.pow(altura, base);
		
		System.out.println("El perimeto de un triangulo es: "+perimetro);
	}
	
	/**
	 * Calcula el area 
	 * 
	 * @return double
	 */

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println((base*altura)/2);

	}

}
