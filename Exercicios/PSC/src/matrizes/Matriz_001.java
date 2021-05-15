package matrizes;

import java.util.Scanner;

public class Matriz_001 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double preco[][] = new double[8][4];
		String loja[] = new String[8];
		String produto[] = new String[4];

		for (int i = 0; i < loja.length; i++) {
			System.out.print("Digite o nome da " + (i + 1) + "° loja: ");
			loja[i] = teclado.nextLine();

		}

		for (int i = 0; i < produto.length; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "° produto: ");
			produto[i] = teclado.nextLine();
		}

		System.out.println("Todos os preços dos produtos das lojas: ");
		for (int i = 0; i < loja.length; i++) {
			for (int j = 0; j < produto.length; j++) {
				System.out.println("Digite o preço do produto " + produto[j] + " da loja " + loja[i]);
				preco[i][j] = teclado.nextDouble();
			}
		}

		System.out.println("\nTodos os produtos das lojas com preços abaixo de R$120,00: \n");
		for (int i = 0; i < loja.length; i++) {
			for (int j = 0; j < produto.length; j++) {
				if (preco[i][j] <= 120) {
					System.out.println("O produto " + produto[j] + " da loja " + loja[i] + " custa: " + preco[i][j]);
				}
			}
		}
		teclado.close();
	}

}
