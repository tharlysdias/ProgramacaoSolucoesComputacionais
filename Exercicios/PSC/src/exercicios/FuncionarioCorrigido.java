package exercicios;

import java.util.Scanner;

public class FuncionarioCorrigido {

	public static void main(String[] args) {

		int n;
		double sal, novo_sal, aumento;
		String nome_fun;
		double indice;
		String cargo;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do funcion�rio: ");
		nome_fun = teclado.next();

		System.out.println("Informe o sal�rio do funcion�rio " + nome_fun + ": ");
		sal = teclado.nextDouble();

		System.out.println("Digite o n�mero correspondente ao cargo do funcion�rio\n" + "1 - Escrituario\n"
				+ "2 - Secret�rio\n" + "3 - Caixa\n" + "4 - Gerente\n" + "5 - Diretor\n");
		n = teclado.nextInt();

		switch (n) {
		case 1:
			indice = 0.5;
			cargo = "Escrituario";
			break;

		case 2:
			indice = 0.35;
			cargo = "Secretario";
			break;

		case 3:
			indice = 0.20;
			cargo = "Caixa";
			break;

		case 4:
			indice = 0.10;
			cargo = "Gerente";
			break;

		case 5:
			indice = 0;
			cargo = "Diretor";
			break;

		default:
			System.out.println("N�mero digitado inv�lido!");
			indice = -1;
			cargo = "";
			break;
		}

		if (n == 5) {
			System.out.println("O funcion�rio " + nome_fun + ", do cargo " + cargo + "\n"
					+ "N�o recebe aumento no sal�rio, ficando com seu sal�rio atual: R$" + sal);
		} else if (n >= 1 && n <= 4) {
			aumento = sal * indice;
			novo_sal = sal + aumento;
			System.out.println("O funcion�rio " + nome_fun + ", do " + cargo + "\n" + "Recebe aumento no sal�rio de "
					+ indice * 100 + " = R$" + aumento + "\n" + "Do sal�rio atual: R$" + sal
					+ ", � feito um reajuste para: " + novo_sal);
		}

	}

}