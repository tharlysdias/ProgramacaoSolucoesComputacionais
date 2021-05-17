package vetores;

import java.util.Scanner;

public class Vetor_Posicao3 {

	public static void main(String[] args) {

		/**
		 * 4. Faça um algoritmo que armazene 5 números.
		 * Após a leitura dos dados armazene na posição 3 do vetor o valor 100.
		 * Depois mostre todos os valores na tela
		 */
		
		// Declaração de variáveis
		int quantidadeNumeros = 5;
		Integer numeros[] = new Integer[quantidadeNumeros];
		Scanner teclado = new Scanner(System.in);

		// Entrada de dados
		for (int i = 0; i < numeros.length; i++) {
			if (i == 2) {
				numeros[i] = 100;
			} else {
				System.out.print("Informe um número para " + (i + 1) + "ª posição: ");
				numeros[i] = teclado.nextInt();				
			}
		}

		// Saída dos dados
		for (int i = 0; i < numeros.length; i++) {
			System.out.println((i + 1) + "ª resultado: " + numeros[i]);
		}
		teclado.close();

	}

}
