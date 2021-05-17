package vetores;

import java.util.Scanner;

public class VetorImpar {

	public static void main(String[] args) {

		/**
		 * 6. Fa�a um algoritmo que leia 10 valores e 
		 * ao final imprima quantos desses s�o pares e quantos s�o �mpares.
		 */
		
		// Declara��o de vari�veis
		int contadorPar = 0;
		int contadorImpar = 0;
		int quantidadeValores = 10;
		Scanner teclado = new Scanner(System.in);
		Integer vetor[] = new Integer[quantidadeValores];

		// Entrada e processamento de dados
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + " n�mero: ");
			vetor[i] = teclado.nextInt();

			if (vetor[i] % 2 == 0) {
				contadorPar++;
//				continue; // O continue pode ser usando quando n�o tiver o else
			} else {
				contadorImpar++;				
			}
		}

		// Sa�da
		System.out.println("Quantidade de n�meros par: " + contadorPar);
		System.out.println("Quantidade de n�meros impar: " + contadorImpar);

		teclado.close();
	}

}
