package vetores;

import java.util.Scanner;

public class Vetor_05_10ValoresReais {

	public static void main(String[] args) {
		
		/**
		 * 5. Faça um algoritmo que armazene 10 valores reais. 
		 * Ao final apresente: 
		 * A soma de todos os valores, a média, o menor valor, o maior valor
		 */
		
		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int quantidadeValoresReais = 10;
		Double valoresReais[] = new Double[quantidadeValoresReais];
		Double somaTodosValores = 0D, media = 0D, menorValor = 0D, maiorValor = 0D;

		// Entrada de dados
		for (int i = 0; i < valoresReais.length; i++) {
			System.out.print("Informe o valor real da " + (i + 1) + "ª posição: ");
			valoresReais[i] = teclado.nextDouble();
		}
		
		for (int i = 0; i < valoresReais.length; i++) {
			somaTodosValores += valoresReais[i];
			if (menorValor >= valoresReais[i]) {
				menorValor = valoresReais[i];
			}
			if (maiorValor <= valoresReais[i]) {
				maiorValor = valoresReais[i];
			}
		}
		
		media = somaTodosValores / valoresReais.length;
		System.out.println("\nA soma de todos os valores: " + somaTodosValores);
		System.out.println("A média dos valores: " + media);
		System.out.println("O menor valor: " + menorValor);
		System.out.println("O maior valor: " + maiorValor);
		
		teclado.close();
	}

}
