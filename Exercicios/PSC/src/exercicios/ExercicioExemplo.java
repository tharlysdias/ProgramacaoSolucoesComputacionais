package exercicios;

import java.util.Scanner;

public class ExercicioExemplo {

	public static void main(String[] args) {
		
		int x;
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		x = dado.nextInt();
		
		switch (x) {
			case 1:
				System.out.println("N�mero 1");
				break;
			case 2:
				System.out.println("N�mero 2");
				break;
			default:
				System.out.println("Outro n�mero");
		}

	}

}
