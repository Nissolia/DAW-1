package tareasPoli_2;

/**
 * Class for square
 * 
 * @author Lalo
 * @version 1.0
 * @since 1.0
 */

public class Cuadrado extends Rectangulo {
	
	
	// Constructors
	
	/**
	 * Constructors with all params
	 * @param color, base, altura
	 */

	public Cuadrado(String color, int lado) {
		super(color, lado, lado);
		
	}

	public Cuadrado() {
		super();
	}

	/**
	 * Calcula el perimetro 
	 * 
	 * @return double
	 */
	
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		System.out.println(getLado()*4);
		
	}
	
	/**
	 * Calcula el area 
	 * 
	 * @return double
	 */

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		
		System.out.println("El area de un cuadrado es: "+ getLado()*getLado());
		
	}
	
	
	public void metodoDeCuadrado() {
		System.out.println("Este método es de la clase cuadrado.");
	}

	
	
	
}
