package exercicios;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {

		// Declaração das Variáveis
		int opcaoDesejada;

		// Entradas de dados
		System.out.println("Digite a opção desejada");
		System.out.println("1. Imposto");
		System.out.println("2. Novo Salário");
		System.out.println("3. Classifição");

		Scanner leitor = new Scanner(System.in);
		opcaoDesejada = leitor.nextInt();

		switch (opcaoDesejada) {

		case 1:
			CalculoSalario.imposto();
			break;

		case 2:
			CalculoSalario.novoSalario();
			break;

		case 3:
			CalculoSalario.classificacao();
			break;

		default:
			System.out.println("Opção invalida");
			break;
		}

	}

	public static void imposto() {

		double Salario, valorImposto;
		int percentualImposto;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor do seu salário");
		Salario = leitor.nextDouble();

		if (Salario < 500)
			percentualImposto = 5;
		else if (Salario > 500 & Salario <= 850)
			percentualImposto = 10;
		else
			percentualImposto = 15;

		valorImposto = (Salario * percentualImposto) / 100;

		System.out.println("O valor do imposto é: R$" + valorImposto);

	}

	public static void novoSalario() {
		double valorSalario, aumentoSal, novoSalario;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor do seu salário");
		valorSalario = leitor.nextDouble();

		if (valorSalario > 1500)
			aumentoSal = 25;
		else if (valorSalario > 750 & valorSalario <= 1500)
			aumentoSal = 50;
		else if (valorSalario > 450 & valorSalario <= 750)
			aumentoSal = 75;
		else
			aumentoSal = 100;

		novoSalario = (valorSalario + aumentoSal);

		System.out.println("O valor do novo salário é: R$" + novoSalario);
		System.out.println("O valor do aumento do novo salário é: R$" + aumentoSal);

	}

	public static void classificacao() {
		double salarioClassificacao;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor do seu salário");
		salarioClassificacao = leitor.nextDouble();

		if (salarioClassificacao <= 700)
			System.out.println("Você está sendo mal remunerado.");
		else
			System.out.println("Você está sendo bem remunerado.");

	}

}
