package exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		// Declaração das variáveis
		int base;
		int altura;
		int area;
		
		// Entradas de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a base do triângulo: ");
		base = teclado.nextInt();
		
		System.out.print("Digite à altura do triângulo: ");
		altura = teclado.nextInt();
		
		// Processamento
		area = (base * altura) / 2;
		
		// Saída
		System.out.println("Área do triângulo é: " + area);
		
		teclado.close();

	}

}
