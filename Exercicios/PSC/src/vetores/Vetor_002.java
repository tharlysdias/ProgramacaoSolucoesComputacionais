package vetores;

import java.util.Scanner;

public class Vetor_002 {

	public static void main(String[] args) {

		/**
		 * Fa�a um programa que preencha um vetor com os modelos de cinco carros
		 * (exemplos de modelos: Fusca, Gol, Vectra, etc). Carregue outro vetor com o
		 * consumo desses carros, isto �, quantos quil�metros cada um deles faz com um
		 * litro de combust�vel. Calcule e mostre: 
		 * 
		 * o modelo de carro mais econ�mico; 
		 * 
		 * e quantos litros de combust�vel cada um dos carros cadastrados consome para
		 * percorrer uma dist�ncia de 1.000 km.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		String modeloCarro[] = new String[5];
		double consumoCarro[] = new double[5];
		
		for (int i = 0; i < consumoCarro.length; i++) {
			System.out.print("Informe o modelo do " + (i+1) + "� carro: ");
			modeloCarro[i] = teclado.nextLine();

			System.out.print("Informe o pre�o do objeto para a posi��o " + (i+1) + ": ");
			consumoCarro[i] = teclado.nextDouble();
		}
		
		teclado.close();

	}

}
