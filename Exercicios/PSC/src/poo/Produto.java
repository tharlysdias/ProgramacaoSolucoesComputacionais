package poo;

import java.util.Date;

public class Produto {

	private int codigo;
	private String nome;
	private Date data;
	private int quantidade;
	private char cor;
	private double tamanho;
	private Date vencimento;
	private int qtdeMinima;
	private int qtdeMaxima;
	private int qtdeSeguranca;

	public void gravar() {
		this.codigo = 567;
		System.out.println("Inserir o produto!   ->>>>    " + this.toString());
	}

	public void excluir() {
		System.out.println("O produto foi excluido!");
	}

	public void alterar() {
		System.out.println("O produto foi alterado!");
	}

	public void entrar() {
		System.out.println("???");
	}

	public double saldo() {
		return 20D;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public char getCor() {
		return cor;
	}

	public void setCor(char cor) {
		this.cor = cor;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public int getQtdeMinima() {
		return qtdeMinima;
	}

	public void setQtdeMinima(int qtdeMinima) {
		this.qtdeMinima = qtdeMinima;
	}

	public int getQtdeMaxima() {
		return qtdeMaxima;
	}

	public void setQtdeMaxima(int qtdeMaxima) {
		this.qtdeMaxima = qtdeMaxima;
	}

	public int getQtdeSeguranca() {
		return qtdeSeguranca;
	}

	public void setQtdeSeguranca(int qtdeSeguranca) {
		this.qtdeSeguranca = qtdeSeguranca;
	}

}
