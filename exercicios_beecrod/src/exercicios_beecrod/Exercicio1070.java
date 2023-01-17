package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1070 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int X, contador;

		X = entrada.nextInt();
		for (contador = 0; contador < 12; contador++) {

			if (X % 2 != 0) {
				System.out.println(X);
			}
			X++;
		}

	}
}
