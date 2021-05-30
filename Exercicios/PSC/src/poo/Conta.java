package poo;

import java.util.Date;

public class Conta {

	private int numero;
	private int digito;
	private double saldo;
	private double limite;
	private String cliente;
	private int agencia;
	private int banco;
	private String tipo;
	private boolean cheque;
	private Date dataAbertura;

	public void sacar(double valor) {
		if (this.saldo > 0) {
			System.out.println("Sacou dinheiro!  ->  " + this.toString());
			this.saldo -= valor;
		} else {
			System.out.println("Você não possui saldo suficiente!");
		}
	}

	public void depositar(double valor) {
		if (this.saldo > 0) {
			System.out.println("Depositou dinheiro ou cheque!");
			this.saldo += valor;
		} else {
			System.out.println("Você não pode depositar um valor menor ou igual a zero!");
		}
	}

	public void transferir(double valor) {
		if (this.saldo > 0) {
			System.out.println("Transferiu dinheiro!");
			this.saldo -= valor;
		} else {
			System.out.println("Você não pode transferir um valor menor ou igual a zero!");
		}
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public void pagarBoleto(double valor) {
		if (this.saldo > 0) {
			System.out.println("Pagou boleto!");
			this.saldo -= valor;
		} else {
			System.out.println("Você não possui saldo suficiente para pagar o boleto!");
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isCheque() {
		return cheque;
	}

	public void setCheque(boolean cheque) {
		this.cheque = cheque;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
