package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1037 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Double X = entrada.nextDouble();

		if (X >= 0 && X <= 25.0000) {
			System.out.printf("Intervalo [0,25]\n");

		} else if (X >= 25.00001 && X <= 50.0000000) {
			System.out.printf("Intervalo (25,50]\n");

		} else if (X >= 50.00001 && X <= 75.0000000) {
			System.out.printf("Intervalo (50,75]\n");

		} else if (X >= 75.00001 && X <= 100.0000000) {
			System.out.printf("Intervalo (75,100]\n");

		} else {
			System.out.printf("Fora de intervalo\n");
		}

	}
}