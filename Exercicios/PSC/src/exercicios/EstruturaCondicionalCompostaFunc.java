package exercicios;

import java.util.Scanner;

public class EstruturaCondicionalCompostaFunc {

	public static void main(String[] args) {

		// Declaração das variáveis
		int codigo;
		double salarioAtual;
		double valorAumento;
		double novoSalario;

		// Entradas de dados
		Scanner teclado = new Scanner(System.in);

		System.out.println("Bem-vindo ao sistema de departamento pessoal\n");

		System.out.print("Digite o código correspondente ao cargo do funcionário: ");
		codigo = teclado.nextInt();

		System.out.print("Digite o salário atual do funcionário: ");
		salarioAtual = teclado.nextDouble();

		// Processamento e Saída
		if (codigo == 1) {
			valorAumento = salarioAtual * 50 / 100;
			novoSalario = salarioAtual + valorAumento;
			System.out.println("\nCargo: Escriturário");
			System.out.println("O valor de aumento é: " + valorAumento);
			System.out.println("O novo salário é: " + novoSalario);
		} else if (codigo == 2) {
			valorAumento = salarioAtual * 35 / 100;
			novoSalario = salarioAtual + valorAumento;
			System.out.println("\nCargo: Secretário");
			System.out.println("O valor de aumento é: " + valorAumento);
			System.out.println("O novo salário é: " + novoSalario);
		} else if (codigo == 3) {
			valorAumento = salarioAtual * 20 / 100;
			novoSalario = salarioAtual + valorAumento;
			System.out.println("\nCargo: Caixa");
			System.out.println("O valor de aumento é: " + valorAumento);
			System.out.println("O novo salário é: " + novoSalario);
		} else if (codigo == 4) {
			valorAumento = salarioAtual * 10 / 100;
			novoSalario = salarioAtual + valorAumento;
			System.out.println("\nCargo: Gerente");
			System.out.println("O valor de aumento é: " + valorAumento);
			System.out.println("O novo salário é: " + novoSalario);
		} else {
			novoSalario = salarioAtual;
			System.out.println("\nCargo: Diretor");
			System.out.println("Esse cargo não tem aumento! :(");
			System.out.println("O seu salário é: " + novoSalario);
		}

		teclado.close();

	}

}
