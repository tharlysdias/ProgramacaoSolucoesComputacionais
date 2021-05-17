package vetores;

import java.util.Scanner;

public class Vetor_10AlunosIMC {

	public static void main(String[] args) {
		/**
		 * 7 – Faça um algoritmo que leia os seguintes dados de 10 alunos. 
		 * Dados que deverão serem lidos: Nome, Idade, Peso e Altura. 
		 * Calcule o IMC (Índice de massa corporal) de cada aluno 
		 * Ao final exiba as seguintes informações:
		 * Aluno mais baixo
		 * Aluno mais alto
		 * Aluno com maior peso
		 * Aluno com menor peso
		 * Quantidade de Alunos em cada uma das faixas do IMC 
		 * (Magreza, Normal, Sobrepeso, Obesidade, Obesidade Grave)
		 */
		
		// Declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		int quantidadeAlunos = 10;
		String nomes[] = new String[quantidadeAlunos];
		Integer idades[] = new Integer[quantidadeAlunos];
		Double pesos[] = new Double[quantidadeAlunos];
		Double alturas[] = new Double[quantidadeAlunos];
		String alunoBaixo = null, alunoAlto = null, alunoMenorPeso = null, alunoMaiorPeso = null;
		int alunoBaixo1 = 0, alunoAlto1 = 0, alunoMenorPeso1 = 0, alunoMaiorPeso1 = 0;
		int quantidadeMagreza = 0, quantidadeNormal = 0, quantidadeSobrepeso = 0, quantidadeObesidade = 0, quantidadeObesidadeGrave = 0;
		Double imc;
		
		// Entrada de dados
		for (int i = 0; i < nomes.length; i++) {
			System.out.println((i+1) + "º Nome: ");
			nomes[i] = inputText();
			System.out.println((i+1) + "ª Idade: ");
			idades[i] = teclado.nextInt();
			System.out.println((i+1) + "º Peso: ");
			pesos[i] = teclado.nextDouble();
			System.out.println((i+1) + "ª Altura: ");
			alturas[i] = teclado.nextDouble();
		}
		
		// Processamento
		for (int i = 0; i < nomes.length; i++) {
			if (alunoBaixo1 >= alturas[i]) {
				alunoBaixo = nomes[i];
			}
			if (alunoAlto1 <= alturas[i]) {
				alunoAlto = nomes[i];
			}
			if (alunoMenorPeso1 >= pesos[i]) {
				alunoMenorPeso = nomes[i];
			}
			if (alunoMenorPeso1 <= pesos[i]) {
				alunoMaiorPeso = nomes[i];
			}
			if ((pesos[i])/(alturas[i]*alturas[i]) <= 18.5) {
				quantidadeMagreza++;
			}
			if ((pesos[i])/(alturas[i]*alturas[i]) == 18.5) {
				quantidadeMagreza++;
			}
			if ((pesos[i])/(alturas[i]*alturas[i]) == 18.5) {
				quantidadeMagreza++;
			}
			if ((pesos[i])/(alturas[i]*alturas[i]) == 18.5) {
				quantidadeMagreza++;
			}
			imc=(pesos[i])/(alturas[i]*alturas[i]);
		}
		
		// Saída
		System.out.println("\nAluno mais baixo: " + alunoBaixo);
		System.out.println("Aluno mais alto: " + alunoAlto);
		System.out.println("Aluno com maior peso: " + alunoMenorPeso);
		System.out.println("Aluno com menor peso: " + alunoMaiorPeso);
		System.out.println("IMC - Magreza: " + quantidadeMagreza);
		System.out.println("IMC - Normal: " + quantidadeNormal);
		System.out.println("IMC - Sobrepeso: " + quantidadeSobrepeso);
		System.out.println("IMC - Obesidade: " + quantidadeObesidade);
		System.out.println("IMC - Obesidade Grave: " + quantidadeObesidadeGrave);

		teclado.close();
	}
	
	public static String inputText() {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		return texto;
	}
	
}
