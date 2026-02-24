package view;
import java.util.InputMismatchException;
import java.util.Scanner;
import controller.Metodos;

public class Main {
	public static void main (String args [ ]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("DIVISÃO USANDO RECURSIVIDADE");
		
		int A = 0, B = 0;
		boolean valido = false;

		// Testando tratamento de erros
		
		while (!valido) {
		    try {
		        System.out.print("Digite um número inteiro positivo para ser o numerados: ");
		        A = sc.nextInt();
		        if (A <= 0) {
		        	System.out.println("O número precisa ser maior que zero!");
		        } else {
		        	valido = true;
		        }    
		    } catch (InputMismatchException e) {
		        System.out.println("Precisa ser um número inteiro positivo!");
		        sc.next();
		    }
		}
		
		valido = false;
		
		while (!valido) {
			try {
				System.out.print("Digite um número inteiro positivo para ser o denominador: ");
		        B = sc.nextInt();
		        if (B <= 0) {
		        	System.out.println("O número precisa ser maior que zero!");
		        } else {
		        	valido = true;
		        } 
		    } catch (InputMismatchException e) {
		        System.out.println("Precisa ser um número inteiro positivo!");
		        sc.next();
		    }
		}
		
		System.out.println("Dividindo...");
		int result = Metodos.divisao(A, B);
		System.out.println("RESULTADO: " + result);
	}
}