package sustito;

public class Estudiante extends Persona {
	private int idEstudiante;
	private String grado;
	private int curso;
	private int notaMedia;

	/* COSNTRUCTORES */
	public Estudiante(String nombre, String ape1, String ape2, String dni, int anio, int mes, int dia, int telefono,
			String email, int idEstudiante, String grado, int curso, int notaMedia){
		super(nombre, ape1, ape2, dni, anio, mes, dia, telefono, email);
		this.idEstudiante = idEstudiante;
		this.grado = grado;
		this.curso = curso;
		this.notaMedia = notaMedia;
	}

	/* GETTER Y SETTER */
	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}

	/***********/
	/* MÉTODOS */
	/***********/
	public void hablar() {
		
		String frases[]= {
				"Profe, ¿nos dejas salir 5 minutitos antes?",
				"¿Descansito?",
				"¡Dinamarca!",
				"Shivato el que no bote",
				"Tuyo es, mio no"
		};
		int aleatorio = (int) (Math.random()*5);
System.out.println(frases[aleatorio]);
	}

	public void quejarse(String nombre) {
		// El almuno mostrará una frase con el nombre que se le ha pasado por teclado
		System.out.println(nombre + " se hizo pis en el saco de dormir.");
	}

	@Override
	public String toString() {
		return "Estudiante: " + idEstudiante + ", grado: " + grado + ", curso: " + curso + ", nota: "
				+ notaMedia;
	}

}
