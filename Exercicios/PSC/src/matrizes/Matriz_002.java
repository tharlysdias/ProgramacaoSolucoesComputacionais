package matrizes;

import java.util.Scanner;

public class Matriz_002 {
	
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
		Scanner teclado = new Scanner(System.in);
		int numeroTemp = teclado.nextInt();
		return numeroTemp;
	}

	public static void main(String[] args) {

//		int matrizA[][] = { { 5, 4 }, { 0, 2 }, { 1, -1 } };
//		int matrizB[][] = { { 0, -2 }, { 5, -3 }, { -1, 0 } };
//		int matrizC[][] = new int[3][2];

//		System.out.println("Todos os preços dos produtos das lojas: ");
//		for (int i = 0; i < matrizB.length; i++) {
//			for (int j = 0; j < matrizA.length; j++) {
//				System.out.println("Digite o preço do produto " + matrizA[j] + " da loja " + matrizB[i]);
//				matrizC[i][j] = teclado.nextDouble();
//			}
//		}
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
//			}
//		}
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("\n");
//			for (int j = 0; j < 2; j++) {
//				System.out.print("\t" + matrizC[i][j]);
//			}
//		}
		
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
	}

}
