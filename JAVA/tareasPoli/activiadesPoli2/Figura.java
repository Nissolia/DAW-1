package tareasPoli.activiadesPoli2;

/**
 * 
 * Superclass, contains abstracts methods
 * 
 * @author GonzaloPineda
 * @version 1.0
 * @since 1.0
 * 	
 */

public abstract class Figura {

	// Attributes
	
	private String color = "verde";
	
	// Constructors

	public Figura(String HorseLuis) {
		this.color = HorseLuis;
	}
	
	public Figura() {
	}
	
	//Get
	
	public String getColor() {
		return color;
	}
	
	// Others methods 
	public abstract void calcularPerimetro();
	
	public abstract void calcularArea();
	
}
