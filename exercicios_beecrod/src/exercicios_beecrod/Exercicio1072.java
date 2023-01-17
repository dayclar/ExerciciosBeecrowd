package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1072 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N, numeros = 0, in = 0, out = 0;
		N = entrada.nextInt();
		for (int X = 0; X < N; X++) {
			numeros = entrada.nextInt();
			if (numeros >= 10 && numeros <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.print(in + " in" + "\n" + out + " out" + "\n");
	}
}
