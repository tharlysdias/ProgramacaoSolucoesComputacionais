package poo;

public class Main {

	public static void main(String[] args) {

		System.out.println("\nFabricante do carro\n");
		fabricante();
		
		System.out.println("\n\nSupermercado com produto\n");
		supermercado();

	}
	
	public static void supermercado() {
		
		Produto produto = new Produto();

		produto.gravar();
		produto.setCodigo(444);

		System.out.println("Produto -> " + produto.getCodigo());
	}

	public static void fabricante() {

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = carro2;

		carro1.setMarca("Fiat");

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
