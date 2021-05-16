package vetores;

import java.util.Scanner;

public class Vetor_MediaAluno {

	public static void main(String[] args) {
		
		/**
		 * 3. Fa�a um c�digo que recebe o nome e a m�dia de 5 alunos. 
		 * Ao final apresente a m�dia da classe e o nome dos alunos acima da m�dia calculada.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int quantidade = 5;
		String[] alunos = new String[quantidade];
		Double[] medias = new Double[quantidade];
		Double calculoDaMedia = 0D;
		Double mediaDaClasse = 0D;

		// Entrada dos dados
		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Informe o nome do aluno na " + (i + 1) + "� posi��o: ");
			alunos[i] = inputText();
			System.out.print("Informe a m�dia do aluno na " + (i + 1) + "� posi��o: ");
			medias[i] = teclado.nextDouble();
		}
		teclado.close();

		// Processamento e Sa�da
		for (int i = 0; i < medias.length; i++) {
			calculoDaMedia += medias[i];
		}
		
		mediaDaClasse = calculoDaMedia / medias.length;
		
		System.out.println("\nM�dia da classe: " + mediaDaClasse);
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
