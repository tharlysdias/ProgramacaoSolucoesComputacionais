package exercicios;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		//Declara��o das vari�veis
		int anoNascimento;
		int anoAtual;
		
		//Entradas de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = leitor.nextInt();
		
		LocalDateTime date = LocalDateTime.now();
		anoAtual = date.getYear();
		
		//Processamento e Sa�da
		System.out.println("Voc� tem " + (anoAtual - anoNascimento) + " anos de idade.");
		
		leitor.close();

	}

}
