package poo;

public class Fabricante {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = carro2;
		
		carro1.setMarcaVeiculo("Fiat");

		carro1.ligar();
		carro1.acelerar();
		System.out.println(carro1.freiar());
		carro1.desligar();
		
		carro2.ligar();
		carro2.acelerar();
		System.out.println(carro2.freiar());
		carro2.desligar();
		
		carro3.ligar();
	}

}
