package exercicios;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		// Declara��o de vari�veis
		int dividendo;
		int divisor;
		double divisao = 1;
		
		// Entrada de dados
		System.out.print("Informe o primeiro n�mero: ");
		dividendo = leitor.nextInt();
		
		System.out.print("Informe o segundo n�mero: ");
		divisor = leitor.nextInt();
		
		// Processamento e decis�o
		if (divisor == 0) {
			System.out.println("Ops... Voc� n�o pode dividir um n�mero por 0!");
		} else {
			divisao = dividendo / divisor;
			
			// Sa�da
			System.out.print("O resultado da divis�o �: " + divisao);
		}
	}

}
