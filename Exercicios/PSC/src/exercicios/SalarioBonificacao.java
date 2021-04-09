package exercicios;

import java.util.Scanner;

public class SalarioBonificacao {

	public static void main(String[] args) {

		// Declaração das variáveis
		double salario;
		double bonificacao;
		double auxilio;
		double novoSalario;

		// Entradas de dados
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o salário inicial do funcionário: ");
		salario = teclado.nextDouble();

		// Processamento
		if (salario <= 800) {
			bonificacao = salario * 5/100;
		} else if ((salario > 800) && (salario <= 1_300)) {
			bonificacao = salario * 12/100;
		} else {
			bonificacao = 0;
		}
		
		if (salario <= 900) {
			auxilio = 150;
		} else {
			auxilio = 100;
		}
		
		novoSalario = salario + bonificacao + auxilio;

		// Saída
		System.out.println("O seu novo salário é: " + novoSalario);

		teclado.close();
	}

}
