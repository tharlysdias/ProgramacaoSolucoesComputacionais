package vetores;

import java.util.Scanner;

public class Vetor_Posicao3 {

	public static void main(String[] args) {

		/**
		 * 4. Fa�a um algoritmo que armazene 5 n�meros.
		 * Ap�s a leitura dos dados armazene na posi��o 3 do vetor o valor 100.
		 * Depois mostre todos os valores na tela
		 */
		
		// Declara��o de vari�veis
		int quantidadeNumeros = 5;
		Integer numeros[] = new Integer[quantidadeNumeros];
		Scanner teclado = new Scanner(System.in);

		// Entrada de dados
		for (int i = 0; i < numeros.length; i++) {
			if (i == 2) {
				numeros[i] = 100;
			} else {
				System.out.print("Informe um n�mero para " + (i + 1) + "� posi��o: ");
				numeros[i] = teclado.nextInt();				
			}
		}

		// Sa�da dos dados
		for (int i = 0; i < numeros.length; i++) {
			System.out.println((i + 1) + "� resultado: " + numeros[i]);
		}
		teclado.close();

	}

}
