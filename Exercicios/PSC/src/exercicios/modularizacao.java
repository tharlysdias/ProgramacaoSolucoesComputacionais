package exercicios;

public class modularizacao {
	
	// Função
	public static int soma (int a, int b, int z, int r, int o) {
		return ((a + b) * 2) -z * r + 0;
	}
	
	// Procedimento
	public static void imprima (int d) {
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
		
		// x = 10 + 5;
		// y = 20 + 5;
		// z = 30 + 10;
		
		x = soma(10, 50, 20, 40, 10);
		y = soma(20, 5, 12, 20, 10);
		z = soma(30, 10, 20, 40, 10);
	
		imprima(x);
		imprima(y);
		imprima(z);
		
	}

}
