package tareasPoli_2;

/**
 * Class for rectangles
 * 
 * @author Lalo
 * @version 1.0
 * @since 1.0
 */

public class Rectangulo extends Figura {
	
	// Attributes
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", lado=" + lado + ", getColor()=" + getColor() + "]";
	}


	private int base;
	private int lado;
	
	// Constructors
	
	/**
	 * Constructors with all params
	 * @param color, base, altura
	 */

	public Rectangulo(String color, int base, int lado) {
		super(color);
		// TODO Auto-generated constructor stub
		this.base=base;
		this.lado=lado;
	}

	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Calcula el perimetro 
	 * 
	 * @return double
	 */
	
	public int getLado() {
		return lado;
	}
	
	
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		System.out.println((base*2)+(lado*2));

	}


	/**
	 * Calcula el area 
	 * 
	 * @return double
	 */
	
	@Override
	public void calcularArea() {
		if(getColor().equals("Rojo")) {
			System.out.println("Yo con el sevilla no quiero na,");
		}else {
			
			if(getColor().equals("Verde")) {
				
				for(int i =0; i<100;i++) {
					System.out.println("vIVA EL BETIS");
				}
			}
			
			System.out.println(base*lado);
			
		}
	}

}






