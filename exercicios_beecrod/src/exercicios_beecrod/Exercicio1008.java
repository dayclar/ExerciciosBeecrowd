package exercicios_beecrod;

import java.util.Scanner;

public class Exercicio1008 {
	public static void main(String[] args) {
		int num_funci, hrs_trabf;
		double valor_hr, salario;

		Scanner entrada = new Scanner(System.in);
		num_funci = entrada.nextInt();
		hrs_trabf = entrada.nextInt();
		valor_hr = entrada.nextDouble();

		salario = hrs_trabf * valor_hr;
		System.out.printf("NUMBER = %d\nSALARY = "
		 + "U$ %.2f\n", num_funci, salario);
	}

}