package vetores;

import java.util.Scanner;

public class Vetor5Numeros {
	public static void main(String[] args) {
		int[] numeros = new int[5];
		Scanner teclado = new Scanner(System.in);

		// Faça um algoritmo que receba como entrada 5 números. Depois imprima os 5
		// números na tela;

		for (int i = numeros.length - 1; i > -1; i--) {
			System.out.println("Informe na posição " + (i + 1) + " um numero: ");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();

		// processamento ?????

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Resultado: " + numeros[i]);
		}
	}
}
