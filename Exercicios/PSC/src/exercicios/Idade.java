package exercicios;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		//Declaração das variáveis
		int anoNascimento;
		int anoAtual;
		
		//Entradas de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = leitor.nextInt();
		
		LocalDateTime date = LocalDateTime.now();
		anoAtual = date.getYear();
		
		//Processamento e Saída
		System.out.println("Você tem " + (anoAtual - anoNascimento) + " anos de idade.");
		
		leitor.close();

	}

}
