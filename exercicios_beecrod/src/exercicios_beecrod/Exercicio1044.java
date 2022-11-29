package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1044 {
	public static void main(String[] args) {
		int A, B, maior, menor;

		Scanner entrada = new Scanner(System.in);
		A = entrada.nextInt();
		B = entrada.nextInt();

		maior = Math.max(A, B);
		menor = Math.min(A, B);

		if (maior % menor == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
