package exercicios;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		
		// Declaração das variáveis
		int numero1;
		int numero2;
		int multiplicacao;
				
		// Entradas de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Informe o segundo número: ");
		numero2 = leitor.nextInt();

		// Processamento
		multiplicacao = numero1 * numero2;
		
		// Saída
		System.out.println("O resultado da multiplicação é: " + multiplicacao);
	}

}
