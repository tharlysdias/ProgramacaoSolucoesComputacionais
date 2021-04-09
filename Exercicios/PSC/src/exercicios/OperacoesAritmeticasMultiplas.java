package exercicios;

import java.util.Scanner;

public class OperacoesAritmeticasMultiplas {

	public static void main(String[] args) {
		
		// Declaração das variáveis
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
		
		// Processamento e Saída
		System.out.println("Operação 1: " + (V1 + V2));
		System.out.println("Operação 2: " + (V2 - V1));
		System.out.println("Operação 3: " + (V3 * V1));
		System.out.println("Operação 4: " + (V3 + V2));
		System.out.println("Operação 5: " + (V3 - V2));
		System.out.println("Operação 6: " + (V1 + V2 + V3));
		
		leitor.close();

	}

}
