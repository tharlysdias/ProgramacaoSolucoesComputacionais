package poo;

import java.util.Date;

public class Carro {

	private Long id;
	private String marca;
	private double motor;
	private String modelo;
	private Date dataFabricacao;
	private double peso;
	private int quantidadeMarcha;
	private int quantidadePorta;
	private String placa;
	private String cor;
	private boolean isLigado = false;

	public void ligar() {
		if (this.isLigado == false) {
			this.isLigado = true;
			System.out.println("Ligar o carro!  ->  " + this.toString());			
		} else {
			System.out.println("O carro já está ligado!");
		}
	}

	public void desligar() {
		if (this.isLigado == true) {
			this.isLigado = false;
			System.out.println("Desligar o carro!");
		} else {
			System.out.println("O carro já está desligado!");
		}
	}

	public void acelerar() {
		System.out.println("Acelerar o carro");
	}

	public String freiar() {
		return "Freiar o carro";
	}
	
	public void abastecer() {
		if (this.isLigado == true) {
			System.out.println("Abastecer o carro!");			
		} else {
			System.out.println("Desligue o carro para abastecer!");
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getQuantidadeMarcha() {
		return quantidadeMarcha;
	}

	public void setQuantidadeMarcha(int quantidadeMarcha) {
		this.quantidadeMarcha = quantidadeMarcha;
	}

	public int getQuantidadePorta() {
		return quantidadePorta;
	}

	public void setQuantidadePorta(int quantidadePorta) {
		this.quantidadePorta = quantidadePorta;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

}
