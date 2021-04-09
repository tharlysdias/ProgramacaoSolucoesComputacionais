package exercicios;

import java.util.Scanner;

public class EstruturaCondicionalCompostaFunc {

	public static void main(String[] args) {

		// Declara��o das vari�veis
		int codigo;
		double salarioAtual;
		double valorAumento;
		double novoSalario;

		// Entradas de dados
		Scanner teclado = new Scanner(System.in);

		System.out.println("Bem-vindo ao sistema de departamento pessoal\n");

		System.out.print("Digite o c�digo correspondente ao cargo do funcion�rio: ");
		codigo = teclado.nextInt();

		System.out.print("Digite o sal�rio atual do funcion�rio: ");
		salarioAtual = teclado.nextDouble();

		// Processamento e Sa�da
		if (codigo == 1) {
			valorAumento = salarioAtual * 50 / 100;
			novoSalario = salarioAtual + valorAumento;
			System.out.println("\nCargo: Escritur�rio");
			System.out.println("O valor de aumento �: " + valorAumento);
			System.out.println("O novo sal�rio �: " + novoSalario);
		} else if (codigo == 2) {
			valorAumento = salarioAtual * 35 / 100;
			novoSalario = salarioAtual + valorAumento;
			System.out.println("\nCargo: Secret�rio");
			System.out.println("O valor de aumento �: " + valorAumento);
			System.out.println("O novo sal�rio �: " + novoSalario);
		} else if (codigo == 3) {
			valorAumento = salarioAtual * 20 / 100;
			novoSalario = salarioAtual + valorAumento;
			System.out.println("\nCargo: Caixa");
			System.out.println("O valor de aumento �: " + valorAumento);
			System.out.println("O novo sal�rio �: " + novoSalario);
		} else if (codigo == 4) {
			valorAumento = salarioAtual * 10 / 100;
			novoSalario = salarioAtual + valorAumento;
			System.out.println("\nCargo: Gerente");
			System.out.println("O valor de aumento �: " + valorAumento);
			System.out.println("O novo sal�rio �: " + novoSalario);
		} else {
			novoSalario = salarioAtual;
			System.out.println("\nCargo: Diretor");
			System.out.println("Esse cargo n�o tem aumento! :(");
			System.out.println("O seu sal�rio �: " + novoSalario);
		}

		teclado.close();

	}

}
