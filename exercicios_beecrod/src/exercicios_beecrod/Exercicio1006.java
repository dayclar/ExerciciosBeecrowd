package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1006 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;

		Scanner entrada = new Scanner(System.in);
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		nota3 = entrada.nextDouble();

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		System.out.printf("MEDIA = %.1f\n", media);
	}
}