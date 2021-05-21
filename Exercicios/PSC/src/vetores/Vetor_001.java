package vetores;

import java.util.Scanner;

public class Vetor_001 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double salario = 545.00D;
		double acrescido = 0.5D;
		double valorTotalVendas, totalGeral, comissao;
		int ind, maior;
		
		double precos[] = new double[2];
		int quantidadeVendidaObjeto[] = new int[2]; 
		
		totalGeral = 0;
		for (int i = 0; i < precos.length; i++) {
			System.out.print("Informe a quantidade de objetos vendidos " + (i+1) + ": ");
			quantidadeVendidaObjeto[i] = teclado.nextInt();

			System.out.print("Informe o preço do objeto para a posição " + (i+1) + ": ");
			precos[i] = teclado.nextDouble();
			
		}
		
		for (int i = 0; i < quantidadeVendidaObjeto.length; i++) {
			valorTotalVendas = quantidadeVendidaObjeto[i] * precos[i];
			System.out.println("Quantidade vendida do " + (i+1) + "º produto: " + quantidadeVendidaObjeto[i] + ", Valor do " + (i+1) + "º produto é R$ " + precos[i] + ", Total geral da venda: R$ " + valorTotalVendas);
			totalGeral += valorTotalVendas;
		}
		
		
		comissao = totalGeral * acrescido;
		System.out.println("Valor total das vendas: R$ " + totalGeral + ", Valor da comissão: R$ " + comissao);
		maior = quantidadeVendidaObjeto[0];
		ind = 0;
		for (int i = 0; i < precos.length; i++) {
			if (quantidadeVendidaObjeto[i] > maior) {
				maior = quantidadeVendidaObjeto[i];
				ind = i;
			}
		}
		
		salario += comissao;
		
		System.out.println("O salário do vendedor será: R$ " + salario);
		System.out.println("A maior quantidade encontrada foi " + maior + ", referente ao " + (ind+1) + "º produto.");
		
		teclado.close();
	}

}
