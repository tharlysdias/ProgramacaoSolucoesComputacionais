package vetores;

import java.util.Scanner;

/**
 * 1 � Fa�a um algoritmo que receba como entrada 5 n�meros.
 * Depois imprima os 5 n�meros na tela;
 * 
 * @author Tharlys de Souza Dias <tharlys.dias@senior.com.br>
 *
 */
public class Vetor5Numeros {
	public static void main(String[] args) {
		
		// Entrada de dados
		int[] numeros = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe na posi��o " + (i + 1) + " um numero: ");
			numeros[i] = teclado.nextInt();
		}
		
//		Outra solu��o
//		for (int i = numeros.length - 1; i > -1; i--) {
//		System.out.print("Informe na posi��o " + (i + 1) + " um numero: ");
//		numeros[i] = teclado.nextInt();
//	}

		// Sa�da dos dados
 		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Resultado: " + numeros[i]);
		}
		teclado.close();
	}
}
