package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1009 {
	public static void main(String[] args) {
		String nome;
		double sl_fixo, total_vendas, total_receber;

		Scanner entrada = new Scanner(System.in);
		nome = entrada.nextLine();
		sl_fixo = entrada.nextDouble();
		total_vendas = entrada.nextDouble();

		total_receber = sl_fixo + (total_vendas * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n", total_receber);

	}
}

