package vetores;

import java.util.Scanner;

public class Vetor_FilaPilha {

	public static void main(String[] args) {

		/**
		 * O programa deverá armazenar o nome, idade e descrição breve do atendimento para o usuário
		 * Deverá ser apresentado um menu a cada iteração:
		 * 1 - Incluir Paciente;
		 * 2 - Atender Paciente;
		 * 3 - Sair.
		 * O programa poderá armazenar até 20 pacientes.
		 * Deverá haver uma opção para o usuário solicitar qual será o paciente atendido
		 * 1. Quando essa opção for selecionada então o paciente deverá ser removido da fila de atendimento;
		 * 2. A fila deverá ser reorganizada.
		 */
		int tamanhoDoVetor = 20;
		String nome[] = new String[tamanhoDoVetor];
		Integer idade[] = new Integer[tamanhoDoVetor];
		String descricao[] = new String[tamanhoDoVetor];
		Scanner teclado = new Scanner(System.in);
		String nomeEscolhido;
		int opcao = 0;
		
		while (opcao != 4) {
			for (int i = 0; i < nome.length; i++) {
				menu();
				opcao = teclado.nextInt();
				if (opcao == 1) {
					System.out.print("Informe o nome do " + (i+1) + "º usuário: ");
					nome[i] = inputText();
					System.out.print("Informe a idade do " + (i+1) + "º usuário: ");
					idade[i] = teclado.nextInt();	
					System.out.print("Informe a descrição do " + (i+1) + "º atendimento: ");
					descricao[i] = inputText();
				} else if (opcao == 2) {
					System.out.print("Informe o nome de qual será o paciente atendido? ");
					nomeEscolhido = inputText();
					
					int contador = 0;
					for (int j = 1; j < nome.length; j++) {
						if (nomeEscolhido.equalsIgnoreCase(nome[contador])) {
							contador += 1;
						}
						nome[contador-1] = nome[contador];
						idade[contador-1] = idade[contador];
						descricao[contador-1] = descricao[contador];
						System.out.println("Nome: " + nome[contador]);
						System.out.println("Idade: " + idade[contador]);
						System.out.println("Descrição: " + descricao[contador]);
						contador += 1;
						if (contador == nome.length) {
							nome[contador - 1] = "";
							idade[contador - 1] = null;
							descricao[contador - 1] = "";
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
	
	public static void menu() {
		System.out.println("\nMenu de interação\n");
		System.out.println("1 - Incluir Paciente;");
		System.out.println("2 - Atender Paciente;");
		System.out.println("3 - Sair.\n");
	}
	
	public static String inputText() {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		return texto;
	}

}
