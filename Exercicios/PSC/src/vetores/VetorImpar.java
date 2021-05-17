package vetores;

import java.util.Scanner;

public class VetorImpar {

	public static void main(String[] args) {

		/**
		 * 6. Faça um algoritmo que leia 10 valores e 
		 * ao final imprima quantos desses são pares e quantos são ímpares.
		 */
		
		// Declaração de variáveis
		int contadorPar = 0;
		int contadorImpar = 0;
		int quantidadeValores = 10;
		Scanner teclado = new Scanner(System.in);
		Integer vetor[] = new Integer[quantidadeValores];

		// Entrada e processamento de dados
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + " número: ");
			vetor[i] = teclado.nextInt();

			if (vetor[i] % 2 == 0) {
				contadorPar++;
//				continue; // O continue pode ser usando quando não tiver o else
			} else {
				contadorImpar++;				
			}
		}

		// Saída
		System.out.println("Quantidade de números par: " + contadorPar);
		System.out.println("Quantidade de números impar: " + contadorImpar);

		teclado.close();
	}

}
