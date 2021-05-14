package exercicios;

public class LacoRepeticao {

	public static void main(String[] args) {
		
		String resultado = "";
		resultado += "Hoje vou aprender sobre repetição!\n";
		int contador = 1;
		
		for (int i = 0; i < 15; i++) {
			System.out.print(resultado);
		}
		
		do {
			System.out.print(resultado);
			contador++;
		} while (contador <= 15);
		
		while (contador <= 15) {
			System.out.print(resultado);
			contador++;
		}
	}

}
