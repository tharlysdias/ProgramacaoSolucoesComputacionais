package vetores;

import java.util.Scanner;

public class Vetor5Numeros {
	public static void main(String[] args) {
		int[] numeros = new int[5];
		Scanner teclado = new Scanner(System.in);

		// Fa�a um algoritmo que receba como entrada 5 n�meros. Depois imprima os 5
		// n�meros na tela;

		for (int i = numeros.length - 1; i > -1; i--) {
			System.out.println("Informe na posi��o " + (i + 1) + " um numero: ");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();

		// processamento ?????

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Resultado: " + numeros[i]);
		}
	}
}
