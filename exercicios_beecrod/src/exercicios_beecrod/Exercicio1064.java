package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1064 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		float numero, qtdPositivo = 0, numerosPositivos = 0, media = 0;

		for (contador = 0; contador < 6; contador++) {
			numero = entrada.nextFloat();
			if (numero > 0) {
				qtdPositivo++;
				numerosPositivos += numero;
				media = numerosPositivos / qtdPositivo;
			}
		}
		System.out.printf("%.0f valores positivos\n", qtdPositivo);
		System.out.printf("%.1f\n", media);
	}
}