package exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		// Declara��o das vari�veis
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		// Entradas de dados
		System.out.print("Informe a primeira nota: ");
		nota1 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Informe a segunda nota: ");
		nota2 = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Informe a terceira nota: ");
		nota3 = Double.parseDouble(leitor.nextLine());

		// Processamento
		media = (nota1 + nota2 + nota3)/3;
		
		// Sa�da
		if (media >= 7) {
			System.out.println("Voc� est� Aprovado!");
		} else {
			System.out.println("Voc� est� Reprovado!");
		}

	}

}
