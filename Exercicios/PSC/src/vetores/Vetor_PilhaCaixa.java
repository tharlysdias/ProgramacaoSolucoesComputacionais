package vetores;

import java.util.Scanner;

public class Vetor_PilhaCaixa {
	
	/**
	 * Faça um programa para controlar uma pilha de caixas.
	 * Cada caixa tem um identificador (CX1, CX2, CX3), 
	 * As medidas da altura, largura, profundidade e um atributo que diga se o conteúdo é frágil.
	 * O sistema permitirá o empilhamento máximo de 10 caixas.
	 * Será possível empilhar e desempilhar caixas.
	 */

	public static void menu() {
		System.out.println("\nMenu de controle da pilha de caixas\n");
		System.out.println("1 - Empilhar Caixa;");
		System.out.println("2 - Desempilhar Paciente;");
		System.out.println("3 - Sair.\n");
	}
	
	public static String inputText() {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		return texto;
	}

	public static void main(String[] args) {
		
		int quantidadeDeCaixas = 10;
		String caixas[] = new String[quantidadeDeCaixas];
		String altura[] = new String[quantidadeDeCaixas];
		String largura[] = new String[quantidadeDeCaixas];
		String profundidade[] = new String[quantidadeDeCaixas];
		String atributo[] = new String[quantidadeDeCaixas];
		int opcao = 0;
		String caixaEscolhida;
		Scanner teclado = new Scanner(System.in);
		
		while (opcao != 4) {
			for (int i = 0; i < caixas.length; i++) {
				menu();
				opcao = teclado.nextInt();
				if (opcao == 1) {
					System.out.print("Informe o identificador da " + (i+1) + "ª caixa: ");
					caixas[i] = inputText();
					System.out.print("Informe a altura da " + (i+1) + "ª caixa: ");
					altura[i] = inputText();	
					System.out.print("Informe a descrição da " + (i+1) + "ª caixa: ");
					largura[i] = inputText();
					System.out.print("Informe a profundidade da " + (i+1) + "ª caixa: ");
					profundidade[i] = inputText();
					System.out.print("Informe um atributo da " + (i+1) + "ª caixa: ");
					atributo[i] = inputText();
				} else if (opcao == 2) {
					caixaEscolhida = caixas[0];
					
					int contador = 0;
					for (int j = 1; j < caixas.length; j++) {
						if (caixaEscolhida.equalsIgnoreCase(caixas[contador])) {
							contador += 1;
						}
						caixas[contador-1] = caixas[contador];
						altura[contador-1] = altura[contador];
						largura[contador-1] = largura[contador];
						profundidade[contador-1] = profundidade[contador];
						atributo[contador-1] = atributo[contador];
						
						System.out.println("Caixa " + (j + 1) + "\tIdentificador: " + caixas[contador] 
								+ "\tAltura: " + altura[contador] 
										+ "\tLargura: " + largura[contador] 
												+ "\tProfundidade: " + profundidade[contador]
														+ "\tAtributo: " + atributo[contador]);
						contador += 1;
						if (contador == caixas.length) {
							caixas[contador - 1] = "";
							altura[contador - 1] = "";
							largura[contador - 1] = "";
							profundidade[contador - 1] = "";
							atributo[contador - 1] = "";
						}
					}
				} else if (opcao == 3) {
					System.out.println("Você saiu do sistema!");
					opcao = 4;
					break;
				} else {
					System.out.println("\nOpção inválida... Tente novamente!");
					menu();
					opcao = teclado.nextInt();
				}
			}
		}
		teclado.close();
	}

}
