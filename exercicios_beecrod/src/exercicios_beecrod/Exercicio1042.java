package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1042 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int A, B, C, min1, min2 = 0, min3 = 0;

		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();

		min1 = Math.min(A, Math.min(B, C));

		if (min1 == A) {
			min2 = Math.min(B, C);
			min3 = Math.max(B, C);
		}
		if (min1 == B) {
			min2 = Math.min(A, C);
			min3 = Math.max(A, C);
		}
		if (min1 == C) {
			min2 = Math.min(A, B);
			min3 = Math.max(A, B);
		}

		System.out.print(min1 + "\n" + min2 + "\n" + min3 + "\n\n");
		System.out.print(A + "\n" + B + "\n" + C + "\n");
	}
}