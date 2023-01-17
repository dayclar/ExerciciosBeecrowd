package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1065 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, par = 0;
		for (int x = 0; x < 5; x++) {
			num = entrada.nextInt();
			if (num % 2 == 0) {
				par++;
			}
		}
		System.out.println(par + " valores pares");
	}
}
