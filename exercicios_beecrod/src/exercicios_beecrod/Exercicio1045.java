package exercicios_beecrod;

import java.util.Scanner;
import java.io.IOException;

public class Exercicio1045 {
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		double[] vl = { teclado.nextDouble(), teclado.nextDouble(), teclado.nextDouble() };

		for (int i = 1; i < vl.length; i++) {
			for (int j = 0; j < i; j++) {
				if (vl[i] > vl[j]) {
					double temp = vl[i];
					vl[i] = vl[j];
					vl[j] = temp;
				}
			}
		}
		if (vl[0] >= vl[1] + vl[2]) {
			System.out.println("NAO FORMA TRIANGULO");

		} else {

			if (Math.pow(vl[0], 2) == Math.pow(vl[1], 2) + Math.pow(vl[2], 2)) {
				System.out.println("TRIANGULO RETANGULO");

			}
			if (Math.pow(vl[0], 2) > Math.pow(vl[1], 2) + Math.pow(vl[2], 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");

			}
			if (Math.pow(vl[0], 2) < Math.pow(vl[1], 2) + Math.pow(vl[2], 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			if (vl[0] == vl[1] && vl[0] == vl[2] && vl[1] == vl[2]) {
				System.out.println("TRIANGULO EQUILATERO");

			}
			if ((vl[0] == vl[1] && vl[0] != vl[2]) || (vl[0] == vl[2] && vl[0] != vl[1])
					|| (vl[1] == vl[2] && vl[1] != vl[0])) {
				System.out.println("TRIANGULO ISOSCELES");

			}
		}
	}
}
