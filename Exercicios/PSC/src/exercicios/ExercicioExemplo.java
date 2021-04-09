package exercicios;

import java.util.Scanner;

public class ExercicioExemplo {

	public static void main(String[] args) {
		
		int x;
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		x = dado.nextInt();
		
		switch (x) {
			case 1:
				System.out.println("Número 1");
				break;
			case 2:
				System.out.println("Número 2");
				break;
			default:
				System.out.println("Outro número");
		}

	}

}
