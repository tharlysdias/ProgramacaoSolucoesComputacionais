package vetores;

import java.util.Scanner;

public class VetorImpar {

	public static void main(String[] args) {

		int contadorPar = 0;
		int contadorImpar = 0;

		Scanner teclado = new Scanner(System.in);

		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + " número: ");
			vetor[i] = teclado.nextInt();

			if (vetor[i] % 2 == 0) {
				contadorPar++;
				continue;
			}

			contadorImpar++;

		}

		System.out.println("Quantidade de números par: " + contadorPar);
		System.out.println("Quantidade de números impar: " + contadorImpar);

		teclado.close();
	}

}
