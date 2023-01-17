package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1073 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N;
		N = entrada.nextInt();
		for (int X = 1; X <= N; X++) {
			if (X % 2 == 0) {
				System.out.println(X + "^2 = " + X * X);
			}
		}
	}
}
