package tareaClases_0;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class pruebaCopa {

    public static void main(String[] args) {
        // Crear 2 arrays de números enteros de 5 posiciones
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        // Rellenar el primer array con números aleatorios
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100); // Puedes ajustar el rango según tus necesidades
        }

        // Copiar el primer array en el segundo en orden inverso
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - i - 1];
        }

        // Mostrar ambos arrays
        System.out.println("Primer array: " + Arrays.toString(array1));
        System.out.println("Segundo array (en orden inverso): " + Arrays.toString(array2));

        // Permitir la introducción de un número en la posición deseada en el array principal
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (o 0 para salir): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                System.out.print("Introduce la posición en la que deseas colocar el número: ");
                int posicion = scanner.nextInt();

                if (posicion >= 1 && posicion <= array1.length) {
                    array1[posicion - 1] = numero;

                    // Actualizar el segundo array en orden inverso
                    for (int i = 0; i < array1.length; i++) {
                        array2[i] = array1[array1.length - i - 1];
                    }

                    // Mostrar ambos arrays después de la modificación
                    System.out.println("Primer array modificado: " + Arrays.toString(array1));
                    System.out.println("Segundo array modificado (en orden inverso): " + Arrays.toString(array2));
                } else {
                    System.out.println("La posición debe estar entre 1 y " + array1.length);
                }
            }
        } while (numero != 0);

        // Cerrar el scanner
        scanner.close();
    }
}