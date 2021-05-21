package vetores;

import java.util.Scanner;

public class Vetor_10_OrdemCreDecre {

	public static void main(String[] args) {

		/**
		 * 10. Faça um algoritmo que receba 10 números e imprima todos os valores em
		 * ordem crescente e decrescente.
		 */

		int quantidade = 10;
		int dezNumeros[] = new int[quantidade];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < dezNumeros.length; i++) {
			System.out.print("Informe um valor para " + (i + 1) + "ª posição: ");
			dezNumeros[i] = teclado.nextInt();
		}

		System.out.println();
		for (int i = 0; i < dezNumeros.length; i++) {
			System.out.println("Ordem crescente: " + dezNumeros[i]);
		}

		System.out.println();
		for (int i = (dezNumeros.length - 1); i >= 0; i--) {
			System.out.println("Ordem decrescente: " + dezNumeros[i]);
		}

		teclado.close();

	}

}
