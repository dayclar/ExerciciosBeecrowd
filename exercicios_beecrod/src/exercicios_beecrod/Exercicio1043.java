package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1043 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		double perimetro, area;
		if ((a > Math.abs(b - c) && a < b + c) && (b > Math.abs(a - c) && b < a + c)
				&& (c > Math.abs(a - b) && c < a + b)) {
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		} else {
			area = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f\n", area);
		}

	}
}
