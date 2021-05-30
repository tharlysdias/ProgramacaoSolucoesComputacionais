package poo.calculadora;

public class Dividir extends Calculadora {

	public Double calcular(Double primeiro, Double segundo) {
		Double resultado = 0D;
		if (segundo != 0D) {
			resultado = primeiro / segundo;
		} else {
			System.out.println("O segundo número não pode ser 0!");
		}
		return resultado;
	}
	
}
