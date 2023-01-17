package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1071 {
	public static void main(String[] args) {
		int X, Y, m, M, impares = 0;
		Scanner entrada = new Scanner(System.in);

		X = entrada.nextInt();
		Y = entrada.nextInt();

		m = Math.min(X, Y);
		M = Math.max(X, Y);
		for (int i = m + 1; i < M; i++) {
			if (Math.abs(i) % 2 != 0) {
				impares = impares + i;
			}
		}
		System.out.println(impares);
	}
}
