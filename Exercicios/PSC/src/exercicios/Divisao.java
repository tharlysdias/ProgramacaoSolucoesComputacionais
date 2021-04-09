package exercicios;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		// Declaração de variáveis
		int dividendo;
		int divisor;
		double divisao = 1;
		
		// Entrada de dados
		System.out.print("Informe o primeiro número: ");
		dividendo = leitor.nextInt();
		
		System.out.print("Informe o segundo número: ");
		divisor = leitor.nextInt();
		
		// Processamento e decisão
		if (divisor == 0) {
			System.out.println("Ops... Você não pode dividir um número por 0!");
		} else {
			divisao = dividendo / divisor;
			
			// Saída
			System.out.print("O resultado da divisão é: " + divisao);
		}
	}

}
