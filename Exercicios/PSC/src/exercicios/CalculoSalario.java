package exercicios;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {

		// Declara��o das Vari�veis
		int opcaoDesejada;

		// Entradas de dados
		System.out.println("Digite a op��o desejada");
		System.out.println("1. Imposto");
		System.out.println("2. Novo Sal�rio");
		System.out.println("3. Classifi��o");

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
			System.out.println("Op��o invalida");
			break;
		}

	}

	public static void imposto() {

		double Salario, valorImposto;
		int percentualImposto;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor do seu sal�rio");
		Salario = leitor.nextDouble();

		if (Salario < 500)
			percentualImposto = 5;
		else if (Salario > 500 & Salario <= 850)
			percentualImposto = 10;
		else
			percentualImposto = 15;

		valorImposto = (Salario * percentualImposto) / 100;

		System.out.println("O valor do imposto �: R$" + valorImposto);

	}

	public static void novoSalario() {
		double valorSalario, aumentoSal, novoSalario;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor do seu sal�rio");
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

		System.out.println("O valor do novo sal�rio �: R$" + novoSalario);
		System.out.println("O valor do aumento do novo sal�rio �: R$" + aumentoSal);

	}

	public static void classificacao() {
		double salarioClassificacao;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor do seu sal�rio");
		salarioClassificacao = leitor.nextDouble();

		if (salarioClassificacao <= 700)
			System.out.println("Voc� est� sendo mal remunerado.");
		else
			System.out.println("Voc� est� sendo bem remunerado.");

	}

}
