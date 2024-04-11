package Excepciones_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        // atributos
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean esNum = false;

        // programa
        do {
            try {
                System.out.print("Introduce un número entero positivo: ");
                num = sc.nextInt();

                if (num <= 0) {
                    throw new InputMismatchException("Debe ser un número entero positivo.");
                } else {
                    esNum = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un número entero positivo.");
                sc.nextLine(); 
                // limpia el búfer del scanner
            }

        } while (!esNum);

        // bucle para mostrar los números pares
        System.out.println("Los números pares hasta " + num + " son: ");
        for (int i = 2; i <= num; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}

