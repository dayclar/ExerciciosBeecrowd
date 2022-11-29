package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1012 {
	public static void main(String[] args) {
		double A, B, C, areaTri, areaCirc, areaTrapz, areaQuad, areaRetang;

		Scanner entrada = new Scanner(System.in);
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		areaTri = (A * C) / 2;
		areaCirc = 3.14159 * (C * C);
		areaTrapz = ((A + B) * C) / 2;
		areaQuad = B * B;
		areaRetang = A * B;

		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRAD" + "O: %.3f\nRETANGULO: %.3f\n",
				areaTri, areaCirc, areaTrapz, areaQuad, areaRetang);

	}

}
