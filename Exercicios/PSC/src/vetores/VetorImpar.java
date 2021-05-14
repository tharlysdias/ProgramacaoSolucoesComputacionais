package vetores;

import java.util.Scanner;

public class VetorImpar {

	public static void main(String[] args) {

		int contadorPar = 0;
		int contadorImpar = 0;

		Scanner teclado = new Scanner(System.in);

		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + " n�mero: ");
			vetor[i] = teclado.nextInt();

			if (vetor[i] % 2 == 0) {
				contadorPar++;
				continue;
			}

			contadorImpar++;

		}

		System.out.println("Quantidade de n�meros par: " + contadorPar);
		System.out.println("Quantidade de n�meros impar: " + contadorImpar);

		teclado.close();
	}

}
