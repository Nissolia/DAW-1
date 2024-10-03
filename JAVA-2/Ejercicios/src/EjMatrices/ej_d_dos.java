package EjMatrices;

import java.util.Scanner;

public class ej_d_dos{
    final static int MAX = 10;

    public static void main(String[] args) {
        // Preparamos el escáner
        Scanner s = new Scanner(System.in);
        
        // Creamos la tabla de tamaño 10
        int[] tabla = new int[MAX];
        
        System.out.println("Introduce 5 números de forma creciente:");
        
        // Usamos este bucle para rellenar los 5 primeros números
        for (int i = 0; i < 5; i++) {
            tabla[i] = s.nextInt();
            // Comprobamos si el número ingresado es mayor o igual al anterior
            if (i > 0 && tabla[i] < tabla[i - 1]) {
                System.out.println("Por favor, introduce números en orden creciente.");
                i--; // Retrocede el índice para volver a pedir el número
            }
        }

        // Mostramos la tabla actual con los 5 números
        System.out.println("Orden actual de nuestra tabla:");
        for (int i = 0; i < 5; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();

        // Pedimos al usuario que introduzca el número a insertar
        System.out.println("Introduce un número adicional para insertar en la tabla:");
        int num = s.nextInt();

        // Encontramos la posición adecuada para insertar el número sin alterar el orden
        int pos = 5; // Por defecto, si el número es mayor que todos, se inserta al final
        for (int i = 0; i < 5; i++) {
            if (num < tabla[i]) {
                pos = i;
                i = 5;
            }
        }

        // Desplazamos los elementos a la derecha para hacer espacio para el nuevo número
        for (int i = 5; i > pos; i--) {
            tabla[i] = tabla[i - 1];
        }

        // Insertamos el nuevo número en la posición adecuada
        tabla[pos] = num;

        // Mostramos la tabla después de la inserción
        System.out.println("Tabla después de insertar el número:");
        for (int i = 0; i < 6; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();

        // Cerramos el escáner
        s.close();
    }
}
