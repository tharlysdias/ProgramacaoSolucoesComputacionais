package exercicios;

import java.util.Scanner;

public class SalarioBonificacao {

	public static void main(String[] args) {

		// Declara��o das vari�veis
		double salario;
		double bonificacao;
		double auxilio;
		double novoSalario;

		// Entradas de dados
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o sal�rio inicial do funcion�rio: ");
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

		// Sa�da
		System.out.println("O seu novo sal�rio �: " + novoSalario);

		teclado.close();
	}

}
