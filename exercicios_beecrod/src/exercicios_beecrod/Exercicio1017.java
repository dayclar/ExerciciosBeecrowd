package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1017 {
	public static void main(String[] args) {
		int tempo, velocidade;
		float qtdLitros;

		Scanner entrada = new Scanner(System.in);
		tempo = entrada.nextInt();
		velocidade = entrada.nextInt();

		qtdLitros = ((float) tempo * velocidade) / 12;
		System.out.printf("%.3f\n", qtdLitros);

	}

}
