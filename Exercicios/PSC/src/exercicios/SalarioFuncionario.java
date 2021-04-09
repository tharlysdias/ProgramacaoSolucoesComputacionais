package exercicios;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		// Declaração das variáveis
		String nome;
		int horas;
		int dependente;
		double salarioBruto;
		double salarioLiquido;
		double valorINSS;
		double valorIR;
		
		// Entradas de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o nome do funcionario: ");
		nome = teclado.nextLine();
		
		System.out.print("Informe o número de horas trabalhadas: ");
		horas = teclado.nextInt();
		
		System.out.print("Informe o número de dependentes: ");
		dependente = teclado.nextInt();
		
		// Processamento
		salarioBruto = (horas * 32.00) + (dependente * 40.00);
		valorINSS = salarioBruto * 8.5/100;
		valorIR = salarioBruto * 5/100;
		salarioLiquido = salarioBruto - valorINSS - valorIR;
		
		// Saída
		System.out.println("Nome: " + nome);
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Valor do desconto de INSS: " + valorINSS);
		System.out.println("Valor de desconto de IR: " + valorIR);
		System.out.println("Valor liquido do salário deste funcionário: " + salarioLiquido);

		teclado.close();
	}

}
