package exercicios;

import java.util.Scanner;

public class OperacoesAritmeticas {

	public static void main(String[] args) {

		// Declaração das variáveis
		int N1;
		int N2;
		int soma;
		int subtracao;
		int multiplicacao;
		double divisao;

		// Entradas de dados
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o valor de 1: ");
		N1 = leitor.nextInt();

		System.out.print("Digite o valor de 2: ");
		N2 = leitor.nextInt();
		
		// Processamento
		soma = N1 + N2;
		subtracao = N1 - N2;
		multiplicacao = N1 * N2;
		
		// Saída
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtracao é: " + subtracao);
		System.out.println("O resultado da multiplicação é: " + multiplicacao);
		if (N2 == 0) {
			System.out.println("Ops... Você não pode dividir um número por 0!");
		} else {
			divisao = (double) N1/N2;
			
			System.out.println("o Resultado da divisão é: " + divisao);
		}

		leitor.close();

	}

}
