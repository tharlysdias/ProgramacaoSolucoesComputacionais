package exercicios;

import java.util.Scanner;

public class OperacoesAritmeticas {

	public static void main(String[] args) {

		// Declara��o das vari�veis
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
		
		// Sa�da
		System.out.println("O resultado da soma �: " + soma);
		System.out.println("O resultado da subtracao �: " + subtracao);
		System.out.println("O resultado da multiplica��o �: " + multiplicacao);
		if (N2 == 0) {
			System.out.println("Ops... Voc� n�o pode dividir um n�mero por 0!");
		} else {
			divisao = (double) N1/N2;
			
			System.out.println("o Resultado da divis�o �: " + divisao);
		}

		leitor.close();

	}

}
