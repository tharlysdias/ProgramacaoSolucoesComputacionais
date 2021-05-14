package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class SalarioAnulFunc {

	public static void main(String[] args) {
		int anoAtual;
		double salario = 1000.00D, novoSalario, percentual = 0.015D;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o ano atual: ");
		anoAtual = teclado.nextInt();
		
		novoSalario = salario + (percentual * salario);
		for (int i = 2015; i < anoAtual; i++) {
			novoSalario += percentual * novoSalario;
			percentual *= 2;
			System.out.println("No ano de " + anoAtual + " o salário do funcionário é: " + salario);
		}

		/*
		 * double salarioInicial = 1000.00D; double aumentoSalarial = 0.015D; int
		 * anoContratacao = 2015; int[] aAno = new int[10]; // int anoAtual =
		 * LocalDate.now().getYear(); int anoAtual; int contador = 0;
		 * 
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Informe o ano atual: "); anoAtual = teclado.nextInt();
		 * 
		 * for (int i = anoContratacao; i <= anoAtual; i++) { aAno[contador] = i;
		 * contador++; }
		 * 
		 * for (Integer i : aAno) { if (i == 0) { continue; } if (i == anoContratacao) {
		 * continue; }
		 * 
		 * salarioInicial += (salarioInicial * aumentoSalarial);
		 * 
		 * aumentoSalarial *= 2; }
		 * 
		 * System.out.println("O novo salario é: R$ " + salarioInicial);
		 */
	}

}
