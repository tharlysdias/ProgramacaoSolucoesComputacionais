package exercicios;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis
		int numero1;
		int numero2;
		int multiplicacao;
				
		// Entradas de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Informe o segundo n�mero: ");
		numero2 = leitor.nextInt();

		// Processamento
		multiplicacao = numero1 * numero2;
		
		// Sa�da
		System.out.println("O resultado da multiplica��o �: " + multiplicacao);
	}

}
