package vetores;

import java.util.Scanner;

public class Vetor_09_OperacoesBasicas {

	public static void main(String[] args) {

		/**
		 * 9. Faça um algoritmo que recebe 2 vetores de 5 números cada.
		 * Ao final receba uma das operações básicas (+, -, *, /) e 
		 * apresente um terceiro vetor com o resultado da operação de 
		 * cada elemento do primeiro valor pelo segundo valor.
		 */

		int quantidade = 5;
		Double primeiroVetor[] = new Double[quantidade];
		Double segundoVetor[] = new Double[quantidade];
		Double terceiroVetor[] = new Double[quantidade];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < primeiroVetor.length; i++) {
			System.out.print("Para o primeito vetor, informe um valor na " + (i+1) + "º posição: ");
			primeiroVetor[i] = teclado.nextDouble();
			System.out.print("Para o segundo vetor, informe um valor na " + (i+1) + "º posição: ");
			segundoVetor[i] = teclado.nextDouble();
		}
		
		for (int i = 0; i < primeiroVetor.length; i++) {
			terceiroVetor[i] = primeiroVetor[i] + segundoVetor[i];
			System.out.println("\nO resultado da " + (i+1) + "ª operação: " + terceiroVetor[i]);
		}
		
		teclado.close();
	}

}
