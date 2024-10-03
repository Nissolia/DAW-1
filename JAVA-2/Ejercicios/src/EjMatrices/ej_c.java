package EjMatrices;

public class ej_c {
	final static int f = 8;
	final static int c = 6;

	public static void main(String[] args) {
		int[][] matriz = new int[f][c];
		// mostramos el texto para luego mostrar el marco
		System.out.println("Matriz marco:");
		marco(matriz);
	}

	// funcion para colorear el marco como queremos
	private static void marco(int matriz[][]) {
		//
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {
				// sale uno si es fila 0 o columna 0 pero tambien si es el final
				if (i == 0 || i == (f-1) || j == 0 || j == (c-1)) {
					System.out.print('1');
				}else {
					System.out.print('0');
				}
				
			}System.out.println("");
		}

	}
}
