package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1041 {
	public static void main(String[] args) {
		double X, Y;
		Scanner entrada = new Scanner(System.in);
		X = entrada.nextDouble();
		Y = entrada.nextDouble();

		if (X == 0 && Y == 0) {
			System.out.println("Origem");
		} else if (X == 0) {
			System.out.println("Eixo Y");
		} else if (Y == 0) {
			System.out.println("Eixo X");
		} else if (X > 0 && Y > 0) {
			System.out.println("Q1");
		} else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		} else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		} else if (X > 0 && Y < 0) {
			System.out.println("Q4");
		}
	}
}
