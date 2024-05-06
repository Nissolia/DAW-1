package Piramides_ej1;

public class PiramideMedia {
	
	static void piramideMedia(int altura) {
		
		char[] abc= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		int espacios=altura;
		
		for (int i = 0; i < altura; i++) {
			
			System.out.print(" ".repeat(espacios));
			
			for (int j = 0; j < i+1; j++) {
				
				System.out.print(abc[j]);
				System.out.print(" ");
			}
			
			System.out.print(" ".repeat(espacios));
			
			espacios--;
			
			System.out.println();
		}
		
	}
	
}
