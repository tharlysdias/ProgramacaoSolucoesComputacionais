package exercicios;

import java.util.Scanner;

public class ValorAcrescido {

	public static void main(String[] args) {
		
		// Declaração das variáveis
		double valor;
		double valorNovo;
		
		// Entradas de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		valor = teclado.nextDouble();
		
		// Processamento
		valorNovo = valor + (valor * (15.8/100));
		
		// Saída
		System.out.println("Valor novo: " + valorNovo);

		teclado.close();
	}

}
