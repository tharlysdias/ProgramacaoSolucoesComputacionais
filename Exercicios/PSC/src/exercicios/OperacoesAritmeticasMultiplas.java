package exercicios;

import java.util.Scanner;

public class OperacoesAritmeticasMultiplas {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis
		int V1;
		int V2;
		int V3;
		
		// Entradas de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor de 1: ");
		V1 = leitor.nextInt();
		
		System.out.print("Digite o valor de 2: ");
		V2 = leitor.nextInt();
		
		System.out.print("Digite o valor de 3: ");
		V3 = leitor.nextInt();
		
		// Processamento e Sa�da
		System.out.println("Opera��o 1: " + (V1 + V2));
		System.out.println("Opera��o 2: " + (V2 - V1));
		System.out.println("Opera��o 3: " + (V3 * V1));
		System.out.println("Opera��o 4: " + (V3 + V2));
		System.out.println("Opera��o 5: " + (V3 - V2));
		System.out.println("Opera��o 6: " + (V1 + V2 + V3));
		
		leitor.close();

	}

}
