package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1020 {
	public static void main(String[] args) {
		int dias, anos, meses;

		Scanner entrada = new Scanner(System.in);
		dias = entrada.nextInt();

		anos = dias / 365;
		dias %= 365;
		meses = dias / 30;
		dias %= 30;
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos,meses,dias);
	}
}
