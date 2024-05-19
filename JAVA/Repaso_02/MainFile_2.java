package Repaso_02;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainFile_2 {
	public static void main(String[] args) {
        // Variables que usaremos
        int elecc = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> archivosTxt = new ArrayList<>();
        
        // Código
        do {
            System.out.println("................................. MENÚ" 
                    + "\n 1)Leer archivos."
                    + "\n 2)Sobreescribir un archivo existente." 
                    + "\n 3)Escribir al final del archivo."
                    + "\n-1)Salir");

            // Try-catch para no dejar la posibilidad de que la persona meta un string
            try {
                elecc = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Las opciones están en números por algo...\n");
                sc.nextLine(); // Limpiar el buffer del Scanner
                elecc = 0; // Resetear elecc para evitar repetir la última opción válida
            }
            
            switch (elecc) {
            case 1:
                leerArchivo(archivosTxt);
                break;
            case 2:
                sobreescribirArchivo();
                break;
            case 3:
                escribirFinal();
                break;
            case -1:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Has añadido una opción incorrecta.... \nRedirigiendo al menú...\n");
                break;
            }

        } while (elecc != -1); // Este bucle hará que se ejecute mientras sea diferente a -1
        sc.close();
    } // fin del main

	// Métodos que usaremos
	  public static void leerArchivo(ArrayList<String> archivosTxt) {
	        System.out.println("Leyendo archivos disponibles...");
	        archivosTxt = listarArchivos("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\");
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Archivos disponibles:");
	        for (String archivo : archivosTxt) {
	            System.out.println(archivo);
	        }
	        
	        System.out.println("Ingrese el nombre del archivo a leer:");
	        String nombreArchivo = sc.nextLine();
	        
	        File archivo = new File("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\" + nombreArchivo);
	        if (archivo.exists()) {
	            try (FileReader fr = new FileReader(archivo)) {
	                int c;
	                while ((c = fr.read()) != -1) {
	                    System.out.print((char) c);
	                }
	            } catch (IOException e) {
	                System.out.println("Error al leer el archivo.");
	            }
	        } else {
	            System.out.println("El archivo no existe.");
	        }
	        sc.close();
	    }

	/*
	 * Metemos en el método de guardar archivos
	 */
	  private static ArrayList<String> listarArchivos(String directorio) {
	        ArrayList<String> archivosTxt = new ArrayList<>();
	        File carpeta = new File(directorio);
	        File[] listaArchivos = carpeta.listFiles((dir, name) -> name.toLowerCase().endsWith(".csv"));
	        if (listaArchivos != null) {
	            for (File archivo : listaArchivos) {
	                archivosTxt.add(archivo.getName());
	            }
	        }
	        return archivosTxt;
	    }
	  
	  
	  public static void sobreescribirArchivo() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Ingrese el nombre del archivo a sobrescribir:");
	        String nombreArchivo = sc.nextLine();
	        
	        System.out.println("Ingrese el nuevo contenido del archivo:");
	        String nuevoContenido = sc.nextLine();
	        
	        File archivo = new File("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\" + nombreArchivo);
	        if (archivo.exists()) {
	            try (FileWriter fw = new FileWriter(archivo)) {
	                fw.write(nuevoContenido);
	                System.out.println("Archivo sobrescrito exitosamente.");
	            } catch (IOException e) {
	                System.out.println("Error al escribir en el archivo.");
	            }
	        } else {
	            System.out.println("El archivo no existe.");
	        }
	        sc.close();
	    }


	    public static void escribirFinal() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Ingrese el nombre del archivo al que desea agregar contenido:");
	        String nombreArchivo = sc.nextLine();
	        
	        System.out.println("Ingrese el contenido a agregar:");
	        String contenido = sc.nextLine();
	        
	        File archivo = new File("C:\\Users\\noeli\\Documents\\Programacion\\3cer_trimestre\\Textos\\" + nombreArchivo);
	        if (archivo.exists()) {
	            try (FileWriter fw = new FileWriter(archivo, true)) {
	                fw.write(contenido);
	                System.out.println("Contenido agregado exitosamente.");
	            } catch (IOException e) {
	                System.out.println("Error al escribir en el archivo.");
	            }
	        } else {
	            System.out.println("El archivo no existe.");
	        } sc.close();
	    }
	   
	}


