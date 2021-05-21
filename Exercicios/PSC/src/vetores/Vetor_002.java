package vetores;

import java.util.Scanner;

public class Vetor_002 {

	public static void main(String[] args) {

		/**
		 * Faça um programa que preencha um vetor com os modelos de cinco carros
		 * (exemplos de modelos: Fusca, Gol, Vectra, etc). Carregue outro vetor com o
		 * consumo desses carros, isto é, quantos quilômetros cada um deles faz com um
		 * litro de combustível. Calcule e mostre: 
		 * 
		 * o modelo de carro mais econômico; 
		 * 
		 * e quantos litros de combustível cada um dos carros cadastrados consome para
		 * percorrer uma distância de 1.000 km.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		String modeloCarro[] = new String[5];
		double consumoCarro[] = new double[5];
		
		for (int i = 0; i < consumoCarro.length; i++) {
			System.out.print("Informe o modelo do " + (i+1) + "º carro: ");
			modeloCarro[i] = teclado.nextLine();

			System.out.print("Informe o preço do objeto para a posição " + (i+1) + ": ");
			consumoCarro[i] = teclado.nextDouble();
		}
		
		teclado.close();

	}

}
