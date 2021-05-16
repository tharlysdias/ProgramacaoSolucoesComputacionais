package vetores;

import java.util.Scanner;

/**
 * 1 – Faça um algoritmo que receba como entrada 5 números.
 * Depois imprima os 5 números na tela;
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
			System.out.print("Informe na posição " + (i + 1) + " um numero: ");
			numeros[i] = teclado.nextInt();
		}
		
//		Outra solução
//		for (int i = numeros.length - 1; i > -1; i--) {
//		System.out.print("Informe na posição " + (i + 1) + " um numero: ");
//		numeros[i] = teclado.nextInt();
//	}

		// Saída dos dados
 		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Resultado: " + numeros[i]);
		}
		teclado.close();
	}
}
