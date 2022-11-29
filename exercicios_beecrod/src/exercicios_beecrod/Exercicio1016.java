package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1016 {
	public static void main(String[] args) {
		int distanciaKm, qtdMin;
		Scanner entrada = new Scanner(System.in);
		distanciaKm = entrada.nextInt();

		qtdMin = distanciaKm * 2;

		System.out.println(qtdMin + " minutos");
	}

}
