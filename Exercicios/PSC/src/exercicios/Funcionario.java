package exercicios;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {

		// Declaração das variáveis
		int codigo;
		double salarioAtual;
		double valorAumento;
		double novoSalario;

		// Entradas de dados
		Scanner teclado = new Scanner(System.in);

		System.out.println("Bem-vindo ao sistema de departamento pessoal\n");
		
		System.out.print("Digite o código correspondente ao cargo do funcionário: \n"
				+ "1 - Escriturário\n"
				+ "2 - Secretário\n"
				+ "3 - Caixa\n"
				+ "4 - Gerente\n"
				+ "5 - Diretor\n");
		codigo = teclado.nextInt();
		
		System.out.print("Digite o salário atual do funcionário: ");
		salarioAtual = teclado.nextDouble();
		
		// Processamento e Saída
		switch (codigo) {
			case 1:
				valorAumento = salarioAtual * 50/100;
				novoSalario = salarioAtual + valorAumento;
				System.out.println("\nCargo: Escriturário");
				System.out.println("O valor de aumento é: " + valorAumento);
				System.out.println("O novo salário é: " + novoSalario);
				break;
			case 2:
				valorAumento = salarioAtual * 35/100;
				novoSalario = salarioAtual + valorAumento;
				System.out.println("\nCargo: Secretário");
				System.out.println("O valor de aumento é: " + valorAumento);
				System.out.println("O novo salário é: " + novoSalario);
				break;
			case 3:
				valorAumento = salarioAtual * 20/100;
				novoSalario = salarioAtual + valorAumento;
				System.out.println("\nCargo: Caixa");
				System.out.println("O valor de aumento é: " + valorAumento);
				System.out.println("O novo salário é: " + novoSalario);
				break;
			case 4:
				valorAumento = salarioAtual * 10/100;
				novoSalario = salarioAtual + valorAumento;
				System.out.println("\nCargo: Gerente");
				System.out.println("O valor de aumento é: " + valorAumento);
				System.out.println("O novo salário é: " + novoSalario);
				break;
			case 5:
				novoSalario = salarioAtual;
				System.out.println("\nCargo: Diretor");
				System.out.println("Esse cargo não tem aumento! :(");
				System.out.println("O seu salário é: " + novoSalario);
				break;
			default:
				System.out.println("Você informou um código inválido!");
		}
		
		teclado.close();

	}

}
