package depurar;
//Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

		// Definimos el bucle, incluye el 100
		while (num <= 100) {
			boolean comprobar = num % 2 == 0 && num % 3 == 0;
			
			if (comprobar== true) {
				System.out.println(num);
			}
			// Incrementamos num
			num=num+2;
		}
	}

}
