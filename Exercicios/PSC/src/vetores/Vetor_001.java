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

			System.out.print("Informe o pre�o do objeto para a posi��o " + (i+1) + ": ");
			precos[i] = teclado.nextDouble();
			
		}
		
		for (int i = 0; i < quantidadeVendidaObjeto.length; i++) {
			valorTotalVendas = quantidadeVendidaObjeto[i] * precos[i];
			System.out.println("Quantidade vendida do " + (i+1) + "� produto: " + quantidadeVendidaObjeto[i] + ", Valor do " + (i+1) + "� produto � R$ " + precos[i] + ", Total geral da venda: R$ " + valorTotalVendas);
			totalGeral += valorTotalVendas;
		}
		
		
		comissao = totalGeral * acrescido;
		System.out.println("Valor total das vendas: R$ " + totalGeral + ", Valor da comiss�o: R$ " + comissao);
		maior = quantidadeVendidaObjeto[0];
		ind = 0;
		for (int i = 0; i < precos.length; i++) {
			if (quantidadeVendidaObjeto[i] > maior) {
				maior = quantidadeVendidaObjeto[i];
				ind = i;
			}
		}
		
		salario += comissao;
		
		System.out.println("O sal�rio do vendedor ser�: R$ " + salario);
		System.out.println("A maior quantidade encontrada foi " + maior + ", referente ao " + (ind+1) + "� produto.");
		
		teclado.close();
	}

}
