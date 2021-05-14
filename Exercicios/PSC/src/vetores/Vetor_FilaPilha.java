package vetores;

import java.util.Scanner;

public class Vetor_FilaPilha {

	public static void main(String[] args) {

		/**
		 * O programa dever� armazenar o nome, idade e descri��o breve do atendimento para o usu�rio
		 * Dever� ser apresentado um menu a cada itera��o:
		 * 1 - Incluir Paciente;
		 * 2 - Atender Paciente;
		 * 3 - Sair.
		 * O programa poder� armazenar at� 20 pacientes.
		 * Dever� haver uma op��o para o usu�rio solicitar qual ser� o paciente atendido
		 * 1. Quando essa op��o for selecionada ent�o o paciente dever� ser removido da fila de atendimento;
		 * 2. A fila dever� ser reorganizada.
		 */
		String nome[] = new String[20];
		int idade[] = new int[20];
		String descricao[] = new String[20];
		Scanner teclado = new Scanner(System.in);
		String nomeEscolhido;
		int opcao;
		
		for (int i = 0; i < nome.length; i++) {
			menu();
			opcao = teclado.nextInt();
			if (opcao == 1) {
				System.out.print("Informe o nome do " + (i+1) + "� usu�rio: ");
				nome[i] = inputText();
				System.out.print("Informe a idade do " + (i+1) + "� usu�rio: ");
				idade[i] = teclado.nextInt();	
				System.out.print("Informe a descri��o do " + (i+1) + "� atendimento: ");
				descricao[i] = inputText();
			} else if (opcao == 2) {
				System.out.println("Informe o nome de qual ser� o paciente atendido?");
				nomeEscolhido = inputText();
				for (int j = 0; j < descricao.length; j++) {
					if (nomeEscolhido.equalsIgnoreCase(nome[j])) {
						i -= 1;
					}
				}
			} else if (opcao == 3) {
				System.out.println("Voc� saiu do sistema!");
				break;
			} else {
				System.out.println("\nOp��o inv�lida... Tente novamente!");
				menu();
				opcao = teclado.nextInt();
			}
		}
		teclado.close();
	}
	
	public static void menu() {
		System.out.println("\nMenu de intera��o\n");
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
