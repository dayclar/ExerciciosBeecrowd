package exercicios_beecrod;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1040 {
	public static void calculaMedia() {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0");
		double media;
		double nt[] = new double[4];
		nt[0] = teclado.nextDouble();
		nt[1] = teclado.nextDouble();
		nt[2] = teclado.nextDouble();
		nt[3] = teclado.nextDouble();

		media = ((nt[0] * 2) + (nt[1] * 3) + (nt[2] * 4) + (nt[3] * 1)) / 10;
		System.out.println("Media: " + format.format(media));
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5) {
			System.out.println("Aluno reprovado.");
		} else if (media >= 5 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			double vlExame = teclado.nextDouble();

			System.out.println("Nota do exame: " + format.format(vlExame));
			double mediaFinal = (vlExame + media) / 2;
			if (mediaFinal >= 5) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + format.format(mediaFinal));
			} else if (mediaFinal <= 4.9) {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + format.format(mediaFinal));
			}
		}
	}

	public static void main(String[] args) {
		calculaMedia();
	}
}