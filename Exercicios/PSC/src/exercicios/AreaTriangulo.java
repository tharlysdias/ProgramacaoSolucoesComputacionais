package exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis
		int base;
		int altura;
		int area;
		
		// Entradas de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a base do tri�ngulo: ");
		base = teclado.nextInt();
		
		System.out.print("Digite � altura do tri�ngulo: ");
		altura = teclado.nextInt();
		
		// Processamento
		area = (base * altura) / 2;
		
		// Sa�da
		System.out.println("�rea do tri�ngulo �: " + area);
		
		teclado.close();

	}

}
