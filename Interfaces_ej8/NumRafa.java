package Interfaces_ej8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class NumRafa {


	    public static void main(String[] args) {

	    	ArrayList<Integer> listaEnteros = new ArrayList<>();
	        for (int i = 0; i < 20; i++) {
	        	int numero = (int) (Math.random()*10);
	            listaEnteros.add(numero);
	        }
	        
	    	Set<Integer> noRepes = new HashSet<>(listaEnteros); 
	    	
	    	Set<Integer> repes = new HashSet<>();
	        for (Integer elemento : listaEnteros) {
	            if (listaEnteros.indexOf(elemento) != listaEnteros.lastIndexOf(elemento)) { 
	            	repes.add(elemento);
	            }
	        }
	        
	        Set<Integer> unicos = new HashSet<>();
	        for (Integer elemento : listaEnteros) {
	            if (listaEnteros.indexOf(elemento) == listaEnteros.lastIndexOf(elemento)) {
	            	unicos.add(elemento);
	            }
	        }
	        
	        System.out.println("Lista de enteros aleatorios: " + listaEnteros);
	        System.out.println("Conjunto sin repetir: " + noRepes);
	        System.out.println("Conjunto de repetidos: " + repes);
	        System.out.println("Conjunto unicos: " + unicos);
	    }
	}
	

