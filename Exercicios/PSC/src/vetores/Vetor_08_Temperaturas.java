package vetores;

import java.util.Scanner;

public class Vetor_08_Temperaturas {

	public static void main(String[] args) {
		
		/**
		 * 8. Faça um programa para receber as temperaturas durante uma semana.
		 * Ao final apresente:
		 * a. Maior temperatura e o dia;
		 * b. Menor temperatura e o dia;
		 * c. Média de temperatura;
		 * d. Dias da semana abaixo da média.
		 */
		
		int quantidade = 7;
		int temperaturas[] = new int[quantidade];
		String diasDaSemana[] = new String[quantidade];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Informe o dia da semana: ");
			diasDaSemana[i] = inputText();
			System.out.print("Informe a temperatura da(o) " + diasDaSemana[i] + ": ");
			temperaturas[i] = teclado.nextInt();
		}
		
		int maiorTemperatura = temperaturas[0], menorTemperatura = temperaturas[0], somaTemperaturas = 0, mediaTemperatura = 0;
//		Float mediaTemperatura = 0F;
		String diaMaiorTemp = null, diaMenorTemp = null;
		
		for (int i = 0; i < temperaturas.length; i++) {
			somaTemperaturas += temperaturas[i];
			if (temperaturas[i] >= maiorTemperatura) {
				maiorTemperatura = temperaturas[i];
				diaMaiorTemp = diasDaSemana[i];
			}
			if (temperaturas[i] <= menorTemperatura) {
				menorTemperatura = temperaturas[i];
				diaMenorTemp = diasDaSemana[i];
			}
		}
		
		mediaTemperatura = somaTemperaturas / temperaturas.length;
		
		for (int i = 0; i < diasDaSemana.length; i++) {
			if (temperaturas[i] < mediaTemperatura) {
				System.out.println("\nDia da semana abaixo da média: " + diasDaSemana[i]);
			}
		}
		
		System.out.println("\nMaior temperatura: " + maiorTemperatura + "°, na(o) " + diaMaiorTemp);
		System.out.println("Menor temperatura: " + menorTemperatura + "°, na(o) " + diaMenorTemp);
		System.out.println("Média de temperatura: " + mediaTemperatura + "°");
		
		teclado.close();
	}
	
	public static String inputText() {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		return texto;
	}

}
