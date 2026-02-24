package controller;

public class Metodos {

	public static int divisao (int A, int B) {
		
		// Condição de parada: Enquando "B" for menor ( ou couber dentro de "A") a divisão continua decrementando A
		
		if (A >= B) {  
			
		    return divisao(A - B, B);
		    
		// Quando não for possível continar, retornamos "A", que é exatamente o resto da divisão de "A" por "B"
		    
		} else {
			
		    return A;
		}
	}
}
