package exercicios;

import java.util.Scanner;

public class ValorAcrescido {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis
		double valor;
		double valorNovo;
		
		// Entradas de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		valor = teclado.nextDouble();
		
		// Processamento
		valorNovo = valor + (valor * (15.8/100));
		
		// Sa�da
		System.out.println("Valor novo: " + valorNovo);

		teclado.close();
	}

}
