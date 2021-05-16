package vetores;

import java.util.Scanner;

public class Vetor_MediaAluno {

	public static void main(String[] args) {
		
		/**
		 * 3. Faça um código que recebe o nome e a média de 5 alunos. 
		 * Ao final apresente a média da classe e o nome dos alunos acima da média calculada.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int quantidade = 5;
		String[] alunos = new String[quantidade];
		Double[] medias = new Double[quantidade];
		Double calculoDaMedia = 0D;
		Double mediaDaClasse = 0D;

		// Entrada dos dados
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Informe o nome do aluno na " + (i + 1) + "ª posição: ");
			alunos[i] = inputText();
			System.out.print("Informe a média do aluno na " + (i + 1) + "ª posição: ");
			medias[i] = teclado.nextDouble();
		}
		teclado.close();

		// Processamento e Saída
		for (int i = 0; i < medias.length; i++) {
			calculoDaMedia += medias[i];
		}
		
		mediaDaClasse = calculoDaMedia / medias.length;
		
		System.out.println("\nMédia da classe: " + mediaDaClasse);
		for (int i = 0; i < medias.length; i++) {
			if (medias[i] > mediaDaClasse) {
				System.out.println("Nome: " + alunos[i]);
			}
		}
		
	}
	
	public static String inputText() {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		return texto;
	}

}
