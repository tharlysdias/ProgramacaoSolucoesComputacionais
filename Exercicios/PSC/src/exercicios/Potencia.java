package exercicios;

public class Potencia {

	public static void main(String[] args) {

		System.out.println(Math.pow(3, 5));

		// int potencia = 3 * 3 * 3 * 3 * 3; - não rola

		int base = 3;
		int expoente = 5;
		int potencia = 1;

		int contador = 1;
//		while (contador <= expoente) {
//			potencia *= base;
//			contador++;
//		}
//
//		System.out.println(potencia);

//		do {
//			potenciaWhile *= base;
//			contador++;
//		} while (contador <= expoenteWhile);
//		
//		System.out.println(potenciaWhile);
		
		for (int i = 1; i <= expoente; i++)
			potencia *= base;
		System.out.println(potencia);
	}

}
