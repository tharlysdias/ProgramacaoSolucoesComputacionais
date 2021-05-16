package vetores;

import java.util.Scanner;

/**
 * 2 – Faça um algoritmo que receba o nome de 10 pessoas e 
 * imprima o nome das 10 pessoas em ordem inversa a que foi lida.
 * 
 * @author Tharlys de Souza Dias <tharlys.dias@senior.com.br>
 *
 */
public class Vetor10Pessoas {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[10];

		// Entrada dos dados
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Informe o nome da pessoa na " + (i + 1) + "ª posição: ");
			nomes[i] = teclado.nextLine();
		}
		teclado.close();

		// Saída dos dados
		for (int i = nomes.length - 1; i >= 0; i--) {
			System.out.println("Resultado: " + nomes[i]);
		}
	}
}
