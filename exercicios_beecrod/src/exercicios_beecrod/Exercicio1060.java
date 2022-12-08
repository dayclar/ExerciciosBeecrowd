package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1060 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		float numero, numeroPositivo = 0;

		for (contador = 0; contador < 6; contador++) {
			numero = entrada.nextFloat();
			if (numero > 0) {
				numeroPositivo++;
			}
		}
		System.out.printf("%.0f valores positivos\n", numeroPositivo);
	}
}