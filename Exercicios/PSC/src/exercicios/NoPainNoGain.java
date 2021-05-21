package exercicios;

import java.util.Scanner;

public class NoPainNoGain {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int idade[] = new int[55];
		double peso[] = new double[55];
		double altura[] = new double[55];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("Informe a idade do jogador: ");
				idade[j] = leitor.nextInt();
				
				System.out.print("Informe o peso do jogador: ");
				peso[j] = leitor.nextDouble();
				
				System.out.print("Informe a altura do jogador: ");
				altura[j] = leitor.nextDouble();	
			}
		}
	}

}
