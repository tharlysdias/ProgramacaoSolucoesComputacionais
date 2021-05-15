package matrizes;

import java.util.Scanner;

public class Matriz_002 {
	
	static Scanner teclado;

	/**
	 * Função para ler matriz A e B
	 * 
	 */
	public static int[][] lerMatriz() {
		int matrizTemp[][] = new int[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Digite o número da posição " + (j + 1) + "º que compõe a matrizTemp: ");
				matrizTemp[i][j] = numero();
			}
		}
		return matrizTemp;
	}

	public static int numero() {
		teclado = new Scanner(System.in);
		int numeroTemp = teclado.nextInt();
		return numeroTemp;
	}

	public static void matrizes() {
		int matrizA[][] = { { 5, 4 }, { 0, 2 }, { 1, -1 } };
		int matrizB[][] = { { 0, -2 }, { 5, -3 }, { -1, 0 } };
		int matrizC[][] = new int[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("\n");
			for (int j = 0; j < 2; j++) {
				System.out.print("\t" + matrizC[i][j]);
			}
		}
	}

	public static void main(String[] args) {

		int opcao;
		System.out.println("Boas vindas, você está no sistema de matrizes!");
		System.out.print("Digite 0 para matrizes preenchidas e 1 para preencher as matrizes: ");
		opcao = numero();
		if (opcao == 0) {
			matrizes();
		} else if (opcao == 1) {
			int matriz1[][] = lerMatriz();
			int matriz2[][] = lerMatriz();
			int matriz3[][] = new int[3][2];

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}

			for (int i = 0; i < 3; i++) {
				System.out.println("\n");
				for (int j = 0; j < 2; j++) {
					System.out.print("\t" + matriz3[i][j]);
				}
			}
		} else {
			System.out.println("Opção errada seu noob!!!");
		}
		teclado.close();
	}

}
