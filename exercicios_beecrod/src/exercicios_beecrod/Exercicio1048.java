package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1048 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double salario = entrada.nextDouble();

		double novoSalario, reajuste;

		if (salario >= 0 && salario <= 400.00) {
			novoSalario = salario + (salario * 0.15);
			reajuste = salario * 0.15;
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", novoSalario,
					reajuste);
		} else if (salario >= 400.01 && salario <= 800.00) {
			novoSalario = salario + (salario * 0.12);
			reajuste = salario * 0.12;
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", novoSalario,
					reajuste);
		} else if (salario >= 800.01 && salario <= 1200.00) {
			novoSalario = salario + (salario * 0.10);
			reajuste = salario * 0.10;
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", novoSalario,
					reajuste);
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			novoSalario = salario + (salario * 0.07);
			reajuste = salario * 0.07;
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", novoSalario, reajuste);
		} else if (salario > 2000.00) {
			novoSalario = salario + (salario * 0.04);
			reajuste = salario * 0.04;
			System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", novoSalario, reajuste);
		}
	}
}
