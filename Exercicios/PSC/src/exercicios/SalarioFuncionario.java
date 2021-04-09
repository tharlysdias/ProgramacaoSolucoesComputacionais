package exercicios;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis
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
		
		System.out.print("Informe o n�mero de horas trabalhadas: ");
		horas = teclado.nextInt();
		
		System.out.print("Informe o n�mero de dependentes: ");
		dependente = teclado.nextInt();
		
		// Processamento
		salarioBruto = (horas * 32.00) + (dependente * 40.00);
		valorINSS = salarioBruto * 8.5/100;
		valorIR = salarioBruto * 5/100;
		salarioLiquido = salarioBruto - valorINSS - valorIR;
		
		// Sa�da
		System.out.println("Nome: " + nome);
		System.out.println("Sal�rio Bruto: " + salarioBruto);
		System.out.println("Valor do desconto de INSS: " + valorINSS);
		System.out.println("Valor de desconto de IR: " + valorIR);
		System.out.println("Valor liquido do sal�rio deste funcion�rio: " + salarioLiquido);

		teclado.close();
	}

}
