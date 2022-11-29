package exercicios_beecrod;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio1015 {
	public static void main(String[] args) {
		double X1, X2, Y1, Y2, result;

		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0000");

		X1 = entrada.nextDouble();
		Y1 = entrada.nextDouble();
		X2 = entrada.nextDouble();
		Y2 = entrada.nextDouble();

		result = Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2);
		System.out.println(format.format(Math.sqrt(result)));
	}

}
