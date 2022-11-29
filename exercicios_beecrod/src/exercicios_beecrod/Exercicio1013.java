package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1013 {
	public static void main(String[] args) {
		int a, b, c, maiorAB, maiorFinal;

		Scanner entrada = new Scanner(System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();

		maiorAB = (a + b + Math.abs(a - b)) / 2;

		if (maiorAB == a) {
			maiorFinal = (a + c + Math.abs(a - c)) / 2;
		} else {
			maiorFinal = (b + c + Math.abs(b - c)) / 2;
		}
		System.out.println(maiorFinal + " eh o maior");
	}

}


