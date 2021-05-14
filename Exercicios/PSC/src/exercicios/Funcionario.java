package exercicios;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {

		// Declara��o das vari�veis
		int codigo;
		double salarioAtual;
		double valorAumento;
		double novoSalario;

		// Entradas de dados
		Scanner teclado = new Scanner(System.in);

		System.out.println("Bem-vindo ao sistema de departamento pessoal\n");
		
		System.out.print("Digite o c�digo correspondente ao cargo do funcion�rio: \n"
				+ "1 - Escritur�rio\n"
				+ "2 - Secret�rio\n"
				+ "3 - Caixa\n"
				+ "4 - Gerente\n"
				+ "5 - Diretor\n");
		codigo = teclado.nextInt();
		
		System.out.print("Digite o sal�rio atual do funcion�rio: ");
		salarioAtual = teclado.nextDouble();
		
		// Processamento e Sa�da
		switch (codigo) {
			case 1:
				valorAumento = salarioAtual * 50/100;
				novoSalario = salarioAtual + valorAumento;
				System.out.println("\nCargo: Escritur�rio");
				System.out.println("O valor de aumento �: " + valorAumento);
				System.out.println("O novo sal�rio �: " + novoSalario);
				break;
			case 2:
				valorAumento = salarioAtual * 35/100;
				novoSalario = salarioAtual + valorAumento;
				System.out.println("\nCargo: Secret�rio");
				System.out.println("O valor de aumento �: " + valorAumento);
				System.out.println("O novo sal�rio �: " + novoSalario);
				break;
			case 3:
				valorAumento = salarioAtual * 20/100;
				novoSalario = salarioAtual + valorAumento;
				System.out.println("\nCargo: Caixa");
				System.out.println("O valor de aumento �: " + valorAumento);
				System.out.println("O novo sal�rio �: " + novoSalario);
				break;
			case 4:
				valorAumento = salarioAtual * 10/100;
				novoSalario = salarioAtual + valorAumento;
				System.out.println("\nCargo: Gerente");
				System.out.println("O valor de aumento �: " + valorAumento);
				System.out.println("O novo sal�rio �: " + novoSalario);
				break;
			case 5:
				novoSalario = salarioAtual;
				System.out.println("\nCargo: Diretor");
				System.out.println("Esse cargo n�o tem aumento! :(");
				System.out.println("O seu sal�rio �: " + novoSalario);
				break;
			default:
				System.out.println("Voc� informou um c�digo inv�lido!");
		}
		
		teclado.close();

	}

}
