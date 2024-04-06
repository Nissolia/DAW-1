package tareasBoletin;

public class bol0_randomClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];

		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 20);
		}
// AHORA PARA MOSTRAR POR PANTALLA

		for (int i = 0; i < 10; i++) {
			System.out.println("Número "+i +" : "+num[i]);
		}


	}

}
