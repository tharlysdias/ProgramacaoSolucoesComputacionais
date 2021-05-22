package poo;

import java.util.Date;

public class Carro {

	private String marcaVeiculo;
	private String modeloVeiculo;
	private Date dataFabricacaoVeiculo;
	private double pesoVeiculo;
	private int quantidadeMarchaVeiculo;
	private int quantidadePortaVeiculo;

	public void ligar() {
		System.out.println("Ligar o carro!  ->  " + this.toString());
	}

	public void desligar() {
		System.out.println("Desligar o carro");
	}

	public void acelerar() {
		System.out.println("Acelerar o carro");
	}

	public String freiar() {
		return "Freiar o carro";
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public Date getDataFabricacaoVeiculo() {
		return dataFabricacaoVeiculo;
	}

	public void setDataFabricacaoVeiculo(Date dataFabricacaoVeiculo) {
		this.dataFabricacaoVeiculo = dataFabricacaoVeiculo;
	}

	public double getPesoVeiculo() {
		return pesoVeiculo;
	}

	public void setPesoVeiculo(double pesoVeiculo) {
		this.pesoVeiculo = pesoVeiculo;
	}

	public int getQuantidadeMarchaVeiculo() {
		return quantidadeMarchaVeiculo;
	}

	public void setQuantidadeMarchaVeiculo(int quantidadeMarchaVeiculo) {
		this.quantidadeMarchaVeiculo = quantidadeMarchaVeiculo;
	}

	public int getQuantidadePortaVeiculo() {
		return quantidadePortaVeiculo;
	}

	public void setQuantidadePortaVeiculo(int quantidadePortaVeiculo) {
		this.quantidadePortaVeiculo = quantidadePortaVeiculo;
	}

}
