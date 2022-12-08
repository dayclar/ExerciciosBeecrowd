package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1051 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario, taxa;
		salario = entrada.nextDouble();

		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario >= 2000.01 && salario <= 3000.00) {
			taxa = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f\n", taxa);
		} else if (salario >= 3000.01 && salario <= 4500.00) {
			taxa = 1000.00 * 0.08;
			taxa += (salario - 3000.00) * 0.18;
			System.out.printf("R$ %.2f\n", taxa);
		} else if (salario > 4500.00) {
			taxa = 1000.00 * 0.08;
			taxa += 1500.00 * 0.18;
			taxa += (salario - 4500.00) * 0.28;
			System.out.printf("R$ %.2f\n", taxa);
		}
	}

}
